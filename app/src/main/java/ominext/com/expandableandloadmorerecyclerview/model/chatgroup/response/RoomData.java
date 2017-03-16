package ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.Room;

/**
 * Created by LuongHH on 3/16/2017.
 */

public class RoomData implements Serializable{

    @SerializedName("count")
    public Integer count;

    @SerializedName("list_rooms")
    public List<Room> list = null;

    @SerializedName("order")
    public String order;
}
