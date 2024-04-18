package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        onImageViewClick1()
        onImageViewClick2()
        onImageViewClick3()
        onImageViewClick4()
    }
    private fun onImageViewClick1() {
        val ImageViewClick = findViewById<ImageView>(R.id.imageView5)
        ImageViewClick.setOnClickListener {
            startActivity(Intent(this@MainScreen, Exercise::class.java))
        }
    }
    private fun onImageViewClick2() {
        val ImageViewClick = findViewById<ImageView>(R.id.imageView6)
        ImageViewClick.setOnClickListener {
            startActivity(Intent(this@MainScreen, Login::class.java))
        }
    }
    private fun onImageViewClick3() {
        val ImageViewClick = findViewById<ImageView>(R.id.imageView7)
        ImageViewClick.setOnClickListener {
            startActivity(Intent(this@MainScreen, Login::class.java))
        }
    }
    private fun onImageViewClick4() {
        val ImageViewClick = findViewById<ImageView>(R.id.imageView8)
        ImageViewClick.setOnClickListener {
            startActivity(Intent(this@MainScreen, Login::class.java))
        }
    }
}