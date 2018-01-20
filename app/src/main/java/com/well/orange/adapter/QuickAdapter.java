package com.well.orange.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.well.orange.R;
import com.well.orange.adapter.base.BaseQuickAdapter;
import com.well.orange.adapter.base.BaseViewHolder;
import com.well.orange.data.DataServer;
import com.well.orange.entity.Status;
import com.well.orange.transform.GlideCircleTransform;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class QuickAdapter extends BaseQuickAdapter<Status> {
    public QuickAdapter() {
        super(R.layout.tweet, DataServer.getSampleData(100));
    }

    public QuickAdapter(int dataSize) {
        super(R.layout.tweet, DataServer.getSampleData(dataSize));
    }

    @Override
    protected void convert(BaseViewHolder helper, Status item) {
        helper.setText(R.id.tweetName, item.getUserName())
                .setText(R.id.tweetText, item.getText())
                .setText(R.id.tweetDate, item.getCreatedAt())
                .setVisible(R.id.tweetRT, item.isRetweet())
                .setOnClickListener(R.id.tweetAvatar, new OnItemChildClickListener())
                .setOnClickListener(R.id.tweetName, new OnItemChildClickListener())
                .linkify(R.id.tweetText);

        Glide.with(mContext).load(item.getUserAvatar()).crossFade().placeholder(R.mipmap.def_head).transform(new GlideCircleTransform(mContext)).into((ImageView) helper.getView(R.id.tweetAvatar));
    }


}
