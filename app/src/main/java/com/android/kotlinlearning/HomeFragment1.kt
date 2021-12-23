package com.android.kotlinlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home1.*



class HomeFragment1 : Fragment(R.layout.fragment_home1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController=findNavController()



       send_button.setOnClickListener(){
            navController.navigate(R.id.sendMoneyFragment)
        }
       view_button.setOnClickListener(){
            navController.navigate(R.id.viewBalanceFragment)
        }
        transaction_button.setOnClickListener(){
            navController.navigate(R.id.viewTransactionFragment)
        }

    }
}


