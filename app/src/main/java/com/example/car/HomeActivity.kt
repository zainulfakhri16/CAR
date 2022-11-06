package com.example.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var navigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
        navigationListener()
        bottomNavBar()
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

    @Suppress("DEPRECATION")
    private fun bottomNavBar(){
        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()
        val thirdFragment=ThirdFragment()
        setCurrentFragment(firstFragment)

        navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.nav_home->setCurrentFragment(firstFragment)
                R.id.nav_fav->setCurrentFragment(secondFragment)
                R.id.nav_sel->setCurrentFragment(thirdFragment)

            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}