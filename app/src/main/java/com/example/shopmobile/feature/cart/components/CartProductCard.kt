package com.example.shopmobile.feature.cart.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.shopmobile.feature.products.ui.ProductUi

@Composable
public fun CartProductCard(
    product: ProductUi
) {
    Card(
        modifier = Modifier.background(Color.Black)
            .height(100.dp)
            .fillMaxWidth()
    ) {

    }
}