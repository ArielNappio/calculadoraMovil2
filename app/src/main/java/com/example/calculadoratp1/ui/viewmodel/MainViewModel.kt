package com.example.calculadoratp1.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.calculadoratp1.data.model.CalculatorModel
import com.example.calculadoratp1.data.model.CalculatorProvider
import kotlinx.coroutines.launch

class MainViewModel():ViewModel(){

    val results = mutableListOf(0.0)


    fun calcular(nro: Double, operator: String){
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
        }
    }

}