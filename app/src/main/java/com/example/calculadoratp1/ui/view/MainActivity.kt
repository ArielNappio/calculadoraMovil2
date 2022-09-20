package com.example.calculadoratp1.ui.view

import android.os.Bundle
import android.text.Editable
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoratp1.databinding.ActivityMainBinding
import com.example.calculadoratp1.ui.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttomAddition.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"+")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text = Editable.Factory.getInstance().newEditable(vm.getOperation())
                binding.inputNro.text.clear()
                binding.textOperations.text = vm.getOperation()
            }catch(e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomSubstraction.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"-")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
                binding.textOperations.text = vm.getOperation()
            }catch(e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomMultiplication.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"*")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
                binding.textOperations.text = vm.getOperation()
            }catch (e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomDivision.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"/")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text.clear()
                binding.textOperations.text = vm.getOperation()
            }catch (e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomAc.setOnClickListener{
            vm.clear()
            binding.inputNro.text.clear()
            binding.textResult.text = ""
            binding.textOperations.text = ""
            vm.results.add(0.0)
        }

        binding.buttomDel.setOnClickListener{
            deleteChar()
        }
    }

    fun deleteChar(){
        try{
            binding.inputNro.setText(binding.inputNro.text.substring(0,binding.inputNro.text.length -1))
        }catch (e: Exception){
            Snackbar.make(binding.root, "No hay texto que borrar", Snackbar.LENGTH_SHORT).show()
        }
    }


}