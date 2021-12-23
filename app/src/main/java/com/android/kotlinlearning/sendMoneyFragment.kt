package com.android.kotlinlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import kotlinx.android.synthetic.main.fragment_send_money.*


class sendMoneyFragment : Fragment(R.layout.fragment_send_money) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       next_button2.setOnClickListener{

           val navOption= navOptions{
           }


           val recivername=receivername_text.text.toString()
           val args=Bundle()
           args.putString("name",recivername)
           findNavController().navigate(R.id.cashFragment2,args)

       }
    }



    }



