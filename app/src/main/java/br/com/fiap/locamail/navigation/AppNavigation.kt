package br.com.fiap.locamail.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.locamail.views.home.HomeView
import br.com.fiap.locamail.views.login.LoginView

@Composable
fun AppNavigation(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = "home"){
        composable("login"){
            LoginView(navController)
        }
        composable("home"){
            HomeView(navController)
        }
    }
}