package ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.BaseExpandableItemModel;

/**
 * Created by LuongHH on 3/16/2017.
 */

public class Data<T extends BaseExpandableItemModel> {

    @SerializedName("count")
    public Integer count;

    @SerializedName(value = "list_friends", alternate = "list_rooms")
    public List<T> list = null;

    @SerializedName("order")
    public String order;
}
