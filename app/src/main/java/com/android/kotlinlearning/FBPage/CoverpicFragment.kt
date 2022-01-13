package com.android.kotlinlearning.FBPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentCoverpicBinding
import com.bumptech.glide.Glide

class CoverpicFragment : Fragment(R.layout.fragment_coverpic) {
    private var binding: FragmentCoverpicBinding?=null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCoverpicBinding.inflate(inflater,container,false)
        return binding!!.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageurl1 = arguments?.getString("coverpic url")
        binding?.let {
            Glide.with(this)
                .load(imageurl1)
                .into(it.coverpicImageView)
        }

    }


}