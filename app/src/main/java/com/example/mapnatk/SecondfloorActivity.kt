package com.example.mapnatk

import android.R.id
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import android.view.MotionEvent

class SecondfloorActivity : AppCompatActivity() {
    private val SWIPE_THRESHOLD = 100
    private var x1 = 0f
    private var x2 = 0f
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondfloor)
        val imageView = findViewById<View>(R.id.imageView) as SubsamplingScaleImageView
        imageView.setImage(ImageSource.resource(R.drawable.floor2));

        val button1 = findViewById<ImageButton>(R.id.imageButton1)
        val button2 = findViewById<ImageButton>(R.id.imageButton3)
        val button3 = findViewById<ImageButton>(R.id.imageButton2)
        val button4 = findViewById<ImageButton>(R.id.imageButton4)
        val button5 = findViewById<ImageButton>(R.id.imageButton5)

        button1.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle2)
            builder.setMessage(R.string.dialogMessage2)
            builder.setIcon(R.drawable.cabinet)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button2.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle4)
            builder.setMessage(R.string.dialogMessage4)
            builder.setIcon(R.drawable.teachmoment)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button3.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle9)
            builder.setMessage(R.string.dialogMessage9)
            builder.setIcon(R.drawable.library)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button4.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle6)
            builder.setMessage(R.string.dialogMessage6)
            builder.setIcon(R.drawable.toilet)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button5.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle10)
            builder.setMessage(R.string.dialogMessage10)
            builder.setIcon(R.drawable.technical)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                x1 = event.x
            }
            MotionEvent.ACTION_UP -> {
                x2 = event.x
                val deltaX = x2 - x1
                if (Math.abs(deltaX) > SWIPE_THRESHOLD) {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        return super.onTouchEvent(event)
    }
}