package com.example.shopmobile.feature.products.data.remote

data class ProductDto(
    val id: Long,
    val name: String,
    val price: Int,
    val stock: Int,
    val imageUrl: String?
)