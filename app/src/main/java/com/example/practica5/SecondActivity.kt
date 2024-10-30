package com.example.practica5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonBackToMainScreen = findViewById<Button>(R.id.buttonBackToMainScreen)

        buttonBackToMainScreen.setOnClickListener {
            finish() // Finaliza la actividad actual para regresar a la primera pantalla
        }
    }
}



