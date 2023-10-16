package com.example.myapplication3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GestionDeLugares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_de_lugares)

        var buttonBack = findViewById<Button>(R.id.backGL)

        buttonBack.setOnClickListener {

            val intentBack = Intent(this, Home::class.java);
            startActivity(intentBack)
        }
    }









}