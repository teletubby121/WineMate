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
            clear()
            VARIETY = "ASYRTIKO"
            BODY = "80"
            ACIDITY = "77"
            AROMATIC = "55"
            FRUITY = "44"
            TANNIN = "77"
            all()

            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }

        val MALAGOUZIA = findViewById<Button>(R.id.MALAGOUZIA)
        MALAGOUZIA.setOnClickListener {
            clear()
            VARIETY = "MALAGOUZIA"
            BODY = "34"
            ACIDITY = "76"
            AROMATIC = "65"
            FRUITY = "34"
            TANNIN = "54"
            all()

            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }

        val MOSXOFILERO = findViewById<Button>(R.id.MOSXOFILERO)
        MOSXOFILERO.setOnClickListener {
            clear()
            VARIETY = "MOSXOFILERO"
            BODY = "67"
            ACIDITY = "89"
            AROMATIC = "67"
            FRUITY = "45"
            TANNIN = "23"
            all()

            val intent = Intent(this, VarietyWindow::class.java)
            startActivity(intent)
        }

    }
}