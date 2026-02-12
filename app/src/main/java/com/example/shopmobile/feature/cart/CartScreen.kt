package com.example.shopmobile.feature.cart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.shopmobile.feature.products.ui.ProductsEvent
import com.example.shopmobile.feature.products.ui.ProductsUiState
import com.example.shopmobile.feature.products.ui.components.ProductCard

@Composable
fun CartScreen(
    state: CartUiState,
    onEvent: (ProductsEvent) -> Unit
) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {

    }
}