package ominext.com.expandableandloadmorerecyclerview.adapter.expandable;

import android.view.View;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import ominext.com.expandableandloadmorerecyclerview.R;

/**
 * Created by LuongHH on 2/8/2017.
 */

class GroupChildVH extends ChildViewHolder {

    TextView tvName, tvLastMessage, tvTime;
    RoundedImageView ivAvatar;

    GroupChildVH(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        tvLastMessage = (TextView) itemView.findViewById(R.id.tv_last_message);
        tvTime = (TextView) itemView.findViewById(R.id.tv_time);
        ivAvatar = (RoundedImageView) itemView.findViewById(R.id.iv_avatar);
    }
}
