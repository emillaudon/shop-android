package com.example.shopmobile.feature.products.data

import com.example.shopmobile.feature.products.data.remote.ProductApi
import com.example.shopmobile.feature.products.data.remote.ProductDto

class ProductsRepositoryImpl {

    suspend fun getProducts(): List<ProductDto> {
        return ProductApi.service.getAllProducts()
    }
}