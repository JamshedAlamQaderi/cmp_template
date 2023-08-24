package com.trackfit.shared.icons.trackfiticons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.trackfit.shared.icons.TrackFitIcons

public val TrackFitIcons.Plus: ImageVector
    get() {
        if (_plus != null) {
            return _plus!!
        }
        _plus = Builder(name = "Plus", defaultWidth = 22.0.dp, defaultHeight = 22.0.dp,
                viewportWidth = 22.0f, viewportHeight = 22.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFD2D2D3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.1223f, 9.1395f)
                    horizontalLineTo(13.1141f)
                    verticalLineTo(1.8778f)
                    curveTo(13.1141f, 0.8379f, 12.2719f, -0.0043f, 11.232f, -0.0043f)
                    curveTo(10.1922f, -0.0043f, 9.35f, 0.8379f, 9.35f, 1.8778f)
                    verticalLineTo(9.1395f)
                    horizontalLineTo(1.8734f)
                    curveTo(0.8422f, 9.1395f, 0.0f, 9.9817f, 0.0f, 11.0215f)
                    curveTo(0.0f, 12.0614f, 0.8422f, 12.9035f, 1.882f, 12.9035f)
                    horizontalLineTo(9.3586f)
                    verticalLineTo(20.1223f)
                    curveTo(9.3586f, 21.1621f, 10.2008f, 22.0043f, 11.2406f, 22.0043f)
                    curveTo(12.2805f, 22.0043f, 13.1227f, 21.1621f, 13.1227f, 20.1223f)
                    verticalLineTo(12.9035f)
                    horizontalLineTo(20.1309f)
                    curveTo(21.1707f, 12.9035f, 22.0129f, 12.0614f, 22.0129f, 11.0215f)
                    curveTo(22.0f, 9.9817f, 21.1621f, 9.1395f, 20.1223f, 9.1395f)
                    close()
                }
            }
        }
        .build()
        return _plus!!
    }

private var _plus: ImageVector? = null
