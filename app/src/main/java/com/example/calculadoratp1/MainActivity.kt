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
   private lateinit var primerCampo:EditText
    private lateinit var segundoCampo:EditText
    private lateinit var result:EditText
    private lateinit var sumaBtn:Button


     val vm: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      //primerCampo = binding.valorUno
      //segundoCampo = binding.valorDos

      //sumaBtn = findViewById(R.id.SUMA)

      binding.SUMA.setOnClickListener{
          val uno:Int = Integer.parseInt( binding.valorUno.text.toString())
          val dos:Int = Integer.parseInt(binding.valorDos.text.toString())
          binding.resultado.setText(uno+dos)
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