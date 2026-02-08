package com.example.shopmobile.feature.products.data.mapper

import com.example.shopmobile.feature.products.data.remote.ProductDto
import com.example.shopmobile.feature.products.domain.model.Product

fun ProductDto.toDomain(): Product {
    return Product(
        id = id,
        name = name,
        price = price,
        stock = stock,
        imageUrl = imageUrl ?: ""
    )
}