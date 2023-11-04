package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appName = getString(R.string.app_name)
        val greetingText = "Hello, $appName"

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = greetingText
    }
}
