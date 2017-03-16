package ominext.com.expandableandloadmorerecyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import ominext.com.expandableandloadmorerecyclerview.R;
import ominext.com.expandableandloadmorerecyclerview.adapter.ChatGroupAdapter;
import ominext.com.expandableandloadmorerecyclerview.adapter.expandable.ParentExpandable;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.ChatGroup;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.Friend;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.Room;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response.ChatGroupResponse;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response.FriendData;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response.RoomData;
import ominext.com.expandableandloadmorerecyclerview.util.Utils;

import static ominext.com.expandableandloadmorerecyclerview.adapter.ChatGroupAdapter.FRIEND_VIEW_TYPE;
import static ominext.com.expandableandloadmorerecyclerview.adapter.ChatGroupAdapter.GROUP_VIEW_TYPE;

public class ExpandableRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandable_recycler_view);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        List<ParentExpandable> expandableList = getListChatGroup();
        ChatGroupAdapter adapter = new ChatGroupAdapter(this, expandableList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<ParentExpandable> getListChatGroup() {

        List<ChatGroup> chatGroupList = new ArrayList<>();

        List<Friend> friendList = getListFriend();
        for (int i = 0 ; i < friendList.size(); i++) {
            ChatGroup<Friend> chatGroup = new ChatGroup<>(FRIEND_VIEW_TYPE, friendList.get(i));
            chatGroupList.add(chatGroup);
        }

        ParentExpandable friendExpandable = new ParentExpandable("Friend", chatGroupList);

        List<Room> roomList = getListRoom();
        chatGroupList = new ArrayList<>();
        for (int i = 0 ; i < roomList.size(); i++) {
            ChatGroup<Room> chatGroup = new ChatGroup<>(GROUP_VIEW_TYPE, roomList.get(i));
            chatGroupList.add(chatGroup);
        }

        ParentExpandable roomExpandable = new ParentExpandable("Group", chatGroupList);

        List<ParentExpandable> expandableList = new ArrayList<>();
        expandableList.add(friendExpandable);
        expandableList.add(roomExpandable);
        return expandableList;
    }

    private List<Friend> getListFriend() {
        Type type = new TypeToken<ChatGroupResponse<FriendData>>() {}.getType();
        ChatGroupResponse response = new Gson().fromJson(Utils.LIST_FRIEND, type);
        return ((FriendData)(response.data)).list;
    }

    private List<Room> getListRoom() {
        Type type = new TypeToken<ChatGroupResponse<RoomData>>() {}.getType();
        ChatGroupResponse response = new Gson().fromJson(Utils.LIST_ROOM, type);
        return ((RoomData)(response.data)).list;
    }
}
