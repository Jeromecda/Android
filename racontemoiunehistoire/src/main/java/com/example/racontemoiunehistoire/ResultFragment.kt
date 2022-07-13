package com.example.racontemoiunehistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resultFragmentArgs = arguments?.let { ResultFragmentArgs.fromBundle(it) }
        val textView = view.findViewById<TextView>(R.id.textViewResult)
        textView.text = "Il était une fois l'histoire de ${resultFragmentArgs?.story?.prenom}" +
                ", il vivait dans la douce contrée de ${resultFragmentArgs?.story?.lieu}"
    }

}