package com.example.myintentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_move)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.move)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnBackActivity = findViewById<Button>(R.id.btn_back)
        btnBackActivity.setOnClickListener {
            onTekan()
        }
    }
    private fun onTekan() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}