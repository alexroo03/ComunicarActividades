package com.example.comunicaractividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityPantalla2Binding

class Pantalla2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_pantalla2)
        val binding = ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.extras
        val s = extras?.getString("dato")?: "sin nombre"

        binding.bienvenida.text = "Bienvenido, $s, ¿Acepta los terminos?"

        binding.aceptar.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("dato", "Ha aceptado los terminos")

            startActivity(intent)
        }

        binding.rechazar.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            intent.putExtra("dato", "Ha rechazado los terminos")

            startActivity(intent)
        }
    }
}