package com.trackfit.shared.icons.trackfiticons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.trackfit.shared.icons.TrackFitIcons

public val TrackFitIcons.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.0.dp, defaultHeight = 21.0.dp,
                viewportWidth = 24.0f, viewportHeight = 21.0f).apply {
            path(fill = SolidColor(Color(0xFFCD0000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5645f, 3.9375f)
                verticalLineTo(3.9427f)
                curveTo(7.5145f, 3.9406f, 7.4645f, 3.9406f, 7.4145f, 3.9427f)
                curveTo(7.1425f, 3.9564f, 6.8799f, 4.0347f, 6.655f, 4.1694f)
                curveTo(6.4301f, 4.304f, 6.2515f, 4.4897f, 6.1384f, 4.7066f)
                curveTo(6.0252f, 4.9235f, 5.9819f, 5.1633f, 6.013f, 5.4001f)
                curveTo(6.0442f, 5.637f, 6.1486f, 5.8619f, 6.315f, 6.0506f)
                lineTo(10.1295f, 10.5013f)
                lineTo(6.315f, 14.9586f)
                curveTo(6.197f, 15.0965f, 6.1112f, 15.2533f, 6.0625f, 15.4202f)
                curveTo(6.0138f, 15.5871f, 6.0031f, 15.7608f, 6.0311f, 15.9313f)
                curveTo(6.0591f, 16.1018f, 6.1252f, 16.2658f, 6.2257f, 16.414f)
                curveTo(6.3261f, 16.5621f, 6.4589f, 16.6915f, 6.6165f, 16.7947f)
                curveTo(6.9348f, 17.0033f, 7.3347f, 17.0926f, 7.7282f, 17.0431f)
                curveTo(7.9231f, 17.0186f, 8.1105f, 16.9608f, 8.2798f, 16.8729f)
                curveTo(8.4491f, 16.785f, 8.597f, 16.6688f, 8.715f, 16.5309f)
                lineTo(12.0f, 12.6945f)
                lineTo(15.2865f, 16.5322f)
                curveTo(15.4021f, 16.6754f, 15.5493f, 16.7969f, 15.7195f, 16.8894f)
                curveTo(15.8897f, 16.982f, 16.0793f, 17.0437f, 16.2773f, 17.071f)
                curveTo(16.4752f, 17.0982f, 16.6773f, 17.0905f, 16.8718f, 17.0482f)
                curveTo(17.0662f, 17.006f, 17.249f, 16.93f, 17.4093f, 16.8249f)
                curveTo(17.5696f, 16.7197f, 17.7042f, 16.5875f, 17.8051f, 16.436f)
                curveTo(17.906f, 16.2846f, 17.9711f, 16.1169f, 17.9967f, 15.9431f)
                curveTo(18.0223f, 15.7692f, 18.0077f, 15.5926f, 17.9539f, 15.4237f)
                curveTo(17.9001f, 15.2548f, 17.8082f, 15.0971f, 17.6835f, 14.9599f)
                lineTo(13.872f, 10.5026f)
                lineTo(17.6835f, 6.0532f)
                curveTo(17.8617f, 5.8529f, 17.9696f, 5.6115f, 17.9939f, 5.3585f)
                curveTo(18.0182f, 5.1055f, 17.958f, 4.8517f, 17.8205f, 4.6281f)
                curveTo(17.6831f, 4.4045f, 17.4743f, 4.2207f, 17.2196f, 4.099f)
                curveTo(16.9649f, 3.9773f, 16.6753f, 3.923f, 16.386f, 3.9427f)
                curveTo(16.1691f, 3.9571f, 15.9583f, 4.0128f, 15.7684f, 4.1057f)
                curveTo(15.5785f, 4.1986f, 15.4141f, 4.3267f, 15.2865f, 4.4809f)
                lineTo(12.0f, 8.3186f)
                lineTo(8.7135f, 4.4809f)
                curveTo(8.5814f, 4.3202f, 8.4093f, 4.1879f, 8.2103f, 4.0938f)
                curveTo(8.0113f, 3.9997f, 7.7905f, 3.9462f, 7.5645f, 3.9375f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
