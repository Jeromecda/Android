package com.example.racontemoiunehistoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Story(
    var prenom: String,
    var lieu: String,
    var genre: String
) : Parcelable
