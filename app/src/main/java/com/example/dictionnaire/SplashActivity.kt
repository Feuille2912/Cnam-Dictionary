package com.example.dictionnaire

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)


        // Using a handler to delay the splash screen transition
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            // Start your app's main activity
            startActivity(Intent(this, MainActivity::class.java))
            // Close the splash activity so the user can't return to it
            finish()
        }, 2000) // 2000 ms delay
    }
}
