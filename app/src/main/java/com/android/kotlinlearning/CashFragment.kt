package com.android.kotlinlearning

//import com.android.kotlinlearning.databinding.ActivityMainBinding.inflate
//import com.android.kotlinlearning.databinding.FindMyAgeLayoutBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


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
        //textView4.text = "send cash to $receiverName"

      /*  send_button.setOnClickListener {
            findNavController().navigate(R.id.dialogFragment)
        }
*/

    }


}











