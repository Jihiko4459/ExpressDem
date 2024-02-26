package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class OTPVerifucationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpverifucation)
        var btn_to_new_pass:AppCompatButton=findViewById(R.id.button_new_pass)
        btn_to_new_pass.setOnClickListener {
            val intent= Intent(this@OTPVerifucationActivity, NewPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}