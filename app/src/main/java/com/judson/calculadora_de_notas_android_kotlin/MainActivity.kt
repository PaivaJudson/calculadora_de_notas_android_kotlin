package com.judson.calculadora_de_notas_android_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_calcular = btn_calcular
        val edt_nota1 = edt_nota1
        val edt_nota2 = edt_nota2
        val edt_falta = edt_faltas
        val txt_resultado = txt_resultado


        btn_calcular.setOnClickListener {
            val nota1: Double = edt_nota1.text.toString().toDouble()
            val nota2: Double = edt_nota2.text.toString().toDouble()
            val media: Double = (nota1 + nota2)/ 2
            val falta: Int = edt_falta.text.toString().toInt()

            if (media >=10 && falta <= 10){
                txt_resultado.setText("Estudante Aprovado")
            }
        }
    }
}