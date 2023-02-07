package com.example.ezquiz_sarocha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seven.*
import kotlinx.android.synthetic.main.activity_six.*

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        a7.setOnClickListener {

        }

        b7.setOnClickListener {


        }

        c7.setOnClickListener {
            val intent = Intent(this@seven, eight::class.java)
            startActivity(intent)

        }

        d7.setOnClickListener {


        }
    }
}