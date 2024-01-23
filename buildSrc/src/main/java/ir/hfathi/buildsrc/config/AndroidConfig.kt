package ir.hfathi.buildsrc.config

import ir.hfathi.buildsrc.config.AppVersion

object AndroidConfig {
    const val COMPILE_SDK = 33
    const val APPLICATION_ID = "ir.hfathi.template"
    const val MIN_SDK = 21
    const val TARGET_SDK = 33
    val VERSION_NAME = AppVersion.getVersionName()
    val VERSION_CODE = AppVersion.getVersionCode()
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    const val VECTOR_DRAWABLES_USE_SUPPORT_LIBRARY = true
    const val MULTI_DEX_ENABLED = true
}
