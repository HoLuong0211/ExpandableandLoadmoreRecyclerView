package ominext.com.expandableandloadmorerecyclerview.model.chatgroup;

import android.support.annotation.NonNull;

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

    protected List<T> children;

    public String getText() {
        return text;
    }

    public BaseExpandableItemModel(int type, String text, String path, String uuid,
                                   int treeDepth, List<T> children) {
        super();
        this.type = type;
        this.text = text;
        this.uuid = uuid;
        this.path = path;
        this.treeDepth = treeDepth;
        this.children = children;
    }

    @Override
    public int compareTo(@NonNull BaseExpandableItemModel another) {
        return this.getText().compareTo(another.getText());
    }
}
