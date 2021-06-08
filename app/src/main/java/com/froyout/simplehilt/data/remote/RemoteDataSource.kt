package com.froyout.simplehilt.data.remote

import javax.inject.Inject

class RemoteDataSource @Inject constructor(){
    fun getHello(): String{
        return "Hello WOrld"
    }
}