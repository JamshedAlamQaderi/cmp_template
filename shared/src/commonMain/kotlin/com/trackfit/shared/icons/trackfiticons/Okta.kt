package com.trackfit.shared.icons.trackfiticons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.trackfit.shared.icons.TrackFitIcons

public val TrackFitIcons.Okta: ImageVector
    get() {
        if (_okta != null) {
            return _okta!!
        }
        _okta = Builder(name = "Okta", defaultWidth = 26.0.dp, defaultHeight = 26.0.dp,
                viewportWidth = 26.0f, viewportHeight = 26.0f).apply {
            path(fill = SolidColor(Color(0xFF40865C)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.1667f)
                curveTo(7.0417f, 2.1667f, 2.1667f, 7.0417f, 2.1667f, 13.0f)
                curveTo(2.1667f, 18.9583f, 7.0417f, 23.8333f, 13.0f, 23.8333f)
                curveTo(18.9583f, 23.8333f, 23.8333f, 18.9583f, 23.8333f, 13.0f)
                curveTo(23.8333f, 7.0417f, 18.9583f, 2.1667f, 13.0f, 2.1667f)
                close()
                moveTo(18.4167f, 13.0f)
                curveTo(18.4167f, 16.0333f, 16.0333f, 18.4167f, 13.0f, 18.4167f)
                curveTo(9.9667f, 18.4167f, 7.5833f, 16.0333f, 7.5833f, 13.0f)
                curveTo(7.5833f, 9.9667f, 9.9667f, 7.5833f, 13.0f, 7.5833f)
                curveTo(16.0333f, 7.5833f, 18.4167f, 9.9667f, 18.4167f, 13.0f)
                close()
            }
        }
        .build()
        return _okta!!
    }

private var _okta: ImageVector? = null
