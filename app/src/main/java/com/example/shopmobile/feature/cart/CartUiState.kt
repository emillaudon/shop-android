package com.example.shopmobile.feature.cart

import com.example.shopmobile.feature.products.ui.ProductUi

data class CartUiState(
    val products: List<ProductUi> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null

)