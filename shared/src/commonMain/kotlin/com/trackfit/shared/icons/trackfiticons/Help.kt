package com.trackfit.shared.icons.trackfiticons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.trackfit.shared.icons.TrackFitIcons

public val TrackFitIcons.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(name = "Help", defaultWidth = 23.0.dp, defaultHeight = 23.0.dp,
                viewportWidth = 23.0f, viewportHeight = 23.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFAAABAF)), stroke = null, fillAlpha = 0.7f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(17.9688f, 2.9656f)
                    curveTo(19.2082f, 3.2854f, 20.125f, 4.4113f, 20.125f, 5.75f)
                    verticalLineTo(17.25f)
                    curveTo(20.125f, 18.8366f, 18.8366f, 20.125f, 17.25f, 20.125f)
                    horizontalLineTo(5.75f)
                    curveTo(4.1634f, 20.125f, 2.875f, 18.8366f, 2.875f, 17.25f)
                    verticalLineTo(17.1594f)
                    curveTo(3.1046f, 17.2184f, 3.3454f, 17.25f, 3.5938f, 17.25f)
                    horizontalLineTo(15.0938f)
                    curveTo(16.6804f, 17.25f, 17.9688f, 15.9616f, 17.9688f, 14.375f)
                    verticalLineTo(2.9656f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.7f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(8.9849f, 9.6498f)
                    curveTo(8.9849f, 9.3304f, 9.088f, 9.011f, 9.2941f, 8.6813f)
                    curveTo(9.5001f, 8.3515f, 9.799f, 8.0836f, 10.1905f, 7.8672f)
                    curveTo(10.5821f, 7.6509f, 11.0354f, 7.5478f, 11.5609f, 7.5478f)
                    curveTo(12.0452f, 7.5478f, 12.478f, 7.6406f, 12.8489f, 7.8157f)
                    curveTo(13.2199f, 7.9909f, 13.5084f, 8.2382f, 13.7145f, 8.5473f)
                    curveTo(13.9103f, 8.8564f, 14.0133f, 9.1965f, 14.0133f, 9.5571f)
                    curveTo(14.0133f, 9.8353f, 13.9618f, 10.0929f, 13.8381f, 10.299f)
                    curveTo(13.7248f, 10.5154f, 13.5908f, 10.7008f, 13.426f, 10.8554f)
                    curveTo(13.2714f, 11.0203f, 12.9829f, 11.2779f, 12.5707f, 11.6488f)
                    curveTo(12.4574f, 11.7519f, 12.3647f, 11.8446f, 12.2925f, 11.9167f)
                    curveTo(12.2307f, 11.9991f, 12.1792f, 12.0713f, 12.1483f, 12.1331f)
                    curveTo(12.1071f, 12.2052f, 12.0864f, 12.2671f, 12.0658f, 12.3392f)
                    curveTo(12.0452f, 12.401f, 12.0246f, 12.5143f, 11.9834f, 12.6792f)
                    curveTo(11.9216f, 13.0295f, 11.7155f, 13.2047f, 11.3858f, 13.2047f)
                    curveTo(11.2106f, 13.2047f, 11.0663f, 13.1429f, 10.9427f, 13.0295f)
                    curveTo(10.8294f, 12.9162f, 10.7675f, 12.7513f, 10.7675f, 12.5247f)
                    curveTo(10.7675f, 12.2361f, 10.8087f, 11.9991f, 10.8912f, 11.7931f)
                    curveTo(10.9839f, 11.587f, 11.0973f, 11.4015f, 11.2415f, 11.247f)
                    curveTo(11.3858f, 11.0924f, 11.5815f, 10.9069f, 11.8288f, 10.6905f)
                    curveTo(12.0452f, 10.5051f, 12.1998f, 10.3608f, 12.2925f, 10.2681f)
                    curveTo(12.3853f, 10.1753f, 12.4677f, 10.062f, 12.5295f, 9.9487f)
                    curveTo(12.6016f, 9.825f, 12.6326f, 9.7014f, 12.6326f, 9.5674f)
                    curveTo(12.6326f, 9.2995f, 12.5295f, 9.0728f, 12.3337f, 8.8873f)
                    curveTo(12.138f, 8.7019f, 11.8804f, 8.6091f, 11.5609f, 8.6091f)
                    curveTo(11.19f, 8.6091f, 10.9221f, 8.7019f, 10.7469f, 8.8873f)
                    curveTo(10.5718f, 9.0728f, 10.4275f, 9.351f, 10.3039f, 9.7117f)
                    curveTo(10.1905f, 10.0929f, 9.9741f, 10.2784f, 9.6547f, 10.2784f)
                    curveTo(9.4692f, 10.2784f, 9.3044f, 10.2166f, 9.1807f, 10.0826f)
                    curveTo(9.0468f, 9.9487f, 8.9849f, 9.8044f, 8.9849f, 9.6498f)
                    close()
                    moveTo(11.4373f, 15.4201f)
                    curveTo(11.2312f, 15.4201f, 11.056f, 15.3583f, 10.9015f, 15.2243f)
                    curveTo(10.7469f, 15.0903f, 10.6748f, 14.9049f, 10.6748f, 14.6679f)
                    curveTo(10.6748f, 14.4618f, 10.7469f, 14.2763f, 10.8912f, 14.1321f)
                    curveTo(11.0457f, 13.9878f, 11.2209f, 13.9157f, 11.4373f, 13.9157f)
                    curveTo(11.6537f, 13.9157f, 11.8288f, 13.9878f, 11.9731f, 14.1321f)
                    curveTo(12.1174f, 14.2763f, 12.1895f, 14.4618f, 12.1895f, 14.6679f)
                    curveTo(12.1895f, 14.9049f, 12.1174f, 15.0903f, 11.9628f, 15.2243f)
                    curveTo(11.8082f, 15.3583f, 11.6331f, 15.4201f, 11.4373f, 15.4201f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.7f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(19.4062f, 16.5312f)
                    verticalLineTo(17.25f)
                    curveTo(19.4062f, 18.4399f, 18.4399f, 19.4062f, 17.25f, 19.4062f)
                    horizontalLineTo(5.75f)
                    curveTo(4.5601f, 19.4062f, 3.5938f, 18.4399f, 3.5938f, 17.25f)
                    verticalLineTo(5.75f)
                    curveTo(3.5938f, 4.5601f, 4.5601f, 3.5938f, 5.75f, 3.5938f)
                    horizontalLineTo(17.25f)
                    curveTo(18.4399f, 3.5938f, 19.4062f, 4.5601f, 19.4062f, 5.75f)
                    verticalLineTo(13.6562f)
                    curveTo(19.4062f, 14.053f, 19.7283f, 14.375f, 20.125f, 14.375f)
                    curveTo(20.5217f, 14.375f, 20.8438f, 14.053f, 20.8438f, 13.6562f)
                    verticalLineTo(5.75f)
                    curveTo(20.8438f, 3.7666f, 19.2334f, 2.1563f, 17.25f, 2.1563f)
                    horizontalLineTo(5.75f)
                    curveTo(3.7666f, 2.1563f, 2.1563f, 3.7666f, 2.1563f, 5.75f)
                    verticalLineTo(17.25f)
                    curveTo(2.1563f, 19.2334f, 3.7666f, 20.8438f, 5.75f, 20.8438f)
                    horizontalLineTo(17.25f)
                    curveTo(19.2334f, 20.8438f, 20.8438f, 19.2334f, 20.8438f, 17.25f)
                    verticalLineTo(16.5312f)
                    curveTo(20.8438f, 16.1345f, 20.5217f, 15.8125f, 20.125f, 15.8125f)
                    curveTo(19.7283f, 15.8125f, 19.4062f, 16.1345f, 19.4062f, 16.5312f)
                    close()
                }
            }
        }
        .build()
        return _help!!
    }

private var _help: ImageVector? = null
