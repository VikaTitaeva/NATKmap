package com.example.mapnatk

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.os.Handler
import android.content.Intent


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(
            {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }, 3000)
    }
}

