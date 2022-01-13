package com.android.kotlinlearning.calculator

import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.android.kotlinlearning.R
import kotlinx.android.synthetic.main.calculator_layout.*

class Calculator: Fragment(R.layout.calculator_layout){
    fun buNumberEvent(view: View) {
        if (isnewop == true) {
            display_layout.setText("")
        }
        isnewop = false
        val buSelect = view as Button
        var buClickValue: String = display_layout.text.toString()
        when (buSelect.id) {
            button_0.id -> {
                buClickValue += "0"
            }
            button_1.id -> {
                buClickValue += "1"
            }
            button_2.id -> {
                buClickValue += "2"
            }
            button_3.id -> {
                buClickValue += "3"
            }
            button_4.id -> {
                buClickValue += "4"
            }
            button_5.id -> {
                buClickValue += "5"
            }
            button_6.id -> {
                buClickValue += "6"
            }
            button_7.id -> {
                buClickValue += "7"
            }
            button_8.id -> {
                buClickValue += "8"
            }
            button_9.id -> {
                buClickValue += "9"
            }
            button_dot.id -> {
                buClickValue += ". "
            }
            plus_button.id -> {
                buClickValue = "-" + buClickValue

            }
        }
        display_layout.setText(buClickValue)
    }

    var op = "*"
    var oldNumber = ""
    var isnewop = true
    fun operetionEvent(view: View) {
        val buSelect = view as Button

        when (buSelect.id) {
            Multiply_button.id -> {
                op = "*"
            }
            divide_button.id -> {
                op = "/"
            }
            add_button.id -> {
                op = "+"
            }
            sub_button.id -> {
                op = "-"
            }
        }
        oldNumber = display_layout.text.toString()
        isnewop = true
    }

    fun resultEvent(view: View) {
        val newNumber = display_layout.text.toString()
        var finalNmber: Double? = null
        when (op) {
            "*" -> {
                finalNmber = oldNumber.toDouble() * newNumber.toDouble()
            }
            "/" -> {
                finalNmber = oldNumber.toDouble() / newNumber.toDouble()
            }
            "+" -> {
                finalNmber = oldNumber.toDouble() + newNumber.toDouble()
            }
            "-" -> {
                finalNmber = oldNumber.toDouble() - newNumber.toDouble()
            }
        }
        display_layout.setText(finalNmber.toString())
        isnewop = true
    }
}




