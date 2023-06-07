package com.example.intentsandsartingactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val btnBack:Button=findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
        val btnNextActivity:Button=findViewById(R.id.btnNextActivity)
        btnNextActivity.setOnClickListener {
            Intent(this,ThirdActivity::class.java).also{
                startActivity(it)
            }
        }
    }

}