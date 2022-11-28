package com.example.winemate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window)

        var VARIETY = ""
        var BODY = ""
        var ACIDITY = ""
        var AROMATIC = ""
        var FRUITY = ""
        var TANNIN = ""

        fun all() {
            Constants.VARIETY_NAME = VARIETY
            Constants.PERCENT_1 = BODY
            Constants.PERCENT_2 = ACIDITY
            Constants.PERCENT_3 = AROMATIC
            Constants.PERCENT_4 = FRUITY
            Constants.PERCENT_5 = TANNIN
        }

        fun clear() {
            Constants.VARIETY_NAME = ""
            Constants.PERCENT_1 = ""
            Constants.PERCENT_2 = ""
            Constants.PERCENT_3 = ""
            Constants.PERCENT_4 = ""
            Constants.PERCENT_5 = ""
        }


        val ASYRTIKO = findViewById<Button>(R.id.ASYRTIKO)
        ASYRTIKO.setOnClickListener {


            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }








        val MALAGOUZIA = findViewById<Button>(R.id.MALAGOUZIA)
        MALAGOUZIA.setOnClickListener {


            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }









        val MOSXOFILERO = findViewById<Button>(R.id.MOSXOFILERO)
        MOSXOFILERO.setOnClickListener {


            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }

    }
}