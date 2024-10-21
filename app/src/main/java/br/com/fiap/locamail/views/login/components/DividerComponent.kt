package br.com.fiap.locamail.views.login.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DividerComponent() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 36.dp)
    ) {
        Divider(
            modifier = Modifier
                .weight(1f)
                .height(1.dp),
            color = Color.Gray
        )
        Text(
            text = " Ou ",
            color = Color.DarkGray,
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Divider(
            modifier = Modifier
                .weight(1f)
                .height(1.dp),
            color = Color.Gray
        )
    }
}