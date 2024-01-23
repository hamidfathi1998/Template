package ir.hfathi.template.ui.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import ir.hfathi.template.base.CommonScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SplashScreen(
    navHostController: NavHostController,
    viewModel: SplashViewModel
) {

    CommonScreen(
        uiStateState = viewModel.uiStateFlow.collectAsState(),
        sendAction = viewModel::sendAction
    ) { data, _ ->
        Scaffold { padding ->
            data?.let { splashUiModel ->
                SplashContent(modifier = Modifier.padding(padding))
            }
        }
        viewModel.sendAction(
            action = SplashAction.LoadMySplash(
                page = data?.page?.plus(2) ?: 0
            )
        )
    }

    LaunchedEffect(key1 = Unit) {
        viewModel.sendAction(
            action = SplashAction.LoadMySplash(
                page = 0
            )
        )
    }
}

@Composable
fun SplashContent(modifier: Modifier) {
    Box(modifier = modifier.background(color = Color.Red)) {}
}
