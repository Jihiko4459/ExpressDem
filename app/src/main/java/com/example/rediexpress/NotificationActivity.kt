package com.example.rediexpress

import android.content.Intent
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NotificationActivity : AppCompatActivity() {
    lateinit var tb:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        tb=findViewById(R.id.toolbar3)
//        setSupportActionBar(this.tb)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.title="Add Payment method"
    }
}