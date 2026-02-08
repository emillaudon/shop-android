package com.example.shopmobile.feature.products.domain

import com.example.shopmobile.feature.products.data.remote.ProductApi
import com.example.shopmobile.feature.products.data.remote.ProductDto
import com.example.shopmobile.feature.products.domain.model.Product

interface ProductsRepository {
    suspend fun getProducts(): Result<List<Product>>
}