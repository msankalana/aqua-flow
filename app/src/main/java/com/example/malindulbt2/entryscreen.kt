package com.example.malindulbt2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class entryscreen {


    class WelcomeActivity:  AppCompatActivity() {

        private lateinit var signupBtn: Button
        private lateinit var loginBtn: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.entryscreen) // use your welcome XML

            // Find buttons

            loginBtn = findViewById(R.id.login_btn2)


            // Navigate to LoginActivity
            loginBtn.setOnClickListener {
                val intent = Intent(this, loginscreen::class.java)
                startActivity(intent)
            }
        }
    }
}