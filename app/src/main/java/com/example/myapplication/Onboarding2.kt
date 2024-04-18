package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        configureNextButton()
        configureSkipButton()
    }
    private fun configureNextButton() {
        val nextButton = findViewById<Button>(R.id.button2)
        nextButton.setOnClickListener {
            startActivity(Intent(this@Onboarding2, Onboarding3::class.java))
        }
    }

    private fun configureSkipButton() {
        val skipOnboardingText = findViewById<TextView>(R.id.skipOnboardingText2)
        skipOnboardingText.setOnClickListener {
            startActivity(Intent(this@Onboarding2, Login::class.java))
            finish()
        }
    }
}