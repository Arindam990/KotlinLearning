package com.android.kotlinlearning

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController



class HomeFragment1 : Fragment(R.layout.fragment_home1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController=findNavController()



 /*     send_button.setOnClickListener(){
            navController.navigate(R.id.sendMoneyFragment)
        }
       view_button.setOnClickListener(){
            navController.navigate(R.id.viewBalanceFragment)
        }
        transaction_button.setOnClickListener(){
            navController.navigate(R.id.viewTransactionFragment)
        }
*/
    }
}


