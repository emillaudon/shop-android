package com.example.shopmobile.feature.cart

import android.R
import com.example.shopmobile.feature.products.ui.ProductUi

data class CartUiState(
    val products: List<ProductUi> = emptyList(),
    val isEmpty: Boolean = true,
    val isLoading: Boolean = false,
    val error: String? = null

)

data class CartProductUi(
    val id: String,
    val name: String,
    val priceText: String,
    val qty: Number,
    val imageUrl: String
)