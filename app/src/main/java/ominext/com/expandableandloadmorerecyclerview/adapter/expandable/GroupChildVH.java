package ominext.com.loopclone.adapter.expandable;

import android.view.View;
import android.widget.TextView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import ominext.com.loopclone.R;

/**
 * Created by LuongHH on 2/8/2017.
 */

class RoomChildVH extends ChildViewHolder {

    TextView tvName, tvLastMessage, tvTime;
    RoundedImageView ivAvatar;

    RoomChildVH(View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        tvLastMessage = (TextView) itemView.findViewById(R.id.tv_last_message);
        tvTime = (TextView) itemView.findViewById(R.id.tv_time);
        ivAvatar = (RoundedImageView) itemView.findViewById(R.id.iv_avatar);
    }
}
