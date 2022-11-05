package com.example.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var navigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
        navigationListener()
    }

    private fun init() {
        navigation = findViewById(R.id.bt_nav_layout)
    }

    private fun navigationListener() {
        navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    return@setOnItemSelectedListener true
                }
                R.id.nav_fav -> {
                    return@setOnItemSelectedListener true
                }
                R.id.nav_sel -> {
                    return@setOnItemSelectedListener true
                }
                R.id.nav_profil -> {
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}