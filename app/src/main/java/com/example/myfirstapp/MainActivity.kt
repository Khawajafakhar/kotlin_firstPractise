package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val btnClickMe = findViewById<Button>(R.id.button)
       val txtView = findViewById<TextView>(R.id.textView)
       var totalNumber = 0
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Add More"
            totalNumber += 1
            txtView.text = totalNumber.toString()
            Toast.makeText(this, "Total Numbers are$totalNumber",Toast.LENGTH_SHORT).show()
        }
    }
}