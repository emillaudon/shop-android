package com.example.shopmobile.feature.products.data.mapper

import com.example.shopmobile.feature.products.data.remote.ProductDto
import com.example.shopmobile.feature.products.domain.model.Product

private const val BASE_URL = "http://10.0.2.2:8080"
fun ProductDto.toDomain(): Product {
    return Product(
        id = id,
        name = name,
        price = price,
        stock = stock,
        imageUrl = imageUrl ?.let { BASE_URL + it } ?: ""
    )
}