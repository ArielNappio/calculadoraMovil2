package com.example.calculadoratp1.ui.view

import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoratp1.databinding.ActivityMainBinding
import com.example.calculadoratp1.ui.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val vm: MainViewModel by viewModels()

    private var sb = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttomAddition.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"+")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text = ""
                sb.setLength(0)
                binding.textOperations.text = vm.getOperation()
            }catch(e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomSubstraction.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"-")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text = ""
                sb.setLength(0)
                binding.textOperations.text = vm.getOperation()
            }catch(e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomMultiplication.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"*")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text = ""
                sb.setLength(0)
                binding.textOperations.text = vm.getOperation()
            }catch (e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomDivision.setOnClickListener {
            try{
                vm.calculate(binding.inputNro.text.toString().toDouble(),"/")
                binding.textResult.text = vm.results.last().toString()
                binding.inputNro.text = ""
                sb.setLength(0)
                binding.textOperations.text = vm.getOperation()
            }catch (e: Exception){
                Snackbar.make(binding.root, "Completa el campo", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.buttomAc.setOnClickListener{
            vm.clear()
            sb.setLength(0)
            binding.inputNro.text = ""
            binding.textResult.text = ""
            binding.textOperations.text = ""
            vm.results.add(0.0)
        }

        binding.buttomDel.setOnClickListener{
            deleteChar()
        }

        //       PROBLEMAS AL CALCULAR
        binding.buttomEquals.setOnClickListener{
            try{
                if(vm.results.isNotEmpty())
                    binding.inputNro.text = vm.results.last().toString()
                else
                    vm.results.add(binding.inputNro.text.toString().toDouble())
                binding.textResult.text = binding.inputNro.text
            }
            catch(e: Exception){
            }

        }

        binding.buttomCero.setOnClickListener{
            addInput("0")
        }

        binding.buttomOne.setOnClickListener{
            addInput("1")
        }

        binding.buttomTwo.setOnClickListener{
            addInput("2")
        }

        binding.buttomThree.setOnClickListener{
            addInput("3")
        }

        binding.buttomFour.setOnClickListener{
            addInput("4")
        }

        binding.buttomFive.setOnClickListener{
            addInput("5")
        }

        binding.buttomSix.setOnClickListener{
            addInput("6")
        }

        binding.buttomSeven.setOnClickListener{
            addInput("7")
        }

        binding.buttomEight.setOnClickListener{
            addInput("8")
        }

        binding.buttomNine.setOnClickListener{
            addInput("9")
        }

    }

    private fun deleteChar(){
        try{
            binding.inputNro.text = binding.inputNro.text.substring(0,binding.inputNro.text.length -1)
            sb.setLength(sb.length - 1)
        }catch (e: Exception){
            Snackbar.make(binding.root, "No hay texto que borrar", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun addInput(value: String){
        sb.append(value)
        binding.inputNro.text = sb.toString()
    }


}