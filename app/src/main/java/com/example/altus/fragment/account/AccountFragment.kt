package com.example.altus.fragment.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.altus.R


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val logout = view.findViewById<View>(R.id.logout)

//        logout.setOnClickListener {
//            val intent = Intent(this.requireContext(),MainActivity::class.java)
//            startActivity(intent)
//        }
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

}