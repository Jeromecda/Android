package com.example.navigationsafeargs

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// to add Arguments in navigation.xml
@Parcelize
data class User(
    val prenom: String,
    val nom: String,
    val age: Int
) : Parcelable
