package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class Usuario : AppCompatActivity() {

   /* private lateinit var nameEdit : EditText
    private lateinit var button : Button
    private lateinit var list : ListView
    private lateinit var listTextos : ArrayList<String>
    private lateinit var adapter : ArrayAdapter<String>
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario)

        var buttonNext = findViewById<Button>(R.id.next)
/*
        nameEdit = findViewById(R.id.texto)
        button = findViewById(R.id.enter)
        list = findViewById(R.id.listaDeTextos)
        listTextos = ArrayList()
        listTextos.add("Hola")

        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listTextos)
        list.adapter = adapter
*/
        buttonNext.setOnClickListener {
            val intentNext = Intent(this, Home::class.java)
            startActivity(intentNext)

        }





    }
}