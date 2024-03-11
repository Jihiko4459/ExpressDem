package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SendPackageReceiptActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_send_package_receipt)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        tb=findViewById(R.id.toolbar5)
//        setSupportActionBar(this.tb)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.title="Add Payment method"
        var btn_edit:AppCompatButton=findViewById(R.id.btn_edit)
        var btn_make_pay:AppCompatButton=findViewById(R.id.btn_pay)
        btn_edit.setOnClickListener {
            val intent= Intent(this@SendPackageReceiptActivity, SendPackageActivity::class.java)
            startActivity(intent)
        }
        btn_make_pay.setOnClickListener {
            val intent= Intent(this@SendPackageReceiptActivity, TransactionSuccessfulActivity::class.java)
            startActivity(intent)
        }

    }
}