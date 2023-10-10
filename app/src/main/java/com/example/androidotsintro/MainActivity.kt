package com.example.androidotsintro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.androidotsintro.Result

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

         // Verificar se existe algo digitado no campo
            if(inputName.isBlank()){
                edText.error = "Esse campo não pode ser vazio"
            }else{
                txtResult.text = edText.text
            }

        }
        // Botão para abrir a nova tela
        abrirNovaTela.setOnClickListener{

            // Conversão da informação para String
            val nomeDigitado = edText.text.toString()

            // Criação da intenção
            val abrirNovaTela = Intent(this, Result::class.java)

            // Envio da informação para a outra Activity
            abrirNovaTela.putExtra("RESULTADO", nomeDigitado )

            // Execução da intenção
            startActivity(abrirNovaTela)



        }
    }
}