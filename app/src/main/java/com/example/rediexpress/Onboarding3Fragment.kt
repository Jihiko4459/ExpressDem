package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton


class Onboarding3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var q=inflater.inflate(R.layout.fragment_onboarding3, container, false)
        var but_sign_up: AppCompatButton =q.findViewById(R.id.buttonsignup)
        but_sign_up.setOnClickListener{
            var intent= Intent(activity, SignUpActivity::class.java)
            startActivity(intent)
        }
        return q    }


}