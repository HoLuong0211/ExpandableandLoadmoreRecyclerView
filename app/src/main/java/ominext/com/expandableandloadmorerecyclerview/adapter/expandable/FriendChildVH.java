package ominext.com.loopclone.adapter.expandable;

import android.view.View;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import ominext.com.loopclone.R;

/**
 * Created by LuongHH on 2/7/2017.
 */

class FriendChildVH extends ChildViewHolder {

    TextView tvName;
    RoundedImageView ivAvatar;

    FriendChildVH(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        ivAvatar = (RoundedImageView) itemView.findViewById(R.id.iv_avatar);
    }
}