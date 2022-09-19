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

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var nro1: Double = 0.0
    private var nro2: Double = 0.0
    private var result: Double = 0.0
    private val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }


}