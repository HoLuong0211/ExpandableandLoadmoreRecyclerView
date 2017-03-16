package ominext.com.expandableandloadmorerecyclerview.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.thoughtbot.expandablerecyclerview.MultiTypeExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.models.ExpandableListPosition;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import java.util.List;

import ominext.com.expandableandloadmorerecyclerview.R;
import ominext.com.expandableandloadmorerecyclerview.adapter.expandable.ChatGroupParentVH;
import ominext.com.expandableandloadmorerecyclerview.adapter.expandable.FriendChildVH;
import ominext.com.expandableandloadmorerecyclerview.adapter.expandable.ParentExpandable;
import ominext.com.expandableandloadmorerecyclerview.adapter.expandable.RoomChildVH;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.Friend;
import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.Room;

/**
 * Created by LuongHH on 2/8/2017.
 */

public class ChatGroupAdapter extends MultiTypeExpandableRecyclerViewAdapter<ChatGroupParentVH, ChildViewHolder> {

    public static final int FRIEND_VIEW_TYPE = 3;
    public static final int GROUP_VIEW_TYPE = 4;

    private Context mContext;

    public ChatGroupAdapter(Context context, List<ParentExpandable> groups) {
        super(groups);
        this.mContext = context;
    }

    @Override
    public ChatGroupParentVH onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.item_header, parent, false);
        final ChatGroupParentVH holder = new ChatGroupParentVH(itemView);
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                onGroupClick(holder.getAdapterPosition());
                holder.expand();
            }
        });
        return holder;
    }

    @Override
    public ChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        switch (viewType) {
            case FRIEND_VIEW_TYPE:
                itemView = LayoutInflater.from(mContext)
                        .inflate(R.layout.item_friend, parent, false);
                return new FriendChildVH(itemView);
            case GROUP_VIEW_TYPE:
                itemView = LayoutInflater.from(mContext)
                        .inflate(R.layout.item_group, parent, false);
                return new RoomChildVH(itemView);
            default:
                throw new IllegalArgumentException("Invalid viewType");
        }
    }

    @Override
    public void onBindChildViewHolder(ChildViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        int viewType = getItemViewType(flatPosition);
        switch (viewType) {
            case FRIEND_VIEW_TYPE:
                FriendChildVH friendChildVH = (FriendChildVH) holder;
                Friend friend = (Friend) ((ParentExpandable)group).getItems().get(childIndex).getChild();
                friendChildVH.tvName.setText(friend.name);
                Glide.with(mContext)
                        .load(friend.avatar)
                        .into(friendChildVH.ivAvatar);
                break;
            case GROUP_VIEW_TYPE:
                RoomChildVH roomChildVH = (RoomChildVH) holder;
                Room room = (Room) ((ParentExpandable)group).getItems().get(childIndex).getChild();
                roomChildVH.tvName.setText(room.name);
                roomChildVH.tvLastMessage.setText(room.lastMessage);
                roomChildVH.tvTime.setText(room.showTime);
                Glide.with(mContext)
                        .load(room.avatar)
                        .into(roomChildVH.ivAvatar);
                break;
        }
    }

    @Override
    public void onBindGroupViewHolder(ChatGroupParentVH holder, int flatPosition, ExpandableGroup group) {
        holder.tvParentSectionTitle.setText((group.getTitle()));
    }

    @Override
    public int getChildViewType(int position, ExpandableGroup group, int childIndex) {
        return ((ParentExpandable) group).getItems().get(childIndex).getChatGroupType();
    }

    @Override
    public boolean isGroup(int viewType) {
        return viewType == ExpandableListPosition.GROUP;
    }

    @Override
    public boolean isChild(int viewType) {
        return viewType == FRIEND_VIEW_TYPE || viewType == GROUP_VIEW_TYPE;
    }
}
