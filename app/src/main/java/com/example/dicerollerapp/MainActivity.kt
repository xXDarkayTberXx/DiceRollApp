package com.example.dicerollerapp

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    private lateinit var btnRoll: AppCompatButton
    private lateinit var diceImage : ImageView
    private lateinit var diceImage2 : ImageView

    private fun initComponents(){
        btnRoll = findViewById(R.id.btnRoll)
        diceImage = findViewById(R.id.diceImage)
        diceImage2 = findViewById(R.id.diceImage2)
    }

    private fun initListeners(){
        btnRoll.setOnClickListener(){
            Toast.makeText(this, "Dices Rolled!", Toast.LENGTH_LONG).show()
            rollDiceOne()
            rollDiceTwo()
        }
    }

    private fun rollDiceOne() {
        val dado6caras = Dice(6)
        val diceRoll = dado6caras.roll()
        changeDiceImage(diceImage, diceRoll)
    }

    private fun rollDiceTwo() {
        val dado6caras2 = Dice(6)
        val diceRoll = dado6caras2.roll()
        changeDiceImage(diceImage2, diceRoll)
    }

    private fun changeDiceImage(diceImageN: ImageView,diceRoll: Int) {
        when (diceRoll) {
            1 -> diceImageN.setImageResource(R.drawable.dice_one_svgrepo_com)
            2 -> diceImageN.setImageResource(R.drawable.dice_two_svgrepo_com)
            3 -> diceImageN.setImageResource(R.drawable.dice_three_svgrepo_com)
            4 -> diceImageN.setImageResource(R.drawable.dice_four_svgrepo_com)
            5 -> diceImageN.setImageResource(R.drawable.dice_five_svgrepo_com)
            6 -> diceImageN.setImageResource(R.drawable.dice_six_svgrepo_com)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }
}