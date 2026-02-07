package com.example.shopmobile.feature.products.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

sealed interface ProductsEvent {
    data object Refresh : ProductsEvent
}

class ProductsViewModel : ViewModel() {
    var state by mutableStateOf(
        ProductsUiState(
        products = listOf(
            ProductUi("1", "T-Shirt", "199"),
            ProductUi("2", "T-Shirt Again", "299"),
            ProductUi("3", "Belt", "39"),
            ProductUi("4", "Hoodie", "99")
        )
    ))
        private set

    fun onEvent(event: ProductsEvent) {
        when (event) {
            ProductsEvent.Refresh -> {
                //Later do stuff
            }
        }
    }
}