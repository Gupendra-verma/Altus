package com.example.altus.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.altus.R
import com.example.altus.databinding.FragmentBitcoinMinerBinding

lateinit var binding:FragmentBitcoinMinerBinding
class BitcoinMinerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentBitcoinMinerBinding.inflate(inflater, container, false)

      binding.buyBtn1.setOnClickListener{
          findNavController().navigate(R.id.action_bitcoinMinerFragment_to_paymentFragment)
      }

        binding.buyBtn2.setOnClickListener{
            findNavController().navigate(R.id.action_bitcoinMinerFragment_to_paymentFragment)
        }

        binding.buyBtn3.setOnClickListener{
            findNavController().navigate(R.id.action_bitcoinMinerFragment_to_paymentFragment)
        }

        binding.withdrawBtn1.setOnClickListener {
            findNavController().navigate(R.id.action_bitcoinMinerFragment_to_withdrawBtcFragment)
        }

        binding.withdrawBtn2.setOnClickListener {
            findNavController().navigate(R.id.action_bitcoinMinerFragment_to_withdrawBtcFragment)
        }

        binding.withdrawBtn3.setOnClickListener {
            findNavController().navigate(R.id.action_bitcoinMinerFragment_to_withdrawBtcFragment)
        }

        return binding.root
    }


}