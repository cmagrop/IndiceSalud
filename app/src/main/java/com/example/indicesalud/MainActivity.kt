package com.example.indicesalud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //variables de tipo EditText para capturar los valores
    //activity_main.xml
    lateinit var rut: EditText
    lateinit var nombre:EditText
    lateinit var edad:EditText
    lateinit var altura:EditText
    lateinit var peso:EditText
    //variables para convertir valores
    lateinit  var rutFinal:String
    lateinit  var nombreFinal:String
    var edadFinal = 0
    var alturaFinal = 0.0
    var pesoFinal = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //vincular los EditText de activity_main.xml
        //con las variables creadas en la clase
        rut = findViewById(R.id.rut)
        nombre = findViewById(R.id.nombre)
        edad = findViewById(R.id.edad)
        altura = findViewById(R.id.altura)
        peso= findViewById(R.id.peso)
        //conversiones
        rutFinal = rut.text.toString()
        nombreFinal =nombre.text.toString()
        //Edad
        var obtenerEdad:String = edad.text.toString()
        edadFinal = obtenerEdad.toInt()
        //Altura
        var obtenerAltura:String = altura.text.toString()
        alturaFinal = obtenerAltura.toDouble()
        //Peso
        pesoFinal = peso.text.toString().toDouble()
    }


    fun ingresoDatos(){

        var cualquierPersona = Persona()
        cualquierPersona.rut = rutFinal
        cualquierPersona.nombre = nombreFinal
        cualquierPersona.edad = edadFinal
        cualquierPersona.altura = alturaFinal
        cualquierPersona.peso = pesoFinal
        //mostrar información ingresada
        println("Información ingresada")
        cualquierPersona.Verificar()
        //mostrar resultado
        cualquierPersona.Imprimir()

    }

    fun acceder(view: View) {



    }


}