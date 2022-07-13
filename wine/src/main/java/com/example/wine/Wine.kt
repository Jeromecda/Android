package com.example.wine

enum class Type {
    BLANC, ROSE, ROUGE, CHAMPAGNE, VIN
}

class Wine(
    val name: String,
    val chateau: String,
    val year: Int,
    val type: Type
)