package com.example.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlmostActivity : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost)
        button = findViewById(R.id.btn_Verify)
        button.setOnClickListener {
            startActivity(Intent(this, VerifyACC::class.java))
        }
    }
}
