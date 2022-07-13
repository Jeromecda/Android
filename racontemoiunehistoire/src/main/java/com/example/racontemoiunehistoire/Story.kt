package com.example.racontemoiunehistoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Story(
    val prenom: String = "Simon",
    val lieu: String = "Chateau",
    val genre: String
) : Parcelable {

}
