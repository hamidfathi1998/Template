package ir.hfathi.template.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import ir.hfathi.template.R

val fontFamily = FontFamily(
    Font(R.font.vazirmatn_black, FontWeight.Black),
    Font(R.font.vazirmatn_bold, FontWeight.Bold),
    Font(R.font.vazirmatn_extra_bold, FontWeight.ExtraBold),
    Font(R.font.vazirmatn_extra_light, FontWeight.ExtraLight),
    Font(R.font.vazirmatn_light, FontWeight.Light),
    Font(R.font.vazirmatn_medium, FontWeight.Medium),
    Font(R.font.vazirmatn_regular, FontWeight.Normal),
    Font(R.font.vazirmatn_semi_bold, FontWeight.SemiBold),
    Font(R.font.vazirmatn_thin, FontWeight.Thin),
)

val Typography = Typography(
    labelLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 16.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    labelMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    labelSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 20.sp,
        fontSize = 12.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 16.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    bodyMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    bodySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 18.sp,
        fontSize = 10.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    headlineLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 28.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    headlineMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 24.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    headlineSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 18.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    displayLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 64.sp,
        fontSize = 57.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    displayMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 52.sp,
        fontSize = 45.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    displaySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 44.sp,
        fontSize = 36.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    titleLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 16.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    titleMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
    titleSmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 12.sp,
        textDirection = TextDirection.ContentOrLtr,
    ),
)