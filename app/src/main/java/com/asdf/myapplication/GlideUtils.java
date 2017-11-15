package com.asdf.myapplication;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author Adminster
 * @description
 * @date 2017/8/29
 */

public class GlideUtils {
//    public static void load(Context context, String url, ImageView iv) {
//        GlideApp.with(context)
//                .load(url)
//                .apply(new RequestOptions()
//                        .placeholder(R.mipmap.placeholder)
//                        .error(R.mipmap.placeholder)
//                        .priority(Priority.HIGH)
//                )
//                .into(iv)
//        ;
//    }
//    public static void loadCircleImageView(Context context, String url, ImageView iv) {
//        GlideApp.with(context)
//                .load(url)
//                .into(iv)
//        ;
//    }
//
//    public static void load(Context context, String url, ImageView iv, int placeHolderResId) {
//        Glide.with(context)
//                .load(url)
//                .apply(new RequestOptions()
//                        .placeholder(R.mipmap.app_logo)
//                        .error(R.mipmap.app_logo)
//                        .priority(Priority.HIGH)
//                ).into(iv);
//
//    }

//    public static void loadRound(final Context context, String url, final ImageView iv) {
//        Glide.with(context)//
//                .load(url)//
//                .asBitmap()//
//                .placeholder(R.mipmap.app_logo)//
//                .centerCrop()//
//                .into(new BitmapImageViewTarget(iv) {
//                    @Override
//                    protected void setResource(Bitmap resource) {
//                        RoundedBitmapDrawable circularBitmapDrawable =
//                                RoundedBitmapDrawableFactory.create(context.getResources(), resource);
//                        circularBitmapDrawable.setCircular(true);
//                        iv.setImageDrawable(circularBitmapDrawable);
//                    }
//                });
//    }





    public static void load(final Context context, String url, final ImageView iv) {
        Glide.with(context)//
                .load(url)//
                .asBitmap()
                .centerCrop()//
                .into(iv);
    }

}
