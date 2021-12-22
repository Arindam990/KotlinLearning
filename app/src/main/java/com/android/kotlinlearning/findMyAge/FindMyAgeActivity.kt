package com.android.kotlinlearning.findMyAge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.databinding.FindMyAgeLayoutBinding
import kotlinx.android.synthetic.main.find_my_age_layout.*
import java.util.*


class FindMyAgeActivity : Fragment() {
    private lateinit var binding: FindMyAgeLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FindMyAgeLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        buGetAge.setOnClickListener {
            // code will be execute when get my age button click
            val userDOB =
                Integer.parseInt(Date_of_Bath.text.toString())  // this is the transfer process of string to int
            // val userDOB=Date_of_Bath.text.toString()            // this is a string type that's why not getting
            val cYear = Calendar.getInstance().get(Calendar.YEAR)
            val finalResult = cYear - userDOB
            show_age.text = "Your age is $finalResult"
        }
    }


}

