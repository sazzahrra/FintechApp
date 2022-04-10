package com.example.fintechapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        title = "Menu Profile"
        val nama = findViewById<TextView>(R.id.tvnama)
        val nim = findViewById<TextView>(R.id.tvnim)
        val mail = findViewById<TextView>(R.id.tvmail)
        val nope = findViewById<TextView>(R.id.tvhp)
        val jk = findViewById<TextView>(R.id.tvjk)
        val prodi = findViewById<TextView>(R.id.tvps)
        val org = findViewById<TextView>(R.id.tvog)
        val status = findViewById<TextView>(R.id.tvstatus)

        val bukabundle = intent.extras
        if (bukabundle != null) {
            nama.setText(bukabundle.getString("nama"))
            nim.setText(bukabundle.getString("nim"))
            mail.setText(bukabundle.getString("mail"))
            nope.setText(bukabundle.getString("nope"))
            jk.setText(bukabundle.getString("jkel"))
            prodi.setText(bukabundle.getString("prodi"))
            org.setText(bukabundle.getString("org"))
            status.setText(bukabundle.getString("status"))
        }
    }
}