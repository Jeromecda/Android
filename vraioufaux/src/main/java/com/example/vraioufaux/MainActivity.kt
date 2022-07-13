package com.example.vraioufaux

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.vraioufaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    val arrayListQR = arrayListOf(
        QuestionReponse("Est-ce le ciel est bleu ?", true),
        QuestionReponse("Est-ce qu'il faut dormir pour vivre ?", true),
        QuestionReponse("Est-ce qu'il fait chaud ?", true),
        QuestionReponse("Est-ce qu'il faut faire les courses ?", false),
        QuestionReponse("Est-ce bien vous ?", false),
        QuestionReponse("Est-il l'élu ?", true)
    )
    var index = 0
    var score = 0
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.qr = arrayListQR[index]
        showScore()
        binding.buttonFalse.setOnClickListener { checkUserResponse(false) }
        binding.buttonTrue.setOnClickListener { checkUserResponse(true) }
    }
    fun checkUserResponse(responseUser: Boolean) {
        if(responseUser == arrayListQR[index].response) {
            // il a raison score++
            score++
            showScore()
            binding.textViewTentative.text = score.toString()
        }
        if(index++ < arrayListQR.size -1) {
            binding.qr = arrayListQR[index]
        }
    }
    fun showScore() {
        binding.textViewTentative.text = "${score.toString()}/${arrayListQR.size}"
    }
}