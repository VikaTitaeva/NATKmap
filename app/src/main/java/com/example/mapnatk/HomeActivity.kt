package com.example.mapnatk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.mapbutton)
        button.setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
    }



}