package ir.hfathi.template.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import eu.wewox.modalsheet.ExperimentalSheetApi
import eu.wewox.modalsheet.ModalSheet
import ir.hfathi.template.ui.theme.Typography

@OptIn(ExperimentalSheetApi::class, ExperimentalLayoutApi::class)
@Composable
fun CommonModalBottomSheet(
    cancellable: Boolean = true,
    visibility: MutableState<Boolean>,
    onVisibleChange: (visibility: Boolean) -> Unit,
    content: @Composable () -> Unit
) {
    val navigationPadding = WindowInsets.Companion.navigationBars.asPaddingValues()
    ModalSheet(
        cancelable = cancellable,
        visible = visibility.value,
        onVisibleChange = onVisibleChange
    ) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {
                content()
            }
        }
        if (WindowInsets.areNavigationBarsVisible) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(navigationPadding.calculateBottomPadding())
                    .background(color = MaterialTheme.colorScheme.primary)
            )
        }
    }
}

@OptIn(ExperimentalSheetApi::class, ExperimentalLayoutApi::class)
@Composable
fun RoundedModalSheet(
    cancellable: Boolean = true,
    showModalSheet: Boolean,
    headerName: String? = null,
    topDividerEnable: Boolean = true,
    onDisMiss: () -> Unit,
    content: @Composable () -> Unit
) {
    val navigationPadding = WindowInsets.Companion.navigationBars.asPaddingValues()
    ModalSheet(
        cancelable = cancellable,
        visible = showModalSheet,
        onVisibleChange = { isVisible ->
            if (isVisible.not()) onDisMiss.invoke()
        },
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
    ) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (topDividerEnable) {
                        Divider(
                            modifier = Modifier
                                .size(width = 32.dp, height = 4.dp)
                                .clip(shape = RoundedCornerShape(8.dp)),
                            color = MaterialTheme.colorScheme.outlineVariant,
                        )

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(36.dp)
                        )
                    }

                    if (headerName.isNullOrEmpty().not()) {

                        Text(
                            text = headerName!!,
                            style = Typography.titleLarge,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(22.dp)
                        )

                    }
                }
                content()
            }
        }
        if (WindowInsets.areNavigationBarsVisible) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(navigationPadding.calculateBottomPadding())
                    .background(color = MaterialTheme.colorScheme.primary)
            )
        }
    }
}

@OptIn(ExperimentalSheetApi::class, ExperimentalLayoutApi::class)
@Composable
fun RoundedModalSheet2(
    cancellable: Boolean = true,
    showModalSheet: Boolean,
    headerName: String?,
    onDisMiss: (isVisible: Boolean) -> Unit,
    content: @Composable () -> Unit
) {
    val navigationPadding = WindowInsets.Companion.navigationBars.asPaddingValues()
    ModalSheet(
        cancelable = cancellable,
        visible = showModalSheet,
        onVisibleChange = { isVisible ->
            onDisMiss.invoke(isVisible)
        },
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp)
    ) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Divider(
                        modifier = Modifier
                            .size(width = 32.dp, height = 4.dp)
                            .clip(shape = RoundedCornerShape(8.dp)),
                        color = MaterialTheme.colorScheme.outlineVariant,
                    )

                    val isHeaderNameValueExist = headerName.isNullOrEmpty().not()
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(if (isHeaderNameValueExist) 36.dp else 24.dp)
                    )

                    if (isHeaderNameValueExist) {
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(36.dp)
                        )

                        Text(
                            text = headerName!!,
                            style = Typography.titleLarge,
                            color = MaterialTheme.colorScheme.onBackground
                        )

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(22.dp)
                        )

                    }
                }
                content()
            }
        }
        if (WindowInsets.areNavigationBarsVisible) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(navigationPadding.calculateBottomPadding())
                    .background(color = MaterialTheme.colorScheme.primary)
            )
        }
    }
}

@OptIn(ExperimentalSheetApi::class, ExperimentalLayoutApi::class, ExperimentalMaterialApi::class)
@Composable
fun RoundedStatefulModalSheet(
    sheetState: ModalBottomSheetState,
    headerName: String? = null,
    topDividerEnable: Boolean = true,
    onBackPressed: (() -> Unit)?,
    content: (@Composable () -> Unit)?
) {
    val navigationPadding = WindowInsets.Companion.navigationBars.asPaddingValues()
    ModalSheet(
        sheetState = sheetState,
        shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
        onSystemBack = onBackPressed
    ) {
        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (topDividerEnable) {
                        Divider(
                            modifier = Modifier
                                .size(width = 32.dp, height = 4.dp)
                                .clip(shape = RoundedCornerShape(8.dp)),
                            color = MaterialTheme.colorScheme.outlineVariant,
                        )

                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(36.dp)
                        )
                    }

                    if (headerName.isNullOrEmpty().not()) {

                        Text(
                            text = headerName!!,
                            style = Typography.titleLarge,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Spacer(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(22.dp)
                        )

                    }
                }
                content?.invoke()
            }
        }
        if (WindowInsets.areNavigationBarsVisible) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(navigationPadding.calculateBottomPadding())
                    .background(color = MaterialTheme.colorScheme.primary)
            )
        }
    }
}