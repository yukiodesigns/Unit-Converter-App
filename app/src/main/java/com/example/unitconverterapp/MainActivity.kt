package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt = findViewById<EditText>(R.id.kiloEdit)
        val btn = findViewById<Button>(R.id.btn)
        val result = findViewById<TextView>(R.id.resultText)

        btn.setOnClickListener(){
            val kilos = edt.text.toString().toDouble()
            result.setText(""+convertToPounds(kilos)+ " Pounds")
        }

    }
    fun convertToPounds(kilos:Double):Double{
        var pounds = kilos * 2.20462
        return pounds
    }
}