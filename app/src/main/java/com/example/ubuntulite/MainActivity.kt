package com.example.ubuntulite

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "UbuntuLite Linux Launcher"
        text.textSize = 24f

        setContentView(text)
    }
}

