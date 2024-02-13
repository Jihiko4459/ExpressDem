package com.example.rediexpress

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.WindowManager
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.math.floor
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    var secondLeft=0
    var preff: SharedPreferences?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var main_window:ConstraintLayout=findViewById(R.id.idMain)
        var logo:ImageView=findViewById(R.id.imageView)
        preff= getSharedPreferences(TABLE,MODE_PRIVATE)
        var skip=preff?.getBoolean(key1, false)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val timer=object :CountDownTimer(5000,1000){
            override fun onTick(p0: Long) {
                secondLeft = floor((p0.toFloat() / 1000.0)).roundToInt()
                if (secondLeft==2) {
                    main_window.setBackgroundColor(R.color.primarycolor)
                    logo.setImageResource(R.drawable.logo2)
                }
            }

            override fun onFinish() {

                if (skip==true){
                    var intent= Intent(this@MainActivity, Holder::class.java)
                    startActivity(intent)
                }else{
                    var intent= Intent(this@MainActivity, OnboardActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        timer.start()
    }
}