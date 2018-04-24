package com.example.mukhlasin.latihankotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello.setText("Android Kotlin & Java")
        tombol.setText("HELLO KOTLIN INTENT")

        //event
        //tombol.setOnClickListener { Toast.makeText(this, "Hello bro, clicked", Toast.LENGTH_SHORT).show() }
        tombol.setOnClickListener {
            val intent = Intent(this,FunctionActivity::class.java)
            startActivity(intent)
        }

    }
}
