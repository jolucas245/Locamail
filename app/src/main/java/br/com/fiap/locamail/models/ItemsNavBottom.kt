package br.com.fiap.locamail.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material.icons.outlined.WarningAmber
import androidx.compose.material.icons.rounded.WarningAmber
import androidx.compose.ui.graphics.vector.ImageVector

sealed class ItemsNavBottom(
    val icon: ImageVector,
    val title: String,
    val route: String
){
    object ItemsNavBottom1: ItemsNavBottom(
        icon = Icons.Outlined.Inbox,
        title = "Entrada",
        route = "home"
    )
    object ItemsNavBottom2: ItemsNavBottom(
        icon = Icons.Outlined.Send,
        title = "Enviados",
        route = "sent"
    )
    object ItemsNavBottom3: ItemsNavBottom(
        icon = Icons.Rounded.WarningAmber,
        title = "Spam",
        route = "spam"
    )
    object ItemsNavBottom4: ItemsNavBottom(
        icon = Icons.Outlined.Star,
        title = "Favorito",
        route = "favs"
    )
}