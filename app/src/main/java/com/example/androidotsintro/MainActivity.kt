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

        // Botão de envio de informações
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        // Exibir informações
        val txtResult  = findViewById<TextView>(R.id.txt_result)
        // Inserir informações
        val edText = findViewById<EditText>(R.id.edText)
        // Abrir nova tela
        val abrirNovaTela = findViewById<Button>(R.id.btnNovaTela)

        // Variável que armazena informaões inseridas
        val inputName = edText.text

        // Botão de envio de informações
        btnEnviar.setOnClickListener{
           // txtResult.text = "Danilo de Souza Miguel"

            if(inputName.isBlank()){
                edText.error = "Esse campo não pode ser vazio"
            }else{
                txtResult.text = edText.text
                btnEnviar.text = edText.text
            }

        }
        // Botão para abrir a nova tela
        abrirNovaTela.setOnClickListener{

        }
    }
}