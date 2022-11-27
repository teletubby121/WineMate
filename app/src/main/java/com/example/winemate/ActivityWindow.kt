package com.example.winemate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)

        val ASYRTIKO = findViewById<Button>(R.id.ASYRTIKO)
        ASYRTIKO.setOnClickListener {

            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }

    }
}