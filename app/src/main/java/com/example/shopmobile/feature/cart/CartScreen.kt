package com.example.shopmobile.feature.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopmobile.feature.cart.components.CartProductCard
import com.example.shopmobile.feature.products.ui.ProductUi
import com.example.shopmobile.feature.products.ui.ProductsEvent
import com.example.shopmobile.feature.products.ui.ProductsUiState
import com.example.shopmobile.feature.products.ui.components.ProductCard

@Composable
fun CartScreen(
    state: CartUiState,
    onEvent: (ProductsEvent) -> Unit
) {
    Column (
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Cart", color = Color.Black, fontSize = 34.sp, fontWeight = FontWeight.Bold)
        if (!state.isEmpty) {
            Text("Cart is empty", color = Color.Black)
        }else {
            LazyColumn() {
                item() {
                    CartProductCard(product = ProductUi("Id", name = "Product", "$200", imageUrl = "URL"))
                }
            }
            Text("Cart has items: ${state.products.size}", color = Color.Black) // om du har items
        }
    }
}