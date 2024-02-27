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
        text_forgot.setOnClickListener {
            val intent=Intent(this@LogInActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}