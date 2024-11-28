package com.unir.exament1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usuario = findViewById<EditText>(R.id.usuario)
        val constra = findViewById<EditText>(R.id.cont)
        val boton = findViewById<Button>(R.id.boton).setOnClickListener {

            val usuario = usuario.text.toString()
            val contraseña = constra.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("KEY_USER", usuario.toString())
            intent.putExtra("KEY_PASSWORD", contraseña.toString())
            startActivity(intent)
        }
    }
}