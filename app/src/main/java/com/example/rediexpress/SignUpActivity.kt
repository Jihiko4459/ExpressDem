package com.example.rediexpress

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.core.widget.addTextChangedListener
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {
    val pattern:String="[a-z0-9]{1,100}"+"@"+"[a-z]{1,10}"+"\\."+"[a-z]{1,5}"
    lateinit var et_full_name:EditText
    lateinit var et_phone:EditText
    lateinit var et_email:EditText
    lateinit var et_password:EditText
    lateinit var et_pass_again:EditText
    lateinit var cb_agree:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        var textLink1:TextView=findViewById(R.id.textPrivatePolicy1)
        var textLink2:TextView=findViewById(R.id.textPrivatePolicy2)
        var btn_sing_up:AppCompatButton=findViewById(R.id.btn_sign_up)
        var text_login:TextView=findViewById(R.id.textSingin)
        et_full_name=findViewById(R.id.full_name)
        et_phone=findViewById(R.id.phone_number)
        et_email=findViewById(R.id.email)
        et_password=findViewById(R.id.password)
        et_pass_again=findViewById(R.id.confirm_password)
        cb_agree=findViewById(R.id.checkBox)
        text_login.setOnClickListener {
            val intent= Intent(this@SignUpActivity, LogInActivity::class.java)
            startActivity(intent)
        }
        textLink1.setOnClickListener { openPrivatePolicy() }
        textLink2.setOnClickListener { openPrivatePolicy() }
        et_full_name.addTextChangedListener { text ->
            btn_sing_up.isEnabled=et_full_name.text.toString().isNotEmpty()&&et_phone.text.toString().isNotEmpty()
                    &&et_email.text.toString().isNotEmpty()&&et_password.text.toString().isNotEmpty()
                    &&et_pass_again.text.toString().isNotEmpty()
        }
        et_phone.addTextChangedListener { text ->
            btn_sing_up.isEnabled=et_full_name.text.toString().isNotEmpty()&&et_phone.text.toString().isNotEmpty()
                    &&et_email.text.toString().isNotEmpty()&&et_password.text.toString().isNotEmpty()
                    &&et_pass_again.text.toString().isNotEmpty()
        }
        et_email.addTextChangedListener { text ->
            btn_sing_up.isEnabled=et_full_name.text.toString().isNotEmpty()&&et_phone.text.toString().isNotEmpty()
                    &&et_email.text.toString().isNotEmpty()&&et_password.text.toString().isNotEmpty()
                    &&et_pass_again.text.toString().isNotEmpty()
        }
        et_password.addTextChangedListener { text ->
            btn_sing_up.isEnabled=et_full_name.text.toString().isNotEmpty()&&et_phone.text.toString().isNotEmpty()
                    &&et_email.text.toString().isNotEmpty()&&et_password.text.toString().isNotEmpty()
                    &&et_pass_again.text.toString().isNotEmpty()
        }
        et_pass_again.addTextChangedListener { text ->
            btn_sing_up.isEnabled=et_full_name.text.toString().isNotEmpty()&&et_phone.text.toString().isNotEmpty()
                    &&et_email.text.toString().isNotEmpty()&&et_password.text.toString().isNotEmpty()
                    &&et_pass_again.text.toString().isNotEmpty()
        }
        btn_sing_up.setOnClickListener {
            if(EmailValid(et_email.text.toString())){
                if(et_password.text.toString()==et_pass_again.text.toString()){
                    if (cb_agree.isChecked){
                          val intent=Intent(this@SignUpActivity, LogInActivity::class.java)
                        Toast.makeText(this@SignUpActivity, "Регистрация прошла успешна", Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    }
                    else{
                        Toast.makeText(this@SignUpActivity, "Чтобы зарегистрироваться, нужно согласится с политикой \n конфиденциальности", Toast.LENGTH_LONG).show()
                    }
                }
                else{
                    Toast.makeText(this@SignUpActivity, "Пароли не совпадают", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this@SignUpActivity, "Email введен некоректно", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun EmailValid(text:String):Boolean{
        return Pattern.compile(pattern).matcher(text).matches()
    }
    fun openPrivatePolicy(){
//        val url = R.raw.privacy_policy
//        val i = Intent(Intent.ACTION_VIEW)
//        i.setData(Uri.parse(url.toString()))
//        startActivity(i)
    }
}