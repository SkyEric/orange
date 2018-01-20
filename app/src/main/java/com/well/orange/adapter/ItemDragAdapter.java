package com.well.orange.adapter;

import com.well.orange.R;
import com.well.orange.adapter.base.BaseQuickAdapter;
import com.well.orange.adapter.base.BaseViewHolder;

import java.util.List;

public class ItemDragAdapter extends BaseQuickAdapter<String> {
    public ItemDragAdapter(List data) {
        super(R.layout.item_draggable_view, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tv, item);
    }
}
