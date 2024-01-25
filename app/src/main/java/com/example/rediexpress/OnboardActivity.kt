package com.example.rediexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class OnboardActivity : AppCompatActivity() {
    val frag_List= listOf(Onboarding1Fragment(), Onboarding2Fragment(), Onboarding3Fragment())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)
        var vp:ViewPager2=findViewById(R.id.vpager2)
        vp.adapter=vpAdapter(this, frag_List)
    }
}