package com.asdf.myapplication;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/**
 * Created by Hsiung on 2017/9/14.
 */

public class UserCenterAdapter extends BaseQuickAdapter<Bean.DataBean.IconBean, BaseViewHolder> {
    public UserCenterAdapter(@LayoutRes int layoutResId, @Nullable List<Bean.DataBean.IconBean> data) {
        super(layoutResId, data);
    }
    @Override
    protected void convert(BaseViewHolder baseViewHolder, Bean.DataBean.IconBean iconBean) {
        baseViewHolder.setText(R.id.tv_title, iconBean.getTitle());
        Log.i(TAG, "convertpic--->"+iconBean.getPic());
        Glide.with(mContext).load(R.drawable.sample_footer_loading).into((ImageView) baseViewHolder.getView(R.id.iv_img));
        String extra_img = iconBean.getExtra_img();
        if(!TextUtils.isEmpty(extra_img)){
            Glide.with(mContext).load(R.drawable.sample_footer_loading).into((ImageView) baseViewHolder.getView(R.id.iv_extra));
        }
    }
}
