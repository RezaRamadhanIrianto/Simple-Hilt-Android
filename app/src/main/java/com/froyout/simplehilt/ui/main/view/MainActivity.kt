package com.froyout.simplehilt.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import com.froyout.simplehilt.R
import com.froyout.simplehilt.databinding.ActivityMainBinding
import com.froyout.simplehilt.ui.main.viewmodel.HelloViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: HelloViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val str = viewModel.getHello()
        binding.hello.text = str


    }
}

//private val mainViewModel : MainViewModel by viewModels()
//    private lateinit var adapter: MainAdapter