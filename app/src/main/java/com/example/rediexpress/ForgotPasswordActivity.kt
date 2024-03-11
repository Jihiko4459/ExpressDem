package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.core.widget.addTextChangedListener
import java.util.regex.Pattern

class ForgotPasswordActivity : AppCompatActivity() {
    val pattern:String="[a-z0-9]{1,100}"+"@"+"[a-z]{1,10}"+"\\."+"[a-z]{1,5}"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        var email:EditText=findViewById(R.id.editTextTextEmailAddress3)
        var btn_send:AppCompatButton=findViewById(R.id.buttonSend)
        var text_singin:TextView=findViewById(R.id.textSinginfromForgot)
        email.addTextChangedListener {
            btn_send.isEnabled=email.text.toString().isNotEmpty()
        }
        btn_send.setOnClickListener {
            if (EmailValid(email.text.toString())){
                var intent= Intent(this@ForgotPasswordActivity, OTPVerifucationActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Email введен некоректно", Toast.LENGTH_SHORT).show()
            }

        }
        text_singin.setOnClickListener {
            var intent=Intent(this@ForgotPasswordActivity, LogInActivity::class.java)
            startActivity(intent)
        }
    }
    fun EmailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }
}