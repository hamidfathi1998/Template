package ir.hfathi.template.base

import kotlinx.coroutines.flow.Flow

interface UiAction {

    data class ShowRetry<out Action : UiAction>(
        val message: String,
        val retry: Flow<Action>
    ) : UiAction

    data class ShowMessage(
        val message: String
    ) : UiAction

    object ResetToUiState : UiAction
}