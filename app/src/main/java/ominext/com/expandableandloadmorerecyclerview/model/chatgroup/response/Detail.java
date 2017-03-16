package ominext.com.expandableandloadmorerecyclerview.model.chatgroup.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by LuongHH on 3/16/2017.
 */

public class Detail {

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("message")
    @Expose
    public String message;
}
