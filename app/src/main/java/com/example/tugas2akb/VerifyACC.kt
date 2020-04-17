package com.example.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_verify.*

class VerifyACC : AppCompatActivity() {
    private lateinit var button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        val html = "doesn't get the code ? <b> Resend</b>"
        txtresend.text = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY)
        button = findViewById(R.id.btn_send)
        button.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
    }
    }
}
