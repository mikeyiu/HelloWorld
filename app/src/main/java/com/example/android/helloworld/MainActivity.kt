package com.example.android.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.HelloButton)
        button.setOnClickListener {
            Log.v("Hello world!","Button clicked!")
            Toast.makeText(this,"hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }
}