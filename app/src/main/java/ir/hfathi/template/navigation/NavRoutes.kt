package ir.hfathi.template.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

private const val SPLASH_ROUTE = "splash"
sealed class NavRoutes(
    val route: String,
    val arguments: List<NamedNavArgument> = emptyList(),
    val deepLinks: List<NavDeepLink> = emptyList(),
) {
    object SplashNav : NavRoutes(SPLASH_ROUTE)

}