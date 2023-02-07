package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_four.*
import kotlinx.android.synthetic.main.activity_three.*
import kotlinx.android.synthetic.main.activity_three.c3
import kotlinx.android.synthetic.main.activity_two.*

class four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        a4.setOnClickListener {

        }

        b4.setOnClickListener {


        }

        c4.setOnClickListener {


        }

        d4.setOnClickListener {
            val intent = Intent(this@four, five::class.java)
            startActivity(intent)
        }
    }
}