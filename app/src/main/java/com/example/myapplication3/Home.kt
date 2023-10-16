package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val click = findViewById<Button>(R.id.ListaDeCompras);
        val click2 = findViewById<Button>(R.id.Inventario);
        val click3 = findViewById<Button>(R.id.GestionDeLugares);
        val clickHome = findViewById<Button>(R.id.backHome)

        click.setOnClickListener{

            val Intent = Intent(this,ListaDeCompras::class.java)
            startActivity(Intent);
        }


        click2.setOnClickListener{

            val Intent = Intent(this,Inventario::class.java)
            startActivity(Intent);
        }

        click3.setOnClickListener{

            val Intent = Intent(this,GestionDeLugares::class.java)
            startActivity(Intent);
        }

        clickHome.setOnClickListener{

            val Intent = Intent(this,Usuario::class.java)
            startActivity(Intent);
        }

    }

}