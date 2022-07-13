package com.example.racontemoiunehistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.racontemoiunehistoire.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    lateinit var binding: FragmentResultBinding
    lateinit var vm: StoryViewModel
    val args: ResultFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentResultBinding.inflate(inflater, container, false)
        vm = ViewModelProvider(this).get(StoryViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val resultFragmentArgs = arguments?.let { ResultFragmentArgs.fromBundle(it) }
        vm.setStory(args.story)
        //vm.story.observe(viewLifecycleOwner, Observer { binding.story = it })
        binding.confirmChange.setOnClickListener {
            vm.setPrenom(binding.editTextTextPersonName2.text.toString())
        }
    }
}