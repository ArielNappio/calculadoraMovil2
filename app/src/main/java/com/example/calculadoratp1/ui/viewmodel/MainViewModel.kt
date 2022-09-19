package com.example.calculadoratp1.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.calculadoratp1.data.model.CalculatorModel
import com.example.calculadoratp1.data.model.CalculatorProvider
import kotlinx.coroutines.launch

class MainViewModel():ViewModel(){
    init{
        var actualOperation: CalculatorModel
    }

    fun onCreate() {
        viewModelScope.launch {
            val operationsLd = CalculatorProvider()

            if(operationsLd != null){

            }
        }
    }



}