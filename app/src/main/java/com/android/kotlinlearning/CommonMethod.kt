package com.android.kotlinlearning

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions


class CommonMethod {
    private val requestOptions: RequestOptions =
        RequestOptions().circleCrop().placeholder(R.drawable.ic_baseline_account_circle_24)
            .error(R.drawable.ic_baseline_account_circle_24)
            .diskCacheStrategy(DiskCacheStrategy.ALL)

    fun setCircularImageUsingGlide(context: Context, imageView: ImageView, imageUrl: String?) {
        Glide.with(context)
            .load(imageUrl)
            .apply(requestOptions)
            .into(imageView)
    }


}