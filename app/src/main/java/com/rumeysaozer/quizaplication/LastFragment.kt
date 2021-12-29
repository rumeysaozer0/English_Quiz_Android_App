package com.rumeysaozer.quizaplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rumeysaozer.quizaplication.databinding.FragmentLastBinding


class LastFragment : Fragment() {
    private var _binding: FragmentLastBinding? = null
    private val binding get() = _binding!!
    private var correct=1
    private var questions = 1
    private var user = "Ayşe"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        _binding = FragmentLastBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            user = LastFragmentArgs.fromBundle(it).user
            correct = LastFragmentArgs.fromBundle(it).correct
            questions= LastFragmentArgs.fromBundle(it).questions

        }


        binding.userName.text = user
        binding.score.text = "Your Score is ${correct} out of ${questions}"

        binding.lastFinish.setOnClickListener {
            val action = LastFragmentDirections.actionLastFragmentToGirisFragment()
            findNavController().navigate(action)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}