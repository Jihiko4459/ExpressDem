package com.example.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class NewPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)
        var pass:EditText=findViewById(R.id.editTextTextPassword2)
        var pass_confirm:EditText=findViewById(R.id.editTextTextPassword5)
        var btn_change_pass:AppCompatButton=findViewById(R.id.button_new_pass)
        btn_change_pass.setOnClickListener {
            if(pass.text.toString()==pass_confirm.text.toString()){
                val intent= Intent(this@NewPasswordActivity, HomeActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Пароли не совпадают", Toast.LENGTH_SHORT).show()
            }
        }

    }
}