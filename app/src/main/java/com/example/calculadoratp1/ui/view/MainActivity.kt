package com.example.calculadoratp1.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewModelScope
import com.example.calculadoratp1.databinding.ActivityMainBinding
import com.example.calculadoratp1.ui.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar
import org.koin.android.ext.android.inject
import org.koin.dsl.module
import java.lang.Exception
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttomAddition.setOnClickListener {
            try{
                vm.calcular(binding.inputNro.text.toString().toDouble(),"+")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
            }catch(e: Exception){
            }

        }

        binding.buttomSubstraction.setOnClickListener {
            try{
                vm.calcular(binding.inputNro.text.toString().toDouble(),"-")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
            }catch(e: Exception){

            }

        }

        binding.buttomMultiplication.setOnClickListener {
            try{
                vm.calcular(binding.inputNro.text.toString().toDouble(),"*")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
            }catch (e: Exception){

            }

        }

        binding.buttomDivision.setOnClickListener {
            try{
                vm.calcular(binding.inputNro.text.toString().toDouble(),"/")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
            }catch (e: Exception){

            }

        }

    }

}