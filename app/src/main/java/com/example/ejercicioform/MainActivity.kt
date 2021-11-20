package com.example.ejercicioform


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity :
    AppCompatActivity() {
    override fun onCreate
    (savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numero1 =
            findViewById<EditText>(R.id.numero1)
        val numero2 =
            findViewById<EditText>(R.id.numero2)
        val button =
            findViewById<Button>(R.id.button)
        button.setOnClickListener { view ->

            val numeroT = numero1.text.toString().toInt() * numero2.text.toString().toInt()

        Snackbar.make(
            view,"Multiplicar $numero1 X $numero2 = $numeroT",
            Snackbar.LENGTH_LONG
        ).show()
        }
    }
}