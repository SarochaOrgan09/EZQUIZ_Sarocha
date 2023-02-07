package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_five.*
import kotlinx.android.synthetic.main.activity_four.*

class five : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        a5.setOnClickListener {
            val intent = Intent(this@five, six::class.java)
            startActivity(intent)
        }

        b5.setOnClickListener {


        }

        c5.setOnClickListener {


        }

        d5.setOnClickListener {


        }
    }
}