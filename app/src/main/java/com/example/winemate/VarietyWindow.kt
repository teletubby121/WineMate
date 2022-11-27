package com.example.winemate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VarietyWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variety_window)


        val VarietyName = findViewById<TextView>(R.id.VarietyName)
        VarietyName.text = Constants.VARIETY_NAME.toString()

        val percent_1 = findViewById<TextView>(R.id.percent_1)
        percent_1.text = Constants.PERCENT_1.toString()
        val percent_2 = findViewById<TextView>(R.id.percent_2)
        percent_2.text = Constants.PERCENT_2.toString()
        val percent_3 = findViewById<TextView>(R.id.percent_3)
        percent_3.text = Constants.PERCENT_3.toString()
        val percent_4 = findViewById<TextView>(R.id.percent_4)
        percent_4.text = Constants.PERCENT_4.toString()
        val percent_5 = findViewById<TextView>(R.id.percent_5)
        percent_5.text = Constants.PERCENT_5.toString()



    }
}