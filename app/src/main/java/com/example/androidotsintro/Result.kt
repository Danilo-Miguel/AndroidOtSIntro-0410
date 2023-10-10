package com.example.androidotsintro

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Pegar a informação vinda da outra activity
        val nomeDigitado = intent.getStringExtra("RESULTADO")

        // botão voltar pata a tela anterior
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // texto a ser exibido
        val txtResult = findViewById<TextView>(R.id.textResult)


        txtResult.text = nomeDigitado

        btnVoltar.setOnClickListener {
            finish()
        }
    }


}