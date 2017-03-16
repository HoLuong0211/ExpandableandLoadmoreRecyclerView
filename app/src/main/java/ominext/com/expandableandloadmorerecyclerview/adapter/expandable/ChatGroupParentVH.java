package ominext.com.loopclone.adapter.expandable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import ominext.com.loopclone.R;

/**
 * Created by LuongHH on 2/8/2017.
 */

class FriendListParentVH extends GroupViewHolder {

    private ImageView ivIndicationArrow;
    TextView tvParentSectionTitle;

    FriendListParentVH(View itemView) {
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
