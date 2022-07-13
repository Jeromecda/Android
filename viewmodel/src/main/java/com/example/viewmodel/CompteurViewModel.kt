package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// Equivalence Java -> public class CompteurViewModel extends ViewModel
class CompteurViewModel : ViewModel() {
    var compteur = MutableLiveData<Int>();  // before compteur = 0

    init {
        compteur.value = 0
    }

    fun increment() {
        compteur.value = compteur.value?.inc()
    }
    fun decrement() {
        compteur.value = compteur.value?.dec()
    }

    // fun increment() {
    //    return ++compteur;
    // }
    // fun increment() {
    //    = ++compteur
    // }
}
