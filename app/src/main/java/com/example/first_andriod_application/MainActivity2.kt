package com.example.first_andriod_application

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var nextbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        nextbutton=findViewById(R.id.button4)
        nextbutton.setOnClickListener{
            val intent= Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}