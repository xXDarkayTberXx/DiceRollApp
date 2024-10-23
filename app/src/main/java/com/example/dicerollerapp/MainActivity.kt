package com.example.dicerollerapp

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnRoll: AppCompatButton
    private lateinit var tvNumber: TextView

    private fun initComponents(){
        btnRoll = findViewById(R.id.btnRoll)
        tvNumber = findViewById(R.id.tvNumber)
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
        tvNumber.text = diceRoll.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

}