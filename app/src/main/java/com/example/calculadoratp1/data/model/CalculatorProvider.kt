package com.example.calculadoratp1.data.model


class CalculatorProvider {

    lateinit var operation: CalculatorModel
    var operations:MutableList<CalculatorModel> = emptyList<CalculatorModel>().toMutableList()

    fun addOperation(number1:Double,number2:Double,operator:String){
        operation = CalculatorModel(number1,number2,operator)
        operations.add(operation)
    }
}