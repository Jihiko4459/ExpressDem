package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton


class Onboarding1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var q=inflater.inflate(R.layout.fragment_onboarding1, container, false)
        var but_skip:AppCompatButton=q.findViewById(R.id.button_skip1)
        but_skip.setOnClickListener{
            var intent=Intent(activity, Holder::class.java)
            startActivity(intent)
        }
        return q
    }



}