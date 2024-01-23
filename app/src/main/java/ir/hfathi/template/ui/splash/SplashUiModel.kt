package ir.hfathi.template.ui.splash

import ir.hfathi.template.base.UiModel
import ir.hfathi.template.data.MessageEntity

data class SplashUiModel(
    var chatList: List<MessageEntity>,
    var page: Int = 0
) : UiModel
