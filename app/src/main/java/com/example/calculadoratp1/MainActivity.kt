package com.example.calculadoratp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.rotationMatrix
import com.example.calculadoratp1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var nro1: Double = 0.0
    private var nro2: Double = 0.0
    private var result: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttomAddition.setOnClickListener {
            sumar()
        }

        binding.buttomSubstraction.setOnClickListener {
            restar()
        }

        binding.buttomMultiplication.setOnClickListener {
            multiplicar()
        }

        binding.buttomDivision.setOnClickListener {
            dividir()
        }

        binding.buttomEquals.setOnClickListener {
            binding.textResult.text = result.toString()
        }
    }

    private fun sumar() {
        if (isEmpty()) {
            setResultToCero()
        } else {
            binding.textOperator.text = "+"
            this.nro1 = binding.inputNro1.text.toString().toDouble()
            this.nro2 = binding.inputNro2.text.toString().toDouble()
            result = this.nro1 + this.nro2
        }
    }

    private fun restar() {
        if (isEmpty()) {
            setResultToCero()
        } else {
            binding.textOperator.text = "-"
            this.nro1 = binding.inputNro1.text.toString().toDouble()
            this.nro2 = binding.inputNro2.text.toString().toDouble()
            result = this.nro1 - this.nro2
        }
    }

    private fun multiplicar() {
        if (isEmpty()) {
            setResultToCero()
        } else {
            binding.textOperator.text = "*"
            this.nro1 = binding.inputNro1.text.toString().toDouble()
            this.nro2 = binding.inputNro2.text.toString().toDouble()
            result = this.nro1 * this.nro2
        }
    }

    private fun dividir() {
        if (isEmpty()) {
            setResultToCero()
        } else {
            binding.textOperator.text = "/"
            this.nro1 = binding.inputNro1.text.toString().toDouble()
            this.nro2 = binding.inputNro2.text.toString().toDouble()
            result = this.nro1 / this.nro2
        }
    }

    private fun isEmpty(): Boolean {
        return binding.inputNro1.text.isEmpty() || binding.inputNro2.text.isEmpty()
    }

    private fun setResultToCero(){
        this.nro1 = 0.0
        this.nro2 = 0.0
        this.result = 0.0
        binding.textResult.text = "0.0"
        Snackbar.make(binding.root, "Completa los campos", Snackbar.LENGTH_SHORT).show()
    }
}