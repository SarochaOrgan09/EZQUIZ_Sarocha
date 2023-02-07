package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_five.*
import kotlinx.android.synthetic.main.activity_six.*

class six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        a6.setOnClickListener {

        }

        b6.setOnClickListener {


        }

        c6.setOnClickListener {


        }

        d6.setOnClickListener {
            val intent = Intent(this@six, seven::class.java)
            startActivity(intent)

        }
    }
}