package com.example.mapnatk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button1 = findViewById<Button>(R.id.firstbutton)
        button1.setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        val button2 = findViewById<Button>(R.id.secondbutton)
        button2.setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        val button3 = findViewById<Button>(R.id.thirdbutton)
        button3.setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        val button4 = findViewById<Button>(R.id.fourthbutton)
        button4.setOnClickListener{
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }

    }



}