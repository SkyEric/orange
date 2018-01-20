package com.well.orange.adapter;

import android.content.Context;

import com.well.orange.R;
import com.well.orange.adapter.base.BaseMultiItemQuickAdapter;
import com.well.orange.adapter.base.BaseViewHolder;
import com.well.orange.entity.MultipleItem;

import java.util.List;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class MultipleItemQuickAdapter extends BaseMultiItemQuickAdapter<MultipleItem> {

    public MultipleItemQuickAdapter(Context context, List data) {
        super(data);
        addItemType(MultipleItem.TEXT, R.layout.item_text_view);
        addItemType(MultipleItem.IMG, R.layout.item_image_view);
        addItemType(MultipleItem.IMGS, R.layout.item_image_views);
    }

    @Override
    protected void convert(BaseViewHolder helper, MultipleItem item) {
        switch (helper.getItemViewType()) {
            case MultipleItem.TEXT:
                helper.setText(R.id.tv, item.getContent());
                break;
            case MultipleItem.IMG:
                // set img data
                break;
            case MultipleItem.IMGS:
                // set imgs data
                break;
        }
    }

}
