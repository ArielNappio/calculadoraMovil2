package com.example.calculadoratp1.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.calculadoratp1.data.model.CalculatorModel

class MainViewModel():ViewModel(){

    val results = mutableListOf<Double>()
    private val operations = mutableListOf<CalculatorModel>()
    private var oper = arrayListOf<String>()


    fun calculate(nro: Double, operator: String){
        if(results.isNotEmpty()) {
            when (operator) {
                "+" -> {
                    results.add(results.last() + nro)
                }
                "-" -> {
                    results.add(results.last() - nro)
                }
                "*" -> {
                    results.add(results.last() * nro)
                }
                "/" -> {
                    results.add(results.last() / nro)
                }
            }
        }else{
            results.add(nro)
        }
        oper.add(operator)
        oper.add(nro.toString())
        operations.add(CalculatorModel(oper,results.last()))
    }

    fun getOperation():String{
        if(operations.isNotEmpty()){
            var sb = StringBuilder()

            for (actual in operations.last().operationsString){
                sb.append(actual)
                sb.append(" ")
            }

            /*
            sb.append(operations.last().nro1.toString())
            sb.append(" " + operations.last().operator + " ")
            sb.append(operations.last().nro2.toString())
            sb.append(" = ")
             */
            return sb.toString()
        }
        return "No hay operaciones"
    }

    fun clear(){
        results.clear()
        operations.clear()
        oper.clear()
    }
}