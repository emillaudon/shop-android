package com.example.shopmobile.feature.products.data.remote

import retrofit2.http.GET

interface ProductService {

    @GET("products")
    suspend fun getAllProducts(): List<ProductDto>
}