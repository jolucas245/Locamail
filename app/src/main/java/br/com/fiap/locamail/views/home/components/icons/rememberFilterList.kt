package br.com.fiap.locamail.views.home.components.icons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Composable
fun rememberFilterList(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "filter_list",
            defaultWidth = 40.0.dp,
            defaultHeight = 40.0.dp,
            viewportWidth = 40.0f,
            viewportHeight = 40.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(18.208f, 28.875f)
                quadToRelative(-0.291f, 0f, -0.479f, -0.187f)
                quadToRelative(-0.187f, -0.188f, -0.187f, -0.48f)
                quadToRelative(0f, -0.291f, 0.187f, -0.5f)
                quadToRelative(0.188f, -0.208f, 0.479f, -0.208f)
                horizontalLineToRelative(3.584f)
                quadToRelative(0.291f, 0f, 0.479f, 0.208f)
                quadToRelative(0.187f, 0.209f, 0.187f, 0.5f)
                quadToRelative(0f, 0.292f, -0.187f, 0.48f)
                quadToRelative(-0.188f, 0.187f, -0.479f, 0.187f)
                close()
                moveTo(6.625f, 10.958f)
                quadToRelative(-0.333f, 0f, -0.521f, -0.187f)
                quadToRelative(-0.187f, -0.188f, -0.187f, -0.479f)
                quadToRelative(0f, -0.292f, 0.187f, -0.5f)
                quadToRelative(0.188f, -0.209f, 0.521f, -0.209f)
                horizontalLineToRelative(26.792f)
                quadToRelative(0.291f, 0f, 0.479f, 0.209f)
                quadToRelative(0.187f, 0.208f, 0.187f, 0.5f)
                quadToRelative(0f, 0.291f, -0.187f, 0.479f)
                quadToRelative(-0.188f, 0.187f, -0.479f, 0.187f)
                close()
                moveToRelative(4.958f, 8.959f)
                quadToRelative(-0.291f, 0f, -0.5f, -0.188f)
                quadToRelative(-0.208f, -0.187f, -0.208f, -0.521f)
                quadToRelative(0f, -0.25f, 0.208f, -0.437f)
                quadToRelative(0.209f, -0.188f, 0.5f, -0.188f)
                horizontalLineToRelative(16.834f)
                quadToRelative(0.291f, 0f, 0.479f, 0.188f)
                quadToRelative(0.187f, 0.187f, 0.187f, 0.479f)
                reflectiveQuadToRelative(-0.187f, 0.479f)
                quadToRelative(-0.188f, 0.188f, -0.479f, 0.188f)
                close()
            }
        }.build()
    }
}