package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nine.*
import kotlinx.android.synthetic.main.activity_six.*

class nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        a9.setOnClickListener {
            val intent = Intent(this@nine, ten::class.java)
            startActivity(intent)
        }

        b9.setOnClickListener {


        }

        c9.setOnClickListener {


        }

        d9.setOnClickListener {


        }
    }
}