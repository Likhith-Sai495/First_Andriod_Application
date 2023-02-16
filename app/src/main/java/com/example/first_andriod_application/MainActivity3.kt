package com.example.first_andriod_application

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    private lateinit var nextbutton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        nextbutton2=findViewById(R.id.button)
        nextbutton2.setOnClickListener{
            val intent= Intent(this,MainActivity6::class.java)
            startActivity(intent)
        }
    }
}