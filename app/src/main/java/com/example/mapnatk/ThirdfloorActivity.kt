package com.example.mapnatk

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import android.view.MotionEvent
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog

class ThirdfloorActivity : AppCompatActivity() {
    private val SWIPE_THRESHOLD = 100
    private var x1 = 0f
    private var x2 = 0f
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdfloor)
        val imageView = findViewById<View>(R.id.imageView) as SubsamplingScaleImageView
        imageView.setImage(ImageSource.resource(R.drawable.floor3));

        val button1 = findViewById<ImageButton>(R.id.imageButton1)
        val button2 = findViewById<ImageButton>(R.id.imageButton2)
        val button3 = findViewById<ImageButton>(R.id.imageButton3)
        val button4 = findViewById<ImageButton>(R.id.imageButton4)
        val button5 = findViewById<ImageButton>(R.id.imageButton5)
        val button6 = findViewById<ImageButton>(R.id.imageButton6)

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
            builder.setTitle(R.string.dialogTitle10)
            builder.setMessage(R.string.dialogMessage10)
            builder.setIcon(R.drawable.technical)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button3.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle6)
            builder.setMessage(R.string.dialogMessage6)
            builder.setIcon(R.drawable.toilet)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button4.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle11)
            builder.setMessage(R.string.dialogMessage11)
            builder.setIcon(R.drawable.metodical)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button5.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle12)
            builder.setMessage(R.string.dialogMessage12)
            builder.setIcon(R.drawable.doctor)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button6.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle13)
            builder.setMessage(R.string.dialogMessage13)
            builder.setIcon(R.drawable.teachers)
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