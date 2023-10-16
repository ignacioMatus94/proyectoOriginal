package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class ListaDeCompras : AppCompatActivity() {

   /* private lateinit var nameEdit : EditText
    private lateinit var button : Button
    private lateinit var list : ListView
    private lateinit var listTextos : ArrayList<String>
    private lateinit var adapter : ArrayAdapter<String>
    */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_compras)

        var buttonBack = findViewById<Button>(R.id.backListadeCompra)

        buttonBack.setOnClickListener {

            val intentBack = Intent(this, Home::class.java);
            startActivity(intentBack)
        }

        val arrayAdapter: ArrayAdapter<*>
        val personas = mutableListOf("Naranja","Tomate","Lechuga")
        val lista = findViewById<ListView>(R.id.lista)

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,personas)
        lista.adapter = arrayAdapter

        lista.setOnItemClickListener(){ parent, view, position, id->

            Toast.makeText(this,parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()

        }

/*
        nameEdit = findViewById(R.id.texto)
        button = findViewById(R.id.enter)
        list = findViewById(R.id.listaDeTextos)
        listTextos = ArrayList()
        listTextos.add("Hola")

        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listTextos)
        list.adapter = adapter
*/


    }
}