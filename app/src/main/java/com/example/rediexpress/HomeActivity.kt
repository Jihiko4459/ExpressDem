package com.example.rediexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private val fraglist= listOf<Fragment>(HomeFragment(),WalletFragment(),TrackFragment(),ProfileFragment())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var bn:BottomNavigationView=findViewById(R.id.bottomNavigationView)
        supportFragmentManager.beginTransaction().replace(R.id.holder, fraglist[0]).commit()
        bn.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->supportFragmentManager.beginTransaction().replace(R.id.holder, fraglist[0]).commit()
                R.id.wallet->supportFragmentManager.beginTransaction().replace(R.id.holder, fraglist[1]).commit()
                R.id.track->supportFragmentManager.beginTransaction().replace(R.id.holder, fraglist[2]).commit()
                R.id.profile->supportFragmentManager.beginTransaction().replace(R.id.holder, fraglist[3]).commit()
            }
            true
        }
    }
}