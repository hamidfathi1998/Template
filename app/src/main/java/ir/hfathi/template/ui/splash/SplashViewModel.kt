package ir.hfathi.template.ui.splash

import dagger.hilt.android.lifecycle.HiltViewModel
import ir.hfathi.template.base.BaseViewModel
import ir.hfathi.template.base.UiState
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() :
    BaseViewModel<SplashUiModel, UiState<SplashUiModel>, SplashAction>(
        UiState.Loading()
    ) {
    override fun reduceState(action: SplashAction) {
        when (action) {
            is SplashAction.LoadMySplash -> {}
        }
    }

}