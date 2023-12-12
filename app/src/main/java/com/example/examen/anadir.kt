package com.example.examen

import android.content.Intent
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import androidx.core.text.isDigitsOnly
import com.example.examen.databinding.ActivityAnadirBinding
import com.google.android.material.datepicker.MaterialDatePicker

class anadir : AppCompatActivity() {

    private lateinit var bind: ActivityAnadirBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityAnadirBinding.inflate(layoutInflater)

        setContentView(bind.root)

        bind.atras.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        bind.fecha.setOnClickListener {
            var builder = MaterialDatePicker.Builder.datePicker()
            val calendar = Calendar.getInstance()
            builder.setMaxDate(calendar.timeInMillis)
            var piker = builder.build()

            piker.addOnPositiveButtonClickListener {
                bind.fecha.setText(piker.headerText)
            }

            piker.show(supportFragmentManager,"juju")

        }


    }

    fun validar(view:View) {
        var bnombre = false
        var nombre: String?
        if (bind.nombre.text.isNullOrBlank()) {
            nombre = null
            bind.nombre.error = "No puedes dejar este campo vacio"
        } else {
            nombre = bind.nombre.text.toString()
            if (nombre[0].isUpperCase() && nombre.length >= 3 && nombre != null) {
                bnombre = true
                bind.nombre.error = null
            } else {
                bind.nombre.error =
                    "El nombre debe empezar por mayuscula y tener al menos 3 carcteres"
            }
        }

        var bentrena = false
        var entrena = bind.entrenador.text.toString()
        if (entrena.isNullOrBlank()) {
            bind.entrenador.error = "No puedes dejar este campo vacio"
        } else {
            if (entrena.length <= 25) {
                for (i in entrena) {
                    if (i.lowercase() in "aeiou") {
                        bentrena = true
                        bind.entrenador.error = null
                    }
                }
            }
        }


        var bestatura = false
        var estatura = bind.estatura.text.toString()
        if (estatura.isNullOrBlank()) {
            bind.estatura.error = "No puedes dejar este campo vacio"
        }else{
            if (estatura.isDigitsOnly()) {
                bestatura = true
                bind.estatura.error = null
            }
        }


        var bfecha = false
        var fecha = bind.fecha.text.toString()
        if (fecha.isNullOrBlank()){
            bind.fecha.error = "No puedes dejar este campo vacio"
        }else{



        }

        if (bnombre && bentrena && bestatura && bfecha){

        }



    }

}
