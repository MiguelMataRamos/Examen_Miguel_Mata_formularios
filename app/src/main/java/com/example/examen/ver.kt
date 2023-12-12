package com.example.examen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examen.databinding.ActivityVerBinding

class ver : AppCompatActivity() {
    private lateinit var bind : ActivityVerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityVerBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

        bind.atras.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}