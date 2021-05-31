package com.example.alphametrica


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView_login)
        textView.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity::class.java))
        }

        val subscribeButton: Button = findViewById(R.id.subscribe_button)
        subscribeButton.setOnClickListener {
            startActivity(Intent(applicationContext, SubscribeActivity::class.java))
        }

    }
}