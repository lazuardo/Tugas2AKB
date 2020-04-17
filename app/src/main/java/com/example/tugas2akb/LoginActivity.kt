package com.example.tugas2akb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_main.*


/*
 NIM    : 10117160
 Nama   : Juan Lazuardo
 Kelas  : AKB-4 / IF-4
 Tugas  : Tugas 2 AKB

 Update :
    15 April 2020 : Membuat Tampilan Login
    16 April 2020 : Membuat Tampilan Register
    17 April 2020 : - Membuat Tampilan Almost there
                    - Membuat Tampilan Verify
                    - Membuat Tampilan Home
                    - Push Github
 */

class LoginActivity : AppCompatActivity() {
    private lateinit var regis: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val html = "doesn't have account ? <b> Register</b>"
        txtregis.text = HtmlCompat.fromHtml(html,HtmlCompat.FROM_HTML_MODE_LEGACY)
        regis = findViewById(R.id.txtregis)

        regis.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))}
    }
}
