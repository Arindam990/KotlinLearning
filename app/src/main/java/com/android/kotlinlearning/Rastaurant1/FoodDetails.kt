package com.android.kotlinlearning.Rastaurant1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.kotlinlearning.R
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val bundle=intent.extras
        if (bundle != null) {
            food_image.setImageResource(bundle.getInt("Image"))
            name_textView10.text=bundle.getString("name")
            des_textview.text=bundle.getString("des")
        }
    }
}