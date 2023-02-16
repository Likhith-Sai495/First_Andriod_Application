package com.example.first_andriod_application

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnStartAnotherActivity: Button
    private lateinit var btnStartAnotherActivity2: Button
    private lateinit var btnStartAnotherActivity3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStartAnotherActivity = findViewById(R.id.button1)
        btnStartAnotherActivity2= findViewById(R.id.button2)
        btnStartAnotherActivity3= findViewById(R.id.button3)
        btnStartAnotherActivity.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            // start your next activity
            startActivity(intent)

        }
        btnStartAnotherActivity2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            // start your next activity
            startActivity(intent)

        }
        btnStartAnotherActivity3.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            // start your next activity
            startActivity(intent)

        }

    }
}