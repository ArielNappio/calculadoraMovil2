package com.example.calculadoratp1.data.network

import org.koin.dsl.module

class CalculatorService {
    val myModule = module {

        // declare single instance for MyService class
        single { CalculatorService() }
    }

}