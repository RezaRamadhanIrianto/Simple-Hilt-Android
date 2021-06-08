package com.froyout.simplehilt.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.froyout.simplehilt.data.repository.HelloRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HelloViewModel @Inject constructor(private val repo: HelloRepository) : ViewModel() {
    fun getHello(): String{
        return repo.getHello()
    }
}