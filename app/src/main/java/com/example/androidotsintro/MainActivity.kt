package com.example.androidotsintro

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        val txtResult  = findViewById<TextView>(R.id.txt_result)
        val edText = findViewById<EditText>(R.id.edText)
        val inputName = edText.text

        btnEnviar.setOnClickListener{
           // txtResult.text = "Danilo de Souza Miguel"

            if(inputName.isBlank()){
                edText.error = "Esse campo não pode ser vazio"
            }else{
                txtResult.text = edText.text
                btnEnviar.text = edText.text
            }

        }

    }
}