package br.com.fiap.locamail

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.com.fiap.locamail.navigation.AppNavigation
import br.com.fiap.locamail.ui.global.BottomNavigation
import br.com.fiap.locamail.ui.global.GlobalAppBar
import br.com.fiap.locamail.ui.theme.LocamailTheme
import br.com.fiap.locamail.views.home.HomeView
import br.com.fiap.locamail.views.login.LoginView

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LocamailTheme {
                MainView()
            }
        }
    }
}

@Composable
fun MainView(){
    val navController = rememberNavController()
    Scaffold(
        topBar = {
            if(navController.currentBackStackEntryAsState().value?.destination?.route == "home"){
                GlobalAppBar()
            }
        },
        bottomBar = {
            if(navController.currentBackStackEntryAsState().value?.destination?.route == "home"){
                BottomNavigation(navHostController = navController)
            }
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(modifier = Modifier
                .padding(paddingValues)
                .padding(0.dp)
                .fillMaxSize()){
                AppNavigation(navController = navController)
            }
        }

    }
}