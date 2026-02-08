package com.example.shopmobile.feature.products.data.remote

import com.example.shopmobile.core.network.RetroFitProvider

object ProductApi {
    val service: ProductService by lazy {
        RetroFitProvider.retrofit.create(ProductService::class.java)
    }
}