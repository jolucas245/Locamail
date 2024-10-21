package br.com.fiap.locamail.ui.global

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun NavigationIndicator(
    navController: NavHostController
): String? = navController.currentBackStackEntryAsState().value?.destination?.route
