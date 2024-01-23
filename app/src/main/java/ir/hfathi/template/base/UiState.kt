package ir.hfathi.template.base

import androidx.annotation.StringRes
import java.util.*

sealed class UiState<out UiModel : Any>(open val uiModel: UiModel?) {

    data class Loading<out UiModel : Any>(
        override val uiModel: UiModel? = null,
        val isCommon: Boolean = true,
        val isButtonLoading: Boolean = false
    ) : UiState<UiModel>(uiModel = uiModel)

    data class Success<out UiModel : Any>(override val uiModel: UiModel?) :
        UiState<UiModel>(uiModel = uiModel)

    data class ErrorMessage<out UiModel : Any, A : UiAction>(
        override val uiModel: UiModel?,
        val message: String,
        val retriable: Boolean = false,
        val retryAction: A? = null,
        val messageId: String = UUID.randomUUID().toString()
    ) : UiState<UiModel>(uiModel = uiModel)

    data class Navigation(
        val route: String,
        val popUpTo: String? = null,
        val inclusive: Boolean = false,
        val singleTop: Boolean = false
    ) : UiState<Nothing>(uiModel = null)

    data class ResetState<out UiModel : Any>(override val uiModel: UiModel) :
        UiState<UiModel>(uiModel = uiModel)

    data class OpenUrl(val url: String) : UiState<Nothing>(uiModel = null)

    object PopUp : UiState<Nothing>(uiModel = null)

    object Ignore : UiState<Nothing>(uiModel = null)

    data class ShowMessage<out UiModel : Any, A : UiAction>(
        override val uiModel: UiModel? = null,
        @StringRes val message: Int,
        val action: A? = null,
        val actionLabel: String? = null,
    ) : UiState<UiModel>(uiModel = uiModel)

}