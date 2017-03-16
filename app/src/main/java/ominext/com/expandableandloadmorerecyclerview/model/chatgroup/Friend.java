package ominext.com.loopclone.model.friendlist;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LuongHH on 2/7/2017.
 */

public class Friend {

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getTotalUnread() {
        return totalUnread;
    }

    public void setTotalUnread(int totalUnread) {
        this.totalUnread = totalUnread;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
}
