package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        var btn_send:AppCompatButton=findViewById(R.id.buttonSend)
        btn_send.setOnClickListener {
            var intent= Intent(this@ForgotPasswordActivity, OTPVerifucationActivity::class.java)
            startActivity(intent)
        }
    }
}