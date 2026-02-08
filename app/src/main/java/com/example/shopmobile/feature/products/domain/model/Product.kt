package com.example.shopmobile.feature.products.domain.model

data class Product(
    val id: Long,
    val name: String,
    val price: Int,
    val stock: Int,
    val imageUrl: String
)