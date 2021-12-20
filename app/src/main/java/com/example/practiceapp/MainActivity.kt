package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv: TextView = findViewById(R.id.tv)
        var btn: Button = findViewById(R.id.btn)

    }
}

    fun main() {
        var a = 9
        var b = 4
        var c = 2
        var z = 1
        val ave = cal(a, b, c, z)
        println(ave)
    }
    fun cal(d: Int, e: Int, f: Int, x: Int): Int {
        var total = d + e + f
        return total / 5
    }
