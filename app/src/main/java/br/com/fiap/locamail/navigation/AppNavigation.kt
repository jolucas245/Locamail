package br.com.fiap.locamail.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.fiap.locamail.views.home.HomeView
import br.com.fiap.locamail.views.login.LoginView
import br.com.fiap.locamail.views.send.SendView

@Composable
fun AppNavigation(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = "send"/*voltar para home*/){
        composable("login"){
            LoginView(navController)
        }
        composable("home"){
            HomeView(navController)
        }
        composable("send"){
            SendView(navController)
        }
    }
}