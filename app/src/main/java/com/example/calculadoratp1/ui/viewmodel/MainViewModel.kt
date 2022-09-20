package com.example.calculadoratp1.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.calculadoratp1.data.model.CalculatorModel

class MainViewModel():ViewModel(){

    val results = mutableListOf(0.0)
    private val operations = mutableListOf<CalculatorModel>()
    var resto: Double = 0.0


    fun calculate(nro: Double, operator: String){
        if(results.isNotEmpty()) {
            when (operator) {
                "+" -> {
                    resto = results.last()
                    results.add(results.last() + nro)
                }
                "-" -> {
                    resto = results.last()
                    results.add(results.last() - nro)
                }
                "*" -> {
                    resto = results.last()
                    results.add(results.last() * nro)
                }
                "/" -> {
                    resto = results.last()
                    results.add(results.last() / nro)
                }
            }
        }
        operations.add(CalculatorModel(resto,nro,results.last(),operator))
    }


    fun getOperation():String{
        if(operations.isNotEmpty()){
            var sb = StringBuilder()
            sb.append(operations.last().nro1.toString())
            sb.append(" " + operations.last().operator + " ")
            sb.append(operations.last().nro2.toString())
            sb.append(" = ")
            return sb.toString()
        }
        return "No hay operaciones"
    }


    fun clear(){
        results.clear()
        operations.clear()
        resto = 0.0
    }
}