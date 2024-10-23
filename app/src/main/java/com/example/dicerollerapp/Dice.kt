package com.example.dicerollerapp

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }

    companion object {
        fun roll(dado: Dice) {

        }
    }
}