package br.com.fiap.locamail.ui.global

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.fiap.locamail.models.ItemsNavBottom

@Composable
fun BottomNavigation(
    navHostController: NavHostController
) {
    val items = listOf(
        ItemsNavBottom.ItemsNavBottom1,
        ItemsNavBottom.ItemsNavBottom2,
        ItemsNavBottom.ItemsNavBottom3,
        ItemsNavBottom.ItemsNavBottom4
    )
    BottomAppBar(
        containerColor = Color.White,
    ) {
        NavigationBar(
            containerColor = Color.White
        ) {
            items.forEach{
                val selected = NavigationIndicator(navController = navHostController) == it.route
                NavigationBarItem(
                    label = {
                        Text(text = it.title, color = if(selected) Color(0xffF10445) else Color.Gray)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        indicatorColor = Color.White
                    ),
                    selected = selected,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = it.icon,
                            tint = if(selected) Color(0xffF10445) else Color.Gray,
                            contentDescription = it.title
                        )
                    }
                )
            }
        }
    }
}