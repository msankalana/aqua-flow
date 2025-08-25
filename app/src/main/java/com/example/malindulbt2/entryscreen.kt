package com.example.malindulbt2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class entryscreen : AppCompatActivity() {

    private lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.entryscreen)

        // Find buttons
        loginBtn = findViewById(R.id.login_btn2)

        // Navigate to LoginActivity
        loginBtn.setOnClickListener {
            val intent = Intent(this, loginscreen::class.java)
            startActivity(intent)
        }
    }
}