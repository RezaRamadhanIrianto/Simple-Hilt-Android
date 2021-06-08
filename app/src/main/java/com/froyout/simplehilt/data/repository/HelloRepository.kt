package com.froyout.simplehilt.data.repository

import com.froyout.simplehilt.data.remote.RemoteDataSource
import com.froyout.simplehilt.data.service.HelloService
import javax.inject.Inject

class HelloRepository @Inject constructor(private val remote: RemoteDataSource) : HelloService{
    override fun getHello(): String {
        return remote.getHello()
    }
}