package com.example.shopmobile.feature.products.data.mapper

import com.example.shopmobile.feature.products.domain.model.Product
import com.example.shopmobile.feature.products.ui.ProductUi

fun Product.toUi(): ProductUi {
    return ProductUi(
        id = id.toString(),
        name = name,
        priceText = "$${price.toString()}"
    )
}