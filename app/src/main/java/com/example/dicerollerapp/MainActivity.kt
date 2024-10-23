package com.example.dicerollerapp

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

    private fun initComponents(){
        btnRoll = findViewById(R.id.btnRoll)
        diceImage = findViewById(R.id.diceImage)
    }

    private fun initListeners(){
        btnRoll.setOnClickListener(){
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dado6caras = Dice(6)
        val diceRoll = dado6caras.roll()
        changeDiceImage(diceRoll)
    }

    private fun changeDiceImage(diceRoll: Int) {
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_one_svgrepo_com)
            2 -> diceImage.setImageResource(R.drawable.dice_two_svgrepo_com)
            3 -> diceImage.setImageResource(R.drawable.dice_three_svgrepo_com)
            4 -> diceImage.setImageResource(R.drawable.dice_four_svgrepo_com)
            5 -> diceImage.setImageResource(R.drawable.dice_five_svgrepo_com)
            6 -> diceImage.setImageResource(R.drawable.dice_six_svgrepo_com)
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