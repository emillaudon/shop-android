package com.example.shopmobile.feature.products.ui

data class ProductsUiState(
    val products: List<ProductUi> = emptyList()
)

data class ProductUi(
    val id: String,
    val name: String,
    val priceText: String
)