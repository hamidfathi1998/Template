package ir.hfathi.template.ui.splash

import ir.hfathi.template.base.UiAction

sealed class SplashAction : UiAction {
    data class LoadMySplash(val page: Int = 0) : SplashAction()
}