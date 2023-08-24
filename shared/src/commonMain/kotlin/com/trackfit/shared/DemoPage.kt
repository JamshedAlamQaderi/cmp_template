package com.trackfit.shared

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trackfit.shared.icons.TrackFitIcons
import com.trackfit.shared.icons.trackfiticons.BodyParts
import com.trackfit.shared.icons.trackfiticons.Confirm
import com.trackfit.shared.icons.trackfiticons.Cross
import com.trackfit.shared.icons.trackfiticons.EatSign
import com.trackfit.shared.icons.trackfiticons.Help
import com.trackfit.shared.icons.trackfiticons.Okta
import com.trackfit.shared.icons.trackfiticons.Plus
import com.trackfit.shared.icons.trackfiticons.Weight
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.compose.fontFamilyResource
import dev.icerock.moko.resources.compose.painterResource

@Composable
fun DemoPage() {
    Scaffold(containerColor = Color.Black) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().wrapContentHeight()
                    .background(color = AppColors.JetBlack)
                    .padding(
                        start = 19.w,
                        top = 18.h,
                        end = 19.w,
                        bottom = 8.h
                    ),
            ) {
                Text(
                    "스포애니 신중동점 - 김민지",
                    style = TextStyle(
                        color = Color.White.copy(alpha = 0.45f),
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                        fontSize = 15.sp
                    )
                )
                Spacer(Modifier.height(9.h))
                // App title
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "PT 스케줄 (1월)",
                        style = TextStyle(
                            color = Color.White,
                            fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp
                        )
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            Icons.Default.ArrowBackIos,
                            contentDescription = "Weekly Calendar Go back",
                            tint = Color.White,
                        )
                        Spacer(Modifier.width(15.w))
                        Icon(
                            Icons.Default.ArrowForwardIos,
                            contentDescription = "Weekly Calendar Go forward",
                            tint = Color.White,
                        )
                    }
                }
                Spacer(Modifier.height(27.h))
                // Weekly Calendar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    WeeklyCalendarDay(
                        16,
                        "월",
                        WeeklyDayStatus.NOT_CONFIRMED,
                        Color.White
                    )
                    WeeklyCalendarDay(
                        17,
                        "화",
                        WeeklyDayStatus.EAT_CONFIRMED,
                    )
                    WeeklyCalendarDay(
                        18,
                        "수",
                        WeeklyDayStatus.CONFIRMED,
                        Color.White
                    )
                    WeeklyCalendarDay(
                        19,
                        "목",
                        WeeklyDayStatus.EAT_NOT_CONFIRMED,
                    )
                    WeeklyCalendarDay(
                        20,
                        "금",
                        WeeklyDayStatus.NONE,
                        AppColors.GoldenHoney
                    )
                    WeeklyCalendarDay(21, "토", WeeklyDayStatus.EAT)
                    WeeklyCalendarDay(22, "일", WeeklyDayStatus.DOT)
                }
                Row(
                    modifier = Modifier.fillMaxWidth().padding(top = 15.h),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        Modifier.width(31.w).height(3.h).background(
                            AppColors.SilverGray.copy(alpha = 0.6f),
                            RoundedCornerShape(30.dp)
                        )
                    )
                }
            }
            LazyColumn(
                Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 19.w
                    )
            ) {
                item {
                    Spacer(Modifier.height(22.h))
                }
                item {
                    Row(
                        Modifier.fillMaxWidth().wrapContentHeight(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "진행상황", style = TextStyle(
                                color = AppColors.SlateGray,
                                fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 18.sp
                            )
                        )
                        Row {
                            Icon(
                                TrackFitIcons.Help,
                                contentDescription = null,
                                tint = AppColors.SlateGray.copy(alpha = 0.7f),
                            )
                            Spacer(Modifier.width(6.w))
                            Text(
                                "가이드",
                                style = TextStyle(
                                    color = AppColors.SlateGray.copy(alpha = 0.7f),
                                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 18.sp
                                )
                            )
                        }
                    }
                }
                item {
                    Spacer(Modifier.height(22.h))
                }
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Question("오늘 운동 하셨나요?")
                        BodyPartsCounter()
                    }
                }
                item {
                    Spacer(Modifier.height(13.h))
                }
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TotalRunningTime()
                        ExercisedBodyParts()
                    }
                }
                item {

                    Spacer(Modifier.height(13.h))
                }
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Question("식단 조절 하셨나요?")
                        Weight()
                    }
                }
                item {
                    Spacer(Modifier.height(13.h))
                }
                item {
                    ExerciseProgress()
                }
                item {
                    Spacer(Modifier.height(37.h))
                }
                item {
                    Records()
                }
                item {
                    Spacer(Modifier.height(13.h))
                }
                item {
                    NoteBox()
                }

                item {
                    Spacer(Modifier.height(25.h))
                }
            }
        }
    }
}

@Composable
fun Records() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            "기록",
            style = TextStyle(
                color = AppColors.SlateGray,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.semiBold),
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            )
        )
        Spacer(Modifier.height(22.h))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            BodyPhoto()
            Column(
                modifier = Modifier.fillMaxHeight().height(346.h),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                FoodPhoto("Breakfast", MR.images.breakfast)
                FoodPhoto("Lunch", MR.images.lunch)
                FoodPhoto("Dinner", MR.images.dinner)
            }
        }
    }
}

@Composable
fun BodyPhoto() {
    Column(
        modifier = Modifier
            .width(187.w)
            .height(346.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(17.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            TrackFitIcons.Plus,
            contentDescription = null,
            tint = AppColors.LightSilver
        )
        Spacer(Modifier.height(17.h))
        Text(
            "신체 사진 업로드",
            style = TextStyle(
                color = AppColors.SlateGray,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp
            )
        )
    }
}

@Composable
fun FoodPhoto(event: String, image: ImageResource) {
    Box(
        Modifier.width(127.w).height(110.h),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            painterResource(image),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            Modifier
                .padding(bottom = 11.h, end = 11.w)
                .background(
                    Color.Black.copy(alpha = 0.55f),
                    RoundedCornerShape(10.dp)
                )
                .padding(vertical = 2.h, horizontal = 5.w)
        ) {
            Text(
                event,
                style = TextStyle(
                    color = Color.White,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp
                )
            )
        }
    }
}

@Composable
fun ExerciseProgress() {
    Column(
        modifier = Modifier.fillMaxWidth().height(85.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(17.dp))
            .padding(vertical = 12.h, horizontal = 21.w),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "총 30회",
                style = TextStyle(
                    color = AppColors.LavenderGray,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp
                )
            )
            Row {
                Text(
                    "10회",
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp
                    )
                )
                Spacer(Modifier.width(3.dp))
                Text(
                    "남음",
                    style = TextStyle(
                        color = AppColors.LavenderGray,
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp
                    )
                )
            }
        }

        LinearProgressIndicator(
            progress = 0.75f,
            modifier = Modifier
                .fillMaxWidth()
                .height(7.h),
            color = AppColors.GoldenHoney,
            trackColor = AppColors.SlateCharcoal,
            strokeCap = StrokeCap.Round,
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                "18회 운동ㅣ1회 빠짐ㅣ1회 미룸",
                style = TextStyle(
                    color = AppColors.LavenderGray,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp
                )
            )
        }
    }
}

@Composable
fun TotalRunningTime() {
    Box(
        Modifier
            .width(187.w)
            .height(40.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(5.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "유산소 40분",
            style = TextStyle(
                color = Color.White,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp
            )
        )
    }
}

@Composable
fun ExercisedBodyParts() {
    Row(
        modifier = Modifier.width(127.w).height(40.h),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BodyPart("하체", completed = true)
        BodyPart("등", completed = true)
        BodyPart("가슴")
    }
}

@Composable
fun BodyPart(name: String, completed: Boolean = false) {
    val bgColor = if (completed) Color.White else Color.Transparent
    val borderColor =
        if (completed) Color.Transparent else AppColors.DeepMidnightBlue
    val textColor = if (completed) Color.Black else AppColors.LavenderGray
    Box(
        Modifier
            .size(40.w)
            .background(bgColor, RoundedCornerShape(5.dp))
            .border(1.dp, borderColor, RoundedCornerShape(5.dp)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            name,
            style = TextStyle(
                color = textColor,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp
            )
        )
    }
}

@Composable
fun Weight() {
    Column(
        modifier = Modifier.width(127.w).height(99.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(17.dp))
            .padding(13.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                TrackFitIcons.Weight,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(15.dp)
            )
            Spacer(Modifier.width(6.w))
            Text(
                "몸무게 추이",
                style = TextStyle(
                    color = AppColors.LavenderGray,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp
                )
            )
        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    "65",
                    style = TextStyle(
                        color = Color.White,
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                        fontWeight = FontWeight.Medium,
                        fontSize = 18.sp
                    )
                )
                Spacer(Modifier.width(2.w))
                Text(
                    "Kg",
                    style = TextStyle(
                        color = AppColors.LavenderGray,
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                        fontWeight = FontWeight.Medium,
                        fontSize = 13.sp
                    )
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = AppColors.CrimsonEmber
                )
                Text(
                    "1 Kg",
                    style = TextStyle(
                        color = AppColors.CrimsonEmber,
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                        fontWeight = FontWeight.Medium,
                        fontSize = 11.sp
                    )
                )
            }
        }
        Text(
            "2023.01.31",
            style = TextStyle(
                color = AppColors.LavenderGray,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            )
        )
    }
}

@Composable
fun BodyPartsCounter() {
    Column(
        modifier = Modifier.width(127.w).height(99.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(17.dp))
            .padding(13.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                TrackFitIcons.BodyParts,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(15.dp)
            )
            Spacer(Modifier.width(6.w))
            Text(
                "운동 부위",
                style = TextStyle(
                    color = AppColors.LavenderGray,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp
                )
            )
        }
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(
                "4 부위",
                style = TextStyle(
                    color = Color.White,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            )
        }
    }
}

@Composable
fun Question(text: String) {
    Column(
        modifier = Modifier
            .width(187.w)
            .height(99.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(17.dp))
            .padding(13.w)
    ) {
        Text(
            text,
            style = TextStyle(
                color = AppColors.LavenderGray,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                fontWeight = FontWeight.Medium,
                fontSize = 13.sp
            )
        )
        Spacer(Modifier.height(12.h))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                Modifier.width(76.w).height(46.h)
                    .background(Color.Transparent, RoundedCornerShape(8.dp))
                    .border(1.dp, AppColors.DeepRuby, RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    TrackFitIcons.Cross,
                    contentDescription = null,
                    tint = AppColors.DeepRuby,
                    modifier = Modifier.size(30.dp)
                )
            }

            Box(
                Modifier.width(76.w).height(46.h)
                    .background(Color.Transparent, RoundedCornerShape(8.dp))
                    .border(
                        1.dp,
                        AppColors.ForestTeal,
                        RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    TrackFitIcons.Okta,
                    contentDescription = null,
                    tint = AppColors.ForestTeal,
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}

@Composable
fun WeeklyCalendarDay(
    dayOfMonth: Int,
    dayName: String,
    status: WeeklyDayStatus,
    color: Color = AppColors.BlackGray,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Column(
            Modifier.width(40.w).height(63.h)
                .border(1.dp, color, RoundedCornerShape(5.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                dayName,
                style = TextStyle(
                    color = color,
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
            )
            WeeklyFitStatusIcon(status)
        }
        Spacer(Modifier.height(7.h))
        Text(
            dayOfMonth.toString(), style = TextStyle(
                color = color,
                fontFamily = fontFamilyResource(MR.fonts.Pretendard.light),
                fontWeight = FontWeight.Light,
                fontSize = 13.sp
            )
        )
    }
}

@Composable
fun WeeklyFitStatusIcon(status: WeeklyDayStatus) {
    Box(Modifier.size(20.dp), contentAlignment = Alignment.Center) {
        when (status) {
            WeeklyDayStatus.NONE -> Box(Modifier)
            WeeklyDayStatus.DOT -> Box(
                Modifier
                    .size(6.dp)
                    .background(Color.Gray, shape = CircleShape)
            )

            WeeklyDayStatus.NOT_CONFIRMED -> Icon(
                TrackFitIcons.Cross,
                contentDescription = null,
                tint = AppColors.DarkRed
            )

            WeeklyDayStatus.CONFIRMED -> Icon(
                TrackFitIcons.Confirm,
                contentDescription = null,
                tint = AppColors.GoldenHoney
            )

            WeeklyDayStatus.EAT_CONFIRMED -> Box(
                Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomEnd
            ) {
                Icon(
                    TrackFitIcons.EatSign,
                    contentDescription = null,
                    tint = AppColors.DarkRed,
                    modifier = Modifier.fillMaxSize()
                )
                Icon(
                    TrackFitIcons.Confirm,
                    contentDescription = null,
                    tint = AppColors.GoldenHoney,
                    modifier = Modifier.size(12.dp)
                )
            }

            WeeklyDayStatus.EAT_NOT_CONFIRMED -> Box(
                Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomEnd
            ) {
                Icon(
                    TrackFitIcons.EatSign,
                    contentDescription = null,
                    tint = AppColors.DarkRed,
                    modifier = Modifier.fillMaxSize()
                )
                Icon(
                    TrackFitIcons.Cross,
                    contentDescription = null,
                    tint = Color.Red,
                    modifier = Modifier.size(12.dp)
                )
            }

            WeeklyDayStatus.EAT -> Icon(
                TrackFitIcons.EatSign,
                contentDescription = null,
                tint = AppColors.DarkRed
            )
        }
    }
}

@Composable
fun NoteBox() {
    Column(
        modifier = Modifier.fillMaxWidth().height(155.h)
            .background(AppColors.MidnightSlate, RoundedCornerShape(17.dp))
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.End
    ) {
        OutlinedTextField("",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth().height(97.h),
            shape = RoundedCornerShape(5.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = AppColors.DeepMidnightBlue,
                focusedContainerColor = AppColors.DeepMidnightBlue,
                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,
            ),
            placeholder = {
                Text(
                    "메모할 내용을 입력하세요.",
                    style = TextStyle(
                        color = Color.White.copy(0.4f),
                        fontFamily = fontFamilyResource(MR.fonts.Pretendard.regular),
                        fontWeight = FontWeight.Normal,
                        fontSize = 15.sp
                    )
                )
            }
        )
        TextButton(
            onClick = {},
            modifier = Modifier.width(82.w).height(30.h),
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AppColors.DarkCharcoal
            ),
        ) {
            Text(
                "저장",
                style = TextStyle(
                    color = Color.White.copy(0.4f),
                    fontFamily = fontFamilyResource(MR.fonts.Pretendard.medium),
                    fontWeight = FontWeight.Medium,
                    fontSize = 13.sp
                )
            )
        }
    }
}

enum class WeeklyDayStatus {
    NONE,
    DOT,
    NOT_CONFIRMED,
    CONFIRMED,
    EAT_CONFIRMED,
    EAT_NOT_CONFIRMED,
    EAT,
}
