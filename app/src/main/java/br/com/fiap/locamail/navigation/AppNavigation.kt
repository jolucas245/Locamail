package br.com.fiap.locamail.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.fiap.locamail.views.calander.CalendarView
import br.com.fiap.locamail.views.home.HomeView
import br.com.fiap.locamail.views.login.LoginView
import br.com.fiap.locamail.views.send.SendView

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AppNavigation(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = "calendar"/*voltar para home*/){
        composable("login"){
            LoginView(navController)
        }
        composable("home"){
            HomeView(navController)
        }
        composable("send"){
            SendView(navController)
        }
        composable("calendar"){
            CalendarView(navController)
        }
    }
}