package com.example.shopmobile.feature.products.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ProductsRoute() {
    val vm: ProductsViewModel = viewModel()
    val state = vm.state

    ProductsScreen(state = state, onEvent = vm::onEvent)
}