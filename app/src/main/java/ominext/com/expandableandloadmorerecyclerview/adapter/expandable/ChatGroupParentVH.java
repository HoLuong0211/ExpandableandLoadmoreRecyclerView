package ominext.com.expandableandloadmorerecyclerview.adapter.expandable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import ominext.com.expandableandloadmorerecyclerview.R;

/**
 * Created by LuongHH on 2/8/2017.
 */

public class ChatGroupParentVH extends GroupViewHolder {

    private ImageView ivIndicationArrow;
    public TextView tvParentSectionTitle;

    public ChatGroupParentVH(View itemView) {
        super(itemView);
        ivIndicationArrow = (ImageView) itemView.findViewById(R.id.exp_indication_arrow);
        tvParentSectionTitle = (TextView) itemView.findViewById(R.id.exp_parent_section_title);
    }

    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        ivIndicationArrow.animate().rotation(90f).setDuration(300).start();
    }

    private void animateCollapse() {
        ivIndicationArrow.animate().rotation(0f).setDuration(300).start();
    }
}
