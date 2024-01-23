package ir.hfathi.template.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ir.hfathi.template.ui.splash.SplashScreen
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    forceExit: () -> Unit,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavRoutes.SplashNav.route,
    ) {
        composable(
            route = NavRoutes.SplashNav.route,
            arguments = NavRoutes.SplashNav.arguments
        ) {
            SplashScreen(
                navHostController = navController,
                viewModel = hiltViewModel(),
            )
        }
    }
}