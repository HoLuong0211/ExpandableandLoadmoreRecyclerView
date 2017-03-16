package ominext.com.expandableandloadmorerecyclerview.model.chatgroup;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LuongHH on 2/7/2017.
 */

public class Friend extends BaseExpandableItemModel{

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("total_unread")
    private int totalUnread;

    @SerializedName("last_message")
    private String lastMessage;

    @SerializedName("show_time")
    private String showTime;

    public Friend(int type, String text, String path, String uuid, int treeDepth, List children) {
        super(type, text, path, uuid, treeDepth, children);
    }
}
