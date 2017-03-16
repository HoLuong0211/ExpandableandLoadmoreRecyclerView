package ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LuongHH on 3/16/2017.
 */

public class ChatGroupResponse {

    @SerializedName("error")
    public Integer error;

    @SerializedName("message")
    public String message;

    @SerializedName("data")
    public Data data;

    @SerializedName("detail")
    public Detail detail;
}
