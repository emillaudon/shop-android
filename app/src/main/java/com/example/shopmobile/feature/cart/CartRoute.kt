package com.example.shopmobile.feature.cart

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.shopmobile.feature.products.ui.ProductsScreen
import com.example.shopmobile.feature.products.ui.ProductsViewModel

@Composable
fun CartRoute() {
    val vm: ProductsViewModel = viewModel()
    val state = vm.state

    CartScreen(state = state, onEvent = vm::onEvent)
}