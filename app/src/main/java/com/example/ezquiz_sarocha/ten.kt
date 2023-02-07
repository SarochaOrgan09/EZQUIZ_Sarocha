package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_six.*
import kotlinx.android.synthetic.main.activity_ten.*

class ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        a10.setOnClickListener {
            val intent = Intent(this@ten, MainActivity()::class.java)
            startActivity(intent)
        }

        b10.setOnClickListener {


        }

        c10.setOnClickListener {


        }

        d10.setOnClickListener {


        }
    }
}