package com.example.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        button = findViewById(R.id.btn_Register)
        button.setOnClickListener {
            startActivity(Intent(this, AlmostActivity::class.java))
        }
    }
}
