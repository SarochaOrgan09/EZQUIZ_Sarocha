package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        a1.setOnClickListener {
            val intent = Intent(this@one, two::class.java)
            startActivity(intent)
        }

        b1.setOnClickListener {


        }

        c1.setOnClickListener {


        }

        d1.setOnClickListener {


        }

    }
}