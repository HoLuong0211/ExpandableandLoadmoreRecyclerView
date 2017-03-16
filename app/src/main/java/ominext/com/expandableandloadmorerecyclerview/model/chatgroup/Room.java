package ominext.com.expandableandloadmorerecyclerview.model.chatgroup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LuongHH on 3/16/2017.
 */

public class Room extends BaseExpandableItemModel{

    @SerializedName("id")
    @Expose
    public Integer id;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("avatar")
    @Expose
    public String avatar;

    @SerializedName("total_unread")
    @Expose
    public Integer totalUnread;

    @SerializedName("is_creator")
    @Expose
    public Integer isCreator;

    @SerializedName("last_message")
    @Expose
    public String lastMessage;

    @SerializedName("show_time")
    @Expose
    public String showTime;

    public Room(int type, String text, String path, String uuid, int treeDepth, List children) {
        super(type, text, path, uuid, treeDepth, children);
    }
}
