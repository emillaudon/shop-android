package com.example.shopmobile.feature.products.ui

data class ProductsUiState(
    val products: List<ProductUi> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null

)

data class ProductUi(
    val id: String,
    val name: String,
    val priceText: String
)