package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_two.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        a2.setOnClickListener {

        }

        b2.setOnClickListener {


        }

        c2.setOnClickListener {
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)

        }

        c3.setOnClickListener {

        }
    }
}