package ominext.com.expandableandloadmorerecyclerview.model.chatgroup;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LuongHH on 2/8/2017.
 */

public class ChatGroup<T> implements Parcelable {

    private int chatGroupType;
    private T child;

    public ChatGroup(int chatGroupType, T child) {
        this.chatGroupType = chatGroupType;
        this.child = child;
    }

    protected ChatGroup(Parcel in) {
        chatGroupType = in.readInt();
    }

    public static final Creator<ChatGroup> CREATOR = new Creator<ChatGroup>() {
        @Override
        public ChatGroup createFromParcel(Parcel in) {
            return new ChatGroup(in);
        }

        @Override
        public ChatGroup[] newArray(int size) {
            return new ChatGroup[size];
        }
    };

    public int getChatGroupType() {
        return chatGroupType;
    }

    public T getChild() {
        return child;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(chatGroupType);
    }
}
