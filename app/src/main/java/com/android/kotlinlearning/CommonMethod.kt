package com.android.kotlinlearning

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import java.text.SimpleDateFormat
import java.util.*


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
//    fun getDate(timestamp: Long) :String {
//        val calendar = Calendar.getInstance(Locale.ENGLISH)
//        calendar.timeInMillis = timestamp * 1000L
//        //val date = DateFormat.format("dd-MM-yyyy",calendar).toString()
//        val date = DateFormat.getDateInstance().format("\"dd-MM-yyyy\"")
//        return date
//    }

    public fun getDateTime(s: Long): String? {
        return try {
            val sdf = SimpleDateFormat("HH:mm:ss")
            val netDate = Date(s * 1000)
            sdf.format(netDate)
        } catch (e: Exception) {
            e.toString()
        }
    }


}