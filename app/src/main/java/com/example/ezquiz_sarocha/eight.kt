package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eight.*
import kotlinx.android.synthetic.main.activity_six.*

class eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eight)

        a8.setOnClickListener {

        }

        b8.setOnClickListener {
            val intent = Intent(this@eight, nine::class.java)
            startActivity(intent)

        }

        c8.setOnClickListener {


        }

        d8.setOnClickListener {


        }
    }
}