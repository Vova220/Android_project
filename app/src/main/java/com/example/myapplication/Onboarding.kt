package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        configureNextButton()
        configureSkipButton()
    }

    private fun configureNextButton() {
        val nextButton = findViewById<Button>(R.id.button1)
        nextButton.setOnClickListener {
            startActivity(Intent(this@Onboarding, Onboarding2::class.java))
        }
    }

    private fun configureSkipButton() {
        val skipOnboardingText = findViewById<TextView>(R.id.skipOnboardingText1)
        skipOnboardingText.setOnClickListener {
            startActivity(Intent(this@Onboarding, Login::class.java))
            finish()
        }
    }
}