package com.android.kotlinlearning.findMyAge

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.kotlinlearning.R
import kotlinx.android.synthetic.main.find_my_age_layout.*
import java.util.*


class FindMyAgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_my_age_layout)

//        buGetAge.setOnClickListener {
//            // code will be execute when get my age button click
//            val userDOB =
//                Integer.parseInt(Date_of_Bath.text.toString())  // this is the transfer process of string to int
//            // val userDOB=Date_of_Bath.text.toString()            // this is a string type that's why not getting
//            val cYear = Calendar.getInstance().get(Calendar.YEAR)
//            val finalResult = cYear - userDOB
//            show_age.text = "Your age is $finalResult"
//        }
    }


}
