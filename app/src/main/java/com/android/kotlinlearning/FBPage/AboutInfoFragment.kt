package com.android.kotlinlearning.FBPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentAboutInfoBinding

class AboutInfoFragment : Fragment(R.layout.fragment_about_info) {
    private var binding: FragmentAboutInfoBinding?=null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAboutInfoBinding.inflate(inflater,container,false)
        return binding!!.root
    }


}