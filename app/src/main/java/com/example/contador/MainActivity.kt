package com.example.contador

import android.annotation.SuppressLint
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var contador = 0
    private var incrementar = true

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lblContador = findViewById<TextView>(R.id.txtContador)
        val buttonInicio = findViewById<Button>(R.id.btnComenzar)
        val buttonRefresh = findViewById<Button>(R.id.btnActualizar)

        buttonInicio.setOnClickListener {
            if (incrementar) {
                contador++
                if (contador >= 10) {
                    incrementar = false
                }
            } else {
                contador--
                if (contador <= 0) {
                    incrementar = true
                }
            }
            lblContador.text = contador.toString()
        }

        buttonRefresh.setOnClickListener {
            contador = 0
            incrementar = true
            lblContador.text = contador.toString()
        }
    }
}