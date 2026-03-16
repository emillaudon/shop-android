package com.example.shopmobile.feature.cart.data.mapper

import com.example.shopmobile.feature.cart.CartProductUi
import com.example.shopmobile.feature.products.ui.ProductUi

fun ProductUi.toCartUi() : CartProductUi {
    return CartProductUi(
        id = id.toString(),
        name = name,
        priceText = priceText,
        qty = 1, //TODO FIX QTY
        imageUrl = imageUrl,
    )
}