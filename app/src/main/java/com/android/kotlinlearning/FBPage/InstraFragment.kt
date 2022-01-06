package com.android.kotlinlearning.FBPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import com.android.kotlinlearning.databinding.FragmentInstraBinding

class InstraFragment : Fragment(R.layout.fragment_instra) {
    private var binding: FragmentInstraBinding?=null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentInstraBinding.inflate(inflater,container,false)
        return binding!!.root
    }


}