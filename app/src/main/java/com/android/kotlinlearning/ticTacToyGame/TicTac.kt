package com.android.kotlinlearning.ticTacToyGame

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.kotlinlearning.R

class TicTac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tic_tac_layout)
    }

    fun buClick(view: View) {
        val buSelected = view as Button
        var celled = 0
        when (buSelected.id) {
            R.id.bu1 -> celled = 1
            R.id.bu2 -> celled = 2
            R.id.bu3 -> celled = 3
            R.id.bu4 -> celled = 4
            R.id.bu5 -> celled = 5
            R.id.bu6 -> celled = 6
            R.id.bu7 -> celled = 7
            R.id.bu8 -> celled = 8
            R.id.bu9 -> celled = 9
        }
        playGame(celled, buSelected)
    }

    var activePlayer = 1
    var player1 = arrayListOf<Int>()
    var player2 = arrayListOf<Int>()


    @SuppressLint("ResourceAsColor")
    fun playGame(celled: Int, buSelected: Button) {

        if (activePlayer == 1) {
            buSelected.text = "X"
            buSelected.setBackgroundColor(R.color.green)
            player1.add(celled)
            activePlayer = 2
        } else {
            buSelected.text = "0"
            buSelected.setBackgroundColor(R.color.aqua)
            player2.add(celled)
            activePlayer = 1
        }
        buSelected.isEnabled = false
        checkWiner()
    }

    fun checkWiner() {
        var winer = -1

        // row 1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winer = 2
        }

        // row 2
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winer = 1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winer = 2
        }
        // row 3
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winer = 2
        }
        // col 1
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winer = 2
        }
        // col 2
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winer = 1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winer = 2
        }
        // col 3
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winer = 2
        }
        // dia 1
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winer = 1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winer = 2
        }
        // dia 1
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winer = 1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winer = 2
        }
        if (winer == 1) {
            Toast.makeText(this, "Player 1 win the game", Toast.LENGTH_LONG).show()

        } else if (winer == 2) {
            Toast.makeText(this, "Player 2 win the game", Toast.LENGTH_LONG).show()
        }

    }


}

