package com.android.kotlinlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navOptions
//import com.android.kotlinlearning.databinding.ActivityMainBinding.inflate
//import com.android.kotlinlearning.databinding.FindMyAgeLayoutBinding
import kotlinx.android.synthetic.main.find_my_age_layout.*
import kotlinx.android.synthetic.main.fragment_cash.*
import kotlinx.android.synthetic.main.fragment_dialog.*
import kotlinx.android.synthetic.main.fragment_send_money.*
import kotlinx.android.synthetic.main.fragment_view_transaction.*
import com.android.kotlinlearning.CashFragment as CashFragment1


class CashFragment : Fragment(R.layout.fragment_cash) {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val receiverName = arguments?.getString("name")
        textView4.text = "send cash to $receiverName"

        send_button.setOnClickListener {
            findNavController().navigate(R.id.dialogFragment)
        }


    }


}











