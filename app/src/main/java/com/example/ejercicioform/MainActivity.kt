package com.example.ejercicioform

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity :
    AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Numero1 =
            findViewById<EditText>(R.id.numero1)
        val Numero2 =
            findViewById<EditText>(R.id.numero2)
        val button =
            findViewById<Button>(R.id.button)
        button.setOnClickListener { view ->
            val total =
                Numero1.text.toString().toInt() * Numero2.text.toString().toInt()
            Snackbar.make(
                view,
                "Total $total.",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }
}