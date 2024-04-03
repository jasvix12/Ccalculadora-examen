package com.example.calculadoraexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    private lateinit var txtCaja: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCaja = findViewById(R.id.txtcaja)

        val buttons = listOf<Button>(
            findViewById(R.id.btndiv),
            findViewById(R.id.btnMult),
            findViewById(R.id.btnElim),
            findViewById(R.id.btnsie),
            findViewById(R.id.btnoch),
            findViewById(R.id.btnnue),
            findViewById(R.id.btnMas),
            findViewById(R.id.btncua),
            findViewById(R.id.btncinco),
            findViewById(R.id.btnseis),
            findViewById(R.id.btnmenos),
            findViewById(R.id.btnuno),
            findViewById(R.id.btndos),
            findViewById(R.id.btntres),
            findViewById(R.id.btnpunto),
            findViewById(R.id.btnigual),
            findViewById(R.id.btnoff)
        )

        buttons.forEach { button ->
            button.setOnClickListener {
                val text = txtCaja.text.toString()
                val newText = when (button.id) {
                    R.id.btndiv -> text + "/"
                    R.id.btnMult -> text + "*"
                    R.id.btnElim -> text.dropLast(1)
                    R.id.btnsie -> text + "7"
                    R.id.btnoch -> text + "8"
                    R.id.btnnue -> text + "9"
                    R.id.btnMas -> text + "+"
                    R.id.btncua -> text + "4"
                    R.id.btncinco -> text + "5"
                    R.id.btnseis -> text + "6"
                    R.id.btnmenos -> text + "-"
                    R.id.btnuno -> text + "1"
                    R.id.btndos -> text + "2"
                    R.id.btntres -> text + "3"
                    R.id.btnpunto -> text + "."
                    R.id.btnigual -> evaluateExpression(text)
                    else -> text



                }
                txtCaja.setText(newText)
            }
        }
    }


    private fun evaluateExpression(expression: String): String {
        return try {
            val result = evaluate(expression)
            result.toString()
        } catch (e: Exception) {
            "Error"
        }
    }

    private fun evaluate(expression: String): Double {
        return 0.0
    }
}

private fun EditText.setText(newText: Any) {


}


