package com.example.shopmobile.feature.products.data

import com.example.shopmobile.feature.products.data.mapper.toDomain
import com.example.shopmobile.feature.products.data.remote.ProductApi
import com.example.shopmobile.feature.products.data.remote.ProductDto
import com.example.shopmobile.feature.products.domain.ProductsRepository
import com.example.shopmobile.feature.products.domain.model.Product

class ProductsRepositoryImpl: ProductsRepository {

    override  suspend fun getProducts(): Result<List<Product>> {
        return runCatching {
            val dtoList = ProductApi.service.getAllProducts()

            dtoList.map { dto -> dto.toDomain() }
        }
    }
}