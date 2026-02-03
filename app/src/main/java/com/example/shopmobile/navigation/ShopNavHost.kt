package com.example.shopmobile.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shopmobile.feature.products.ui.ProductsRoute
import com.example.shopmobile.feature.products.ui.ProductsScreen

@Composable
fun ShopNavHost(navController: NavHostController,
                modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.PRODUCTS,
        modifier = modifier
    ) {
        composable(Routes.PRODUCTS) {
            ProductsRoute()
        }
    }
}