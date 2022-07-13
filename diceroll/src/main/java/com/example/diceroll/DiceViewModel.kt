package com.example.diceroll

import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    var diceValue = 1
    var diceNumber = 6

    fun rollDice() {
        diceValue = (1..diceNumber).random()
    }
    fun setMaxNumber(diceNumber : Int) {
        this.diceNumber = diceNumber
    }
}