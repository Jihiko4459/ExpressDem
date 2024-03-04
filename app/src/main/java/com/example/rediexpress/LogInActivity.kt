package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        var text_forgot:TextView=findViewById(R.id.textForgotPass)
        var  btn_log:AppCompatButton=findViewById(R.id.btn_log_in)
        text_forgot.setOnClickListener {
            val intent=Intent(this@LogInActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
        btn_log.setOnClickListener {
            val intent=Intent(this@LogInActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}