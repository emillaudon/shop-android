package com.example.shopmobile.feature.cart

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.shopmobile.feature.products.data.ProductsRepositoryImpl
import com.example.shopmobile.feature.products.domain.ProductsRepository
import com.example.shopmobile.feature.products.ui.ProductsEvent
import com.example.shopmobile.feature.products.ui.ProductsUiState



class CartViewModel(
    private val repository: ProductsRepository = ProductsRepositoryImpl()
) : ViewModel() {

    var state by mutableStateOf(CartUiState())
        private set

    init {

    }
    fun onEvent(event: ProductsEvent) {

    }


}