package com.example.calculadoratp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoratp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private var nro1: Double = 0.0
    private var nro2: Double = 0.0
    private var result: Double = 0.0
    private val sb = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttomSuma.setOnClickListener {
            evaluateExpression("+", clear = true)
        }

        binding.buttomResta.setOnClickListener {
            evaluateExpression("-", clear = true)
        }

        binding.buttomMultiplicacion.setOnClickListener {
            evaluateExpression("*", clear = true)
        }

        binding.buttomDivision.setOnClickListener {
            evaluateExpression("/", clear = true)
        }

        /*
        binding.textResultado.setOnClickListener{
            binding.textResultado.setText(result.toString())
        }*/

        binding.buttom1.setOnClickListener{
            evaluateExpression("1", clear = true)
        }
    }

    /*
    fun sumar(){
        this.nro1 = binding.valorUno.text.toString().toDouble()
        this.nro2 = binding.valorDos.text.toString().toDouble()
        result = this.nro1 + this.nro2
    }

    fun restar(){
        this.nro1 = binding.valorUno.text.toString().toDouble()
        this.nro2 = binding.valorDos.text.toString().toDouble()
        result = this.nro1 - this.nro2
    }

    fun multiplicar(){
        this.nro1 = binding.valorUno.text.toString().toDouble()
        this.nro2 = binding.valorDos.text.toString().toDouble()
        result = this.nro1 * this.nro2
    }

    fun dividir(){
        this.nro1 = binding.valorUno.text.toString().toDouble()
        this.nro2 = binding.valorDos.text.toString().toDouble()
        result = this.nro1 / this.nro2
    }*/

    fun evaluateExpression(string: String, clear: Boolean) {
        if(clear) {

            binding.textResultado.setText("")
            sb.append(string)
        } else {
            sb.append(binding.textResultado.text)
            sb.append(string)
            binding.textResultado.setText("")
        }
    }
}