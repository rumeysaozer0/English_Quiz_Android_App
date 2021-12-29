package com.rumeysaozer.quizaplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.rumeysaozer.quizaplication.databinding.FragmentGirisBinding


class GirisFragment : Fragment() {
    private var _binding: FragmentGirisBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    _binding = FragmentGirisBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startButton.setOnClickListener {
            if(binding.startNameEdit.text.toString().isEmpty()){
            Toast.makeText(requireContext(), "Please Enter Your Name", Toast.LENGTH_LONG).show()
            }
            else{

                val action = GirisFragmentDirections.actionGirisFragmentToSorularFragment(binding.startNameEdit.text.toString())
                findNavController().navigate(action)
            }
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}