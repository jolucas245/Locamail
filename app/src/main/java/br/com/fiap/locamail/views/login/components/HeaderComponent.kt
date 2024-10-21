package br.com.fiap.locamail.views.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locamail.R

@Composable
fun HeaderComponent() {
    Image(
        modifier = Modifier
            .padding(top = 180.dp, bottom = 20.dp)
            .fillMaxWidth()
            .height(40.dp),
        painter = painterResource(id = R.drawable.locaweb_logo),
        contentDescription = null
    )
    Text(text = "Seus E-mails em um toque!", fontSize = 20.sp)
}