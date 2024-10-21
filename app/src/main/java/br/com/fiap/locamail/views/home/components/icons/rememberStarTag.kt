package br.com.fiap.locamail.views.home.components.icons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.fiap.locamail.R

@Composable
fun rememberStarTag(){
    Icon(
        painter = painterResource(id = R.drawable.round_star_24),
        contentDescription = null,
        modifier = Modifier.size(20.dp),
        tint = Color(0xffFFC700)
    )
}
