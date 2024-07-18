package com.example.routetask.repository

import com.example.routetask.model.Product
import com.example.routetask.network.ApiService
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getProducts(): List<Product> {
        val response = apiService.getProducts()
        return response.body()?.products ?: emptyList()
    }
}