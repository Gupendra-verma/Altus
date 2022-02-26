package com.example.altus.fragment.miners

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import com.example.altus.R
import com.example.altus.databinding.FragmentMinersBinding

lateinit var binding:FragmentMinersBinding
class MinersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMinersBinding.inflate(inflater, container,false)

        binding.bitcoinLayout.setOnClickListener{
            findNavController().navigate(R.id.action_minersFragment_to_bitcoinMinerFragment)
        }

        binding.ethereumLayout.setOnClickListener{
            findNavController().navigate(R.id.action_minersFragment_to_ethereumMinerFragment)
        }

        binding.graph.setOnClickListener {
            findNavController().navigate(R.id.action_minersFragment_to_minersPowerFragment)
        }

//        findNavController().popBackStack(R.id.splashFragment,true)

        return binding.root
    }

}