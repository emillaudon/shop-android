package com.example.shopmobile.feature.products.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shopmobile.feature.products.data.ProductsRepositoryImpl
import com.example.shopmobile.feature.products.data.mapper.toUi
import com.example.shopmobile.feature.products.domain.ProductsRepository
import kotlinx.coroutines.launch

sealed interface ProductsEvent {
    data object Refresh : ProductsEvent
    data class OnProductClick(val productId: String) : ProductsEvent
}

class ProductsViewModel(
    private val repository: ProductsRepository = ProductsRepositoryImpl()
) : ViewModel() {

    var state by mutableStateOf(ProductsUiState())
        private set

    init {
        loadProducts()
    }

    fun onEvent(event: ProductsEvent) {
        when (event) {
            ProductsEvent.Refresh -> {
                loadProducts()
            }

            is ProductsEvent.OnProductClick -> {
                //Add to cart etc
            }
        }
    }

    private fun loadProducts() {
        viewModelScope.launch {
            state = state.copy(isLoading = true, error = null)

            repository.getProducts()
                .onSuccess { products ->
                    val uiProducts = products.map { it.toUi() }

                    state = state.copy(
                        products = uiProducts,
                        isLoading = false
                    )
                }
                .onFailure { e ->
                    state = state.copy(
                        isLoading = false,
                        error = e.message?: "Something went wrong"
                    ) }
        }
    }
}