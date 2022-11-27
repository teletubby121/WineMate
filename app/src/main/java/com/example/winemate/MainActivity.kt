package com.example.winemate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val GREEKWINES = findViewById<Button>(R.id.GREEKWINES)
        GREEKWINES.setOnClickListener {

            val intent = Intent(this, ActivityWindow::class.java)
            startActivity(intent)
        }


    }
}