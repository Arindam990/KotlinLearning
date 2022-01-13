package com.android.kotlinlearning

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_send_money.*


class sendMoneyFragment : Fragment(R.layout.fragment_send_money) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_button2.setOnClickListener {


            val recivername = receivername_text.text.toString()
            val args = Bundle()
            args.putString("name", recivername)
    /*        findNavController().navigate(R.id.cashFragment, args)
*/
        }
    }


}



