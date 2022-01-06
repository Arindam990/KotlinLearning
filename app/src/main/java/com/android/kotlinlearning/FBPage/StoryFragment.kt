package com.android.kotlinlearning.FBPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentStoryBinding

class StoryFragment : Fragment(R.layout.fragment_story) {
    private var binding: FragmentStoryBinding?=null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentStoryBinding.inflate(inflater,container,false)
        return binding!!.root
    }


}