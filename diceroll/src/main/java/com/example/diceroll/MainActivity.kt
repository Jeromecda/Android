package com.example.diceroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.diceroll.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: DiceViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(DiceViewModel::class.java)

        binding.diceText.text = viewModel.diceValue.toString()
        binding.editTextMaxFaces.setOnClickListener {
            viewModel.rollDice()
            binding.diceText.text = viewModel.diceValue.toString()
        }
    }
}

