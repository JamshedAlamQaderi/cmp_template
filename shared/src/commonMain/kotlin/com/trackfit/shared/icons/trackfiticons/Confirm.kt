package com.trackfit.shared.icons.trackfiticons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.trackfit.shared.icons.TrackFitIcons

public val TrackFitIcons.Confirm: ImageVector
    get() {
        if (_confirm != null) {
            return _confirm!!
        }
        _confirm = Builder(name = "Confirm", defaultWidth = 16.0.dp, defaultHeight = 13.0.dp,
                viewportWidth = 16.0f, viewportHeight = 13.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFBCFA5C)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.1561f, 3.9931f)
                    curveTo(3.0679f, 3.9028f, 2.9482f, 3.8521f, 2.8234f, 3.8521f)
                    curveTo(2.6986f, 3.8521f, 2.579f, 3.9028f, 2.4907f, 3.9931f)
                    lineTo(0.1378f, 6.4005f)
                    curveTo(0.0496f, 6.4908f, 0.0f, 6.6132f, 0.0f, 6.7409f)
                    curveTo(0.0f, 6.8685f, 0.0496f, 6.991f, 0.1378f, 7.0813f)
                    lineTo(5.7848f, 12.8591f)
                    curveTo(5.8731f, 12.9493f, 5.9928f, 13.0f, 6.1175f, 13.0f)
                    curveTo(6.2423f, 13.0f, 6.362f, 12.9493f, 6.4503f, 12.8591f)
                    lineTo(15.862f, 3.2294f)
                    curveTo(15.9502f, 3.1391f, 15.9998f, 3.0167f, 15.9998f, 2.889f)
                    curveTo(15.9998f, 2.7614f, 15.9502f, 2.6389f, 15.862f, 2.5486f)
                    lineTo(13.5091f, 0.1412f)
                    curveTo(13.4208f, 0.051f, 13.3012f, 2.0E-4f, 13.1764f, 2.0E-4f)
                    curveTo(13.0516f, 2.0E-4f, 12.9319f, 0.051f, 12.8437f, 0.1412f)
                    lineTo(6.1175f, 7.023f)
                    lineTo(3.1561f, 3.9931f)
                    close()
                }
            }
        }
        .build()
        return _confirm!!
    }

private var _confirm: ImageVector? = null
