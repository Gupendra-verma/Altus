package com.example.altus.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.altus.R
import com.example.altus.databinding.FragmentEthereumMinerBinding

private lateinit var binding1: FragmentEthereumMinerBinding
class EthereumMinerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding1 = FragmentEthereumMinerBinding.inflate(inflater, container, false)

        binding1.buyBtn1.setOnClickListener{
            findNavController().navigate(R.id.action_ethereumMinerFragment_to_paymentFragment)
        }

        binding1.buyBtn2.setOnClickListener{
            findNavController().navigate(R.id.action_ethereumMinerFragment_to_paymentFragment)
        }

        binding1.buyBtn3.setOnClickListener{
            findNavController().navigate(R.id.action_ethereumMinerFragment_to_paymentFragment)
        }

        binding1.withdrawBtn1.setOnClickListener {
            findNavController().navigate(R.id.action_ethereumMinerFragment_to_withdrawEthFragment)
        }

        binding1.withdrawBtn2.setOnClickListener {
            findNavController().navigate(R.id.action_ethereumMinerFragment_to_withdrawEthFragment)
        }

        binding1.withdrawBtn3.setOnClickListener {
            findNavController().navigate(R.id.action_ethereumMinerFragment_to_withdrawEthFragment)
        }



        return binding1.root
    }


}