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
fun rememberRefresh(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "refresh",
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
                moveTo(20.125f, 31.542f)
                quadToRelative(-4.792f, 0f, -8.167f, -3.354f)
                quadTo(8.583f, 24.833f, 8.583f, 20f)
                reflectiveQuadToRelative(3.355f, -8.187f)
                quadToRelative(3.354f, -3.355f, 8.229f, -3.355f)
                quadToRelative(3.125f, 0f, 5.729f, 1.48f)
                quadToRelative(2.604f, 1.479f, 4.187f, 4.104f)
                verticalLineTo(9.083f)
                quadToRelative(0f, -0.25f, 0.188f, -0.437f)
                quadToRelative(0.187f, -0.188f, 0.479f, -0.188f)
                quadToRelative(0.333f, 0f, 0.521f, 0.188f)
                quadToRelative(0.187f, 0.187f, 0.187f, 0.437f)
                verticalLineTo(15.5f)
                quadToRelative(0f, 0.542f, -0.333f, 0.875f)
                quadToRelative(-0.333f, 0.333f, -0.833f, 0.333f)
                horizontalLineToRelative(-6.417f)
                quadToRelative(-0.333f, 0f, -0.5f, -0.208f)
                quadToRelative(-0.167f, -0.208f, -0.167f, -0.5f)
                quadToRelative(0f, -0.25f, 0.167f, -0.458f)
                quadToRelative(0.167f, -0.209f, 0.5f, -0.209f)
                horizontalLineToRelative(5.417f)
                quadToRelative(-1.375f, -2.541f, -3.771f, -4.041f)
                quadToRelative(-2.396f, -1.5f, -5.354f, -1.5f)
                quadToRelative(-4.292f, 0f, -7.271f, 2.979f)
                reflectiveQuadTo(9.917f, 20f)
                quadToRelative(0f, 4.25f, 2.958f, 7.229f)
                reflectiveQuadToRelative(7.292f, 2.979f)
                quadToRelative(3.083f, 0f, 5.687f, -1.729f)
                reflectiveQuadToRelative(3.813f, -4.646f)
                quadToRelative(0.041f, -0.166f, 0.229f, -0.291f)
                quadToRelative(0.187f, -0.125f, 0.396f, -0.125f)
                quadToRelative(0.375f, 0f, 0.562f, 0.271f)
                quadToRelative(0.188f, 0.27f, 0.063f, 0.604f)
                quadToRelative(-1.292f, 3.291f, -4.229f, 5.27f)
                quadToRelative(-2.938f, 1.98f, -6.563f, 1.98f)
                close()
            }
        }.build()
    }
}