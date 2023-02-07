package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_three.*
import kotlinx.android.synthetic.main.activity_two.*
import kotlinx.android.synthetic.main.activity_two.c3

class three : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        a3.setOnClickListener {

        }

        b3.setOnClickListener {
            val intent = Intent(this@three, four::class.java)
            startActivity(intent)

        }

        c3.setOnClickListener {


        }

        d3.setOnClickListener {

        }
    }
}