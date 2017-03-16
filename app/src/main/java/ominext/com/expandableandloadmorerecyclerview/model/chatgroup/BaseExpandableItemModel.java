package ominext.com.loopclone.model.friendlist;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Vinh on 11/8/2016.
 */

public class BaseExpandableItemModel<T extends BaseExpandableItemModel> implements Comparable<T>, Serializable {

    protected String uuid;
    protected int type;
    protected String text;
    protected String path;
    protected int treeDepth = 0;
    protected boolean expand;

    @SerializedName("count")
    protected int count;

    @SerializedName(value = "list_users", alternate = {"list_rooms", "list_members"})
    protected List<FriendListModel> children;

    protected int currentPage;
    protected int dataType;
//    protected FriendListFragment fragment;

    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<FriendListModel> getChildren() {
        return children;
    }

    public void setChildren(List<FriendListModel> children) {
        this.children = children;
    }

    public BaseExpandableItemModel(int type, String text, String path, String uuid,
                                   int treeDepth, List<FriendListModel> children) {
        super();
        this.type = type;
        this.text = text;
        this.uuid = uuid;
        this.path = path;
        this.treeDepth = treeDepth;
        this.children = children;
    }

    public BaseExpandableItemModel() {

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getTreeDepth() {
        return treeDepth;
    }

    public void setTreeDepth(int treeDepth) {
        this.treeDepth = treeDepth;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

//    public FriendListFragment getFragment() {
//        return fragment;
//    }
//
//    public void setFragment(FriendListFragment fragment) {
//        this.fragment = fragment;
//    }

    @Override
    public int compareTo(BaseExpandableItemModel another) {
        return this.getText().compareTo(another.getText());
    }
}
