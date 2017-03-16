package ominext.com.expandableandloadmorerecyclerview.adapter.expandable;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import ominext.com.expandableandloadmorerecyclerview.model.chatgroup.ChatGroup;

/**
 * Created by LuongHH on 2/8/2017.
 */

public class ParentExpandable extends ExpandableGroup<ChatGroup> {

    public ParentExpandable(String title, List<ChatGroup> items) {
        super(title, items);
    }
}
