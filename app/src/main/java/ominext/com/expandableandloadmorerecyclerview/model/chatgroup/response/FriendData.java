package ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.Friend;

/**
 * Created by LuongHH on 3/16/2017.
 */

public class FriendData implements Serializable {

    @SerializedName("count")
    public Integer count;

    @SerializedName("list_friends")
    public List<Friend> list = null;

    @SerializedName("order")
    public String order;
}
