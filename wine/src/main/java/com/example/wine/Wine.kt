package com.example.wine

enum class Type {
    BLANC, ROSE, ROUGE
}

class Wine(
    val name: String,
    val chateau: String,
    val sort: String,
    val year: Int,
    val type: Type
)