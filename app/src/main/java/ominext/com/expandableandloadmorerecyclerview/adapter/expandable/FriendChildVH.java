package ominext.com.expandableandloadmorerecyclerview.adapter.expandable;

import android.view.View;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import ominext.com.expandableandloadmorerecyclerview.R;

/**
 * Created by LuongHH on 2/7/2017.
 */

public class FriendChildVH extends ChildViewHolder {

    public TextView tvName;
    public RoundedImageView ivAvatar;

    public FriendChildVH(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        ivAvatar = (RoundedImageView) itemView.findViewById(R.id.iv_avatar);
    }
}
