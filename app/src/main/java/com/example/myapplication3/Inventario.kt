package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Inventario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventario)

        var buttonBack = findViewById<Button>(R.id.backInventario)

        buttonBack.setOnClickListener {

            val intentBack = Intent(this, Home::class.java);
            startActivity(intentBack)
        }

        val arrayAdapter:ArrayAdapter<*>
        val personas = mutableListOf("Naranja","Tomate","Lechuga")
        val lvDatos = findViewById<ListView>(R.id.lvDatos)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,personas)
        lvDatos.adapter = arrayAdapter

        lvDatos.setOnItemClickListener(){ parent, view, position, id->

            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()

        }
    }
}