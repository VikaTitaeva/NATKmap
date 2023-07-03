package com.example.mapnatk

import android.R.id
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView


class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
        val imageView = findViewById<View>(R.id.imageView) as SubsamplingScaleImageView
        imageView.setImage(ImageSource.resource(R.drawable.floor1));

        val button = findViewById<ImageButton>(R.id.imageButton)
        val button2 = findViewById<ImageButton>(R.id.imageButton3)
        val button3 = findViewById<ImageButton>(R.id.imageButton2)

        button.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle)
            builder.setMessage(R.string.dialogMessage)
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button2.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle1)
            builder.setMessage(R.string.dialogMessage1)
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
        button3.setOnClickListener {            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogTitle2)
            builder.setMessage(R.string.dialogMessage2)
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Понятно"){dialogInterface, which ->
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}


