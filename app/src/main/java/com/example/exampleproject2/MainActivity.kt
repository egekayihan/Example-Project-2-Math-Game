package com.example.exampleproject2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var multi : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition = findViewById(R.id.buttonAdd)
        subtraction = findViewById(R.id.buttonSub)
        multi = findViewById(R.id.buttonMulti)

        val intent = Intent(this@MainActivity, GameActivity::class.java)

        addition.setOnClickListener {

            intent.putExtra("method", "Addition")
            startActivity(intent)
            finish()

        }

        subtraction.setOnClickListener {

            intent.putExtra("method", "Subtraction")
            startActivity(intent)
            finish()

        }

        multi.setOnClickListener {

            intent.putExtra("method", "Multiplication")
            startActivity(intent)
            finish()

        }

    }
}