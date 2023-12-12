package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)

        setContentView(bind.root)

        bind.anadir.setOnClickListener {
            var intent = Intent(this,anadir::class.java)
            startActivity(intent)
        }

        bind.ver.setOnClickListener {
            var intent = Intent(this,ver::class.java)
            startActivity(intent)
        }


    }
}