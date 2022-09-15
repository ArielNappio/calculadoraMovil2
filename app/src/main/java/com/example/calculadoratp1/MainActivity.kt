package com.example.calculadoratp1

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.view.ViewCompat
import com.example.calculadoratp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()  {


    private lateinit var binding :ActivityMainBinding

    private var nro1: Double = 0.0
    private var nro2: Double = 0.0
    private var result: Double = 0.0

     val vm: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


      binding.SUMA.setOnClickListener{
          nro1 = binding.valorUno.text.toString().toDouble()
          nro2 = binding.valorDos.text.toString().toDouble()
          result = nro1 + nro2
          binding.resultado.setText(result.toString())
      }

      /*
      binding.SUMA.setOnClickListener {
          val uno:Int = Integer.parseInt(primerCampo.text.toString())
          val dos:Int = Integer.parseInt(segundoCampo.text.toString())
          result.setText(uno+dos)
      }
*/
    }
}