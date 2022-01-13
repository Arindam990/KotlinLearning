package com.android.kotlinlearning.FBPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentProfilepicBinding
import com.bumptech.glide.Glide


class ProfilepicFragment : Fragment(R.layout.fragment_profilepic) {
    private var binding:FragmentProfilepicBinding?=null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentProfilepicBinding.inflate(inflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageurl = arguments?.getString("url")
        binding?.let {
            Glide.with(this)
                .load(imageurl)
                .into(it.profilepicImageView)
        }

    }


}