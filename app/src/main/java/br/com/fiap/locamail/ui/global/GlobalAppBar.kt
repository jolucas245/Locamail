package br.com.fiap.locamail.ui.global

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locamail.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GlobalAppBar(){
    TopAppBar(
        navigationIcon = {
            Icon(
                imageVector = Icons.Outlined.Menu,
                contentDescription = null,
                tint = Color.DarkGray,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(50.dp)
                    .padding(start = 10.dp)
            )
        },
        title = {
            Image(
                painter = painterResource(id = R.drawable.locaweb_mailer_logo),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .fillMaxHeight()
                    .width(100.dp)
            )
        },
        actions = {
            Text(text = "Hermes", fontSize = 18.sp, color = Color.DarkGray)
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painter = painterResource(id = R.drawable.perfil_logo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
        ),
    )
}