package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.widget.addTextChangedListener

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        var email:EditText=findViewById(R.id.editTextTextEmailAddress2)
        var pass:EditText=findViewById(R.id.editTextTextPassword4)
        var text_forgot:TextView=findViewById(R.id.textForgotPass)
        var text_sign_up:TextView=findViewById(R.id.sign_up_text)
        var  btn_log:AppCompatButton=findViewById(R.id.btn_log_in)
        email.addTextChangedListener {
            btn_log.isEnabled=email.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()
        }
        pass.addTextChangedListener {
            btn_log.isEnabled=email.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()
        }
        text_forgot.setOnClickListener {
            val intent=Intent(this@LogInActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
        text_sign_up.setOnClickListener {
            val intent=Intent(this@LogInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
        btn_log.setOnClickListener {
            val intent=Intent(this@LogInActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}