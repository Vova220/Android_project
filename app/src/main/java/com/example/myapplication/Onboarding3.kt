package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        configureNextButton()
        configureSkipButton()
    }
    private fun configureNextButton() {
        val nextButton = findViewById<Button>(R.id.button3)
        nextButton.setOnClickListener {
            startActivity(Intent(this@Onboarding3, Login::class.java))
            finish()
        }
    }

    private fun configureSkipButton() {
        val skipOnboardingText = findViewById<TextView>(R.id.skipOnboardingText3)
        skipOnboardingText.setOnClickListener {
            startActivity(Intent(this@Onboarding3, Login::class.java))
            finish()
        }
    }
}