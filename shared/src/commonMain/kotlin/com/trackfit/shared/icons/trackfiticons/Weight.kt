package com.trackfit.shared.icons.trackfiticons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.trackfit.shared.icons.TrackFitIcons

public val TrackFitIcons.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 15.0.dp, defaultHeight = 15.0.dp,
                viewportWidth = 15.0f, viewportHeight = 15.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8745f, 1.2f)
                horizontalLineTo(2.6745f)
                curveTo(2.3763f, 1.2004f, 2.0903f, 1.3191f, 1.8794f, 1.53f)
                curveTo(1.6686f, 1.7408f, 1.5499f, 2.0268f, 1.5495f, 2.325f)
                verticalLineTo(12.525f)
                curveTo(1.5499f, 12.8233f, 1.6686f, 13.1092f, 1.8794f, 13.3201f)
                curveTo(2.0903f, 13.531f, 2.3763f, 13.6496f, 2.6745f, 13.65f)
                horizontalLineTo(12.8745f)
                curveTo(13.1727f, 13.6496f, 13.4587f, 13.531f, 13.6696f, 13.3201f)
                curveTo(13.8804f, 13.1092f, 13.9991f, 12.8233f, 13.9995f, 12.525f)
                verticalLineTo(2.325f)
                curveTo(13.9991f, 2.0268f, 13.8804f, 1.7408f, 13.6696f, 1.53f)
                curveTo(13.4587f, 1.3191f, 13.1727f, 1.2004f, 12.8745f, 1.2f)
                close()
                moveTo(13.5495f, 12.525f)
                curveTo(13.5495f, 12.704f, 13.4784f, 12.8757f, 13.3518f, 13.0023f)
                curveTo(13.2252f, 13.1289f, 13.0535f, 13.2f, 12.8745f, 13.2f)
                horizontalLineTo(2.6745f)
                curveTo(2.4955f, 13.2f, 2.3238f, 13.1289f, 2.1972f, 13.0023f)
                curveTo(2.0706f, 12.8757f, 1.9995f, 12.704f, 1.9995f, 12.525f)
                verticalLineTo(2.325f)
                curveTo(1.9995f, 2.146f, 2.0706f, 1.9743f, 2.1972f, 1.8477f)
                curveTo(2.3238f, 1.7211f, 2.4955f, 1.65f, 2.6745f, 1.65f)
                horizontalLineTo(12.8745f)
                curveTo(13.0535f, 1.65f, 13.2252f, 1.7211f, 13.3518f, 1.8477f)
                curveTo(13.4784f, 1.9743f, 13.5495f, 2.146f, 13.5495f, 2.325f)
                verticalLineTo(12.525f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9745f, 12.0f)
                horizontalLineTo(3.5745f)
                curveTo(3.5148f, 12.0f, 3.4576f, 12.0237f, 3.4154f, 12.0659f)
                curveTo(3.3732f, 12.1081f, 3.3495f, 12.1653f, 3.3495f, 12.225f)
                curveTo(3.3495f, 12.2847f, 3.3732f, 12.3419f, 3.4154f, 12.3841f)
                curveTo(3.4576f, 12.4263f, 3.5148f, 12.45f, 3.5745f, 12.45f)
                horizontalLineTo(11.9745f)
                curveTo(12.0342f, 12.45f, 12.0914f, 12.4263f, 12.1336f, 12.3841f)
                curveTo(12.1758f, 12.3419f, 12.1995f, 12.2847f, 12.1995f, 12.225f)
                curveTo(12.1995f, 12.1653f, 12.1758f, 12.1081f, 12.1336f, 12.0659f)
                curveTo(12.0914f, 12.0237f, 12.0342f, 12.0f, 11.9745f, 12.0f)
                close()
                moveTo(7.7745f, 2.55f)
                curveTo(5.9085f, 2.55f, 4.3125f, 3.159f, 3.1605f, 4.311f)
                lineTo(3.0f, 4.47f)
                lineTo(4.977f, 6.45f)
                lineTo(5.127f, 6.3495f)
                curveTo(5.9117f, 5.8315f, 6.8312f, 5.5553f, 7.7715f, 5.5553f)
                curveTo(8.7118f, 5.5553f, 9.6313f, 5.8315f, 10.416f, 6.3495f)
                lineTo(10.566f, 6.45f)
                lineTo(12.5475f, 4.47f)
                lineTo(12.3885f, 4.311f)
                curveTo(11.2365f, 3.159f, 9.6405f, 2.55f, 7.7745f, 2.55f)
                close()
                moveTo(10.512f, 5.871f)
                curveTo(9.4018f, 5.1898f, 8.077f, 4.9485f, 6.798f, 5.1945f)
                lineTo(5.8005f, 3.9825f)
                curveTo(5.7817f, 3.9596f, 5.7586f, 3.9407f, 5.7324f, 3.9268f)
                curveTo(5.7063f, 3.9129f, 5.6777f, 3.9043f, 5.6482f, 3.9014f)
                curveTo(5.6188f, 3.8986f, 5.589f, 3.9015f, 5.5607f, 3.9102f)
                curveTo(5.5324f, 3.9188f, 5.5061f, 3.9329f, 5.4833f, 3.9517f)
                curveTo(5.4604f, 3.9706f, 5.4415f, 3.9937f, 5.4276f, 4.0198f)
                curveTo(5.4137f, 4.0459f, 5.405f, 4.0745f, 5.4022f, 4.104f)
                curveTo(5.3993f, 4.1335f, 5.4023f, 4.1632f, 5.4109f, 4.1915f)
                curveTo(5.4196f, 4.2198f, 5.4337f, 4.2461f, 5.4525f, 4.269f)
                lineTo(6.3105f, 5.3115f)
                curveTo(5.864f, 5.4414f, 5.4368f, 5.6301f, 5.04f, 5.8725f)
                lineTo(3.6435f, 4.476f)
                curveTo(4.6935f, 3.5115f, 6.12f, 3.003f, 7.776f, 3.003f)
                curveTo(9.432f, 3.003f, 10.857f, 3.5115f, 11.9085f, 4.476f)
                lineTo(10.512f, 5.871f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
