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

var TABLE="Table_onboard"
var key1="isCheck"

class Onboarding1Fragment : Fragment() {

    var preff:SharedPreferences?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var q=inflater.inflate(R.layout.fragment_onboarding1, container, false)
        var but_skip:AppCompatButton=q.findViewById(R.id.button_skip1)
        preff= activity?.getSharedPreferences(TABLE, Context.MODE_PRIVATE)
        but_skip.setOnClickListener{
            var intent=Intent(activity, SignUpActivity::class.java)
            preff?.edit()?.putBoolean(key1, true)?.apply()
            startActivity(intent)
        }
        return q
    }



}