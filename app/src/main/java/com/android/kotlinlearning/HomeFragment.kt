package com.android.kotlinlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController=findNavController()

        findMyAge_button.setOnClickListener(){
            navController.navigate(R.id.findMyAgeActivity)
        }
        calculator_button.setOnClickListener(){
            navController.navigate(R.id.calculator)
        }
        ticTacToyGame_button.setOnClickListener(){
            navController.navigate(R.id.ticTac)
        }

    }




}