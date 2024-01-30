package com.example.imran_47129083_job1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var email: TextView
    private lateinit var password: TextView
    private lateinit var Back_dt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.textemail)
        password = findViewById(R.id.textpass)
        Back_dt = findViewById(R.id.Back_button)

        email.text = intent.getStringExtra("email")
        password.text = intent.getStringExtra("password")

        Back_dt.setOnClickListener {

            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}