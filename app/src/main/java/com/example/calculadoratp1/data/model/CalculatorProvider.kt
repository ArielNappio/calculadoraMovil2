package com.example.calculadoratp1.data.model

import com.example.calculadoratp1.data.network.CalculatorService


class CalculatorProvider {

    lateinit var operation: CalculatorModel
    private var operations:MutableList<CalculatorModel> = emptyList<CalculatorModel>().toMutableList()

    fun addOperation(number1:Double,number2:Double,operator:String){
        operation = CalculatorModel(number1,number2,operator)
        operations.add(operation)
    }

    @JvmName("getOperations1")
    fun getOperations():MutableList<CalculatorModel>{
        return operations
    }
}