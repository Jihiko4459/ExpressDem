package com.example.rediexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatButton
import androidx.viewpager2.widget.ViewPager2

class OnboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)
        supportFragmentManager.beginTransaction().replace(R.id.vpager2, Onboarding1Fragment()).commit()
    }
    fun next1(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.vpager2, Onboarding2Fragment()).commit()
    }
    fun next2(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.vpager2, Onboarding3Fragment()).commit()
    }


}