package com.example.chiffrealeatoire

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.TrueRandomNumberGenerator)
        val min = findViewById<TextView>(R.id.Minimum)
        val max = findViewById<TextView>(R.id.Maximum)
        val buttonGenerate = findViewById<Button>(R.id.Generate)
        val resultat = findViewById<TextView>(R.id.Resu)


        buttonGenerate.setOnClickListener {
            val mini = min.text.toString().toInt()
            val maxi = max.text.toString().toInt()

            val random = Random.nextInt(mini, maxi)
            resultat.text = random.toString()
            Toast.makeText(
                this,
                "...",
                Toast.LENGTH_SHORT).show()
            Snackbar.make(it, R.string.app_name, Snackbar.LENGTH_SHORT).show()
        }
    }
}