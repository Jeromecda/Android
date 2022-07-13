package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.serpro69.kfaker.faker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alBieres = arrayListOf<Biere>()
        val faker = faker{}

        for(b in 0..500) {
            alBieres.add(
                Biere(
                faker.beer.name(),
                    (33..50).random(),
                    faker.beer.style(),
                    5.5f
                )
            )
        }

            /* Biere("Two Hearted Ale",33,"English Brown Ale",6.0f),
            Biere("Storm King Stout",50,"Merican Ale",4.5f),
            Biere("Founders Kentucky Breakfast",33,"Dark Lager",7.5f),
            Biere("BrewDog Classic IPA",50,"Dark Lager",8.0f),
            Biere("Cuvée des Trolls",33,"English Pale Ale",7.8f), */

        val rv = findViewById<RecyclerView>(R.id.recyclerViewBieres)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = BiereAdapter(alBieres)
    }
}