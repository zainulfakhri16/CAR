package com.example.car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PilihActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih)

        val button: Button = findViewById(R.id.bt_bmobil)
        button.setOnClickListener {
            val intent = Intent(this, CarPilihanActivity::class.java)
            startActivity(intent)
        }
    }
}