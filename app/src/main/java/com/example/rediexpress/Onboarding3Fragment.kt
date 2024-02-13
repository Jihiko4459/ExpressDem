package com.example.rediexpress

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton


class Onboarding3Fragment : Fragment() {
    var preff: SharedPreferences?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var q=inflater.inflate(R.layout.fragment_onboarding3, container, false)
        preff= activity?.getSharedPreferences(TABLE, Context.MODE_PRIVATE)
        var but_sign_up: AppCompatButton =q.findViewById(R.id.buttonsignup)
        but_sign_up.setOnClickListener{
            var intent= Intent(activity, Holder::class.java)
            preff?.edit()?.putBoolean(key1, true)?.apply()
            startActivity(intent)
        }
        return q    }


}