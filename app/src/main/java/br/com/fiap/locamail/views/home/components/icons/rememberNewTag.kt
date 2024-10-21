package br.com.fiap.locamail.views.home.components.icons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun rememberNewTag() {
    Box(
        modifier = Modifier
            .width(30.dp)
            .height(16.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xff00B3FF)),
        contentAlignment = Alignment.Center
    ) {
        BasicText(
            text = "Novo",
            modifier = Modifier.padding(vertical = 4.dp),
            style = TextStyle(
                fontSize = 8.sp,
                color = Color.White,
                fontWeight = FontWeight.Normal,
            )
        )
    }
}