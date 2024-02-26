package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var text_login:TextView=findViewById(R.id.textSingin)
        text_login.setOnClickListener {
            val intent= Intent(this@SignUpActivity, LogInActivity::class.java)
            startActivity(intent)
        }
    }
}