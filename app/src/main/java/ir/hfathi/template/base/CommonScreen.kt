package ir.hfathi.template.base

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstrainedLayoutReference
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintLayoutScope


@Composable
fun <T : Any, A : UiAction> CommonScreen(
    uiStateState: State<UiState<T>>,
    sendAction: ((retryAction: A) -> Unit)? = null,
    loadingViewContent: (@Composable () -> Unit)? = null,
    content: @Composable (data: T?, snackBarHostState: SnackbarHostState) -> Unit,
) {
    CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
        val hostState = remember { SnackbarHostState() }

        ConstraintLayout {
            val (contentId, loadingId) = createRefs()
            Box(
                modifier = Modifier.Companion
                    .constrainAs(contentId) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    }
            ) {
                content(
                    data = uiStateState.value.uiModel,
                    snackBarHostState = hostState,
                )
            }
            val value = uiStateState.value
            if (value is UiState.Loading) {
                if (value.isButtonLoading.not()) {
                    if (value.isCommon) {
                        loadingViewContent?.let { customLoadingViewContent ->
                            CustomLoadingBox(loadingId = loadingId) {
                                customLoadingViewContent()
                            }
                        } ?: LoadingBox(loadingId = loadingId)
                    }
                }
            }
        }
    }
}


@Composable
private fun ConstraintLayoutScope.LoadingBox(
    loadingId: ConstrainedLayoutReference,
) {
    Box(
        Modifier
            .constrainAs(loadingId) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
            .fillMaxWidth()
            .fillMaxHeight()
            .background(MaterialTheme.colorScheme.background.copy(alpha = 0.6f))
            .clickable(enabled = false) {},
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator()
    }
}

@Composable
private fun ConstraintLayoutScope.CustomLoadingBox(
    loadingId: ConstrainedLayoutReference,
    loadingView: @Composable () -> Unit,
) {
    Box(
        Modifier
            .constrainAs(loadingId) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Gray)
            .clickable(enabled = false) {}
            .padding(top = 70.dp),
        contentAlignment = Alignment.Center,
    ) {
        loadingView()
    }
}
