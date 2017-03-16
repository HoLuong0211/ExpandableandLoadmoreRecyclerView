package ominext.com.expandableandloadmorerecyclerview.model.chatgroup;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LuongHH on 2/7/2017.
 */

public class Friend extends BaseExpandableItemModel{

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;

    @SerializedName("nickname")
    public String nickname;

    @SerializedName("avatar")
    public String avatar;

    @SerializedName("room_id")
    public String roomId;

    @SerializedName("total_unread")
    public int totalUnread;

    @SerializedName("last_message")
    public String lastMessage;

    @SerializedName("show_time")
    public String showTime;

    public Friend(int type, String text, String path, String uuid, int treeDepth, List children) {
        super(type, text, path, uuid, treeDepth, children);
    }
}
