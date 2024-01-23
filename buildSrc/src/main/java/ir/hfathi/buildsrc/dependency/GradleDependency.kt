package ir.hfathi.buildsrc.dependency

import ir.hfathi.buildsrc.dependency.CoreVersion

object GradlePluginVersion {
    const val ANDROID_GRADLE_PLUGIN = "7.3.1"
    const val KOTLIN = CoreVersion.KOTLIN
    const val HILT = "2.44"
    const val DETEKT = "1.19.0"
    const val KTLINT = "10.2.0"
    const val SENTRY_PLUGIN = "3.4.0"
}

object GradlePluginId {
    const val ANDROID_APPLICATION = "com.android.application"
    const val ANDROID_LIBRARY = "com.android.library"
    const val KOTLIN_ANDROID = "org.jetbrains.kotlin.android"
    const val KOTLIN_PARCELIZE = "org.jetbrains.kotlin.plugin.parcelize"
    const val KOTLIN_KAPT = "org.jetbrains.kotlin.kapt"
    const val SONAR_QUBE = "org.sonarqube"
    const val HILT_ANDROID = "com.google.dagger.hilt.android"
    const val DETEKT = "io.gitlab.arturbosch.detekt"
    const val KTLINT = "org.jlleitschuh.gradle.ktlint"
    const val SONAR_QUBE_GRADLE =
        "org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:3.4.0.2513"
    const val SENTRY = "io.sentry.android.gradle"
    const val GOOGLE_SERVICES = "com.google.gms.google-services"
    const val PERFORMANCE_MONITORING = "com.google.firebase.firebase-perf"
    const val CRASHLYTICS = "com.google.firebase.crashlytics"
}

object GradleOldWayPlugins {
    const val ANDROID_GRADLE_BUILD_TOOLS =
        "com.android.tools.build:gradle:${GradlePluginVersion.ANDROID_GRADLE_PLUGIN}"
    const val KOTLIN_GRADLE =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${GradlePluginVersion.KOTLIN}"
    const val GOOGLE_SERVICES = "com.google.gms:google-services:4.3.14"
    const val CRASHLYTICS_GRADLE = "com.google.firebase:firebase-crashlytics-gradle:2.6.1"
    const val SONAR_QUBE_GRADLE =
        "org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:3.4.0.2513"
    const val HILT = "com.google.dagger:hilt-android-gradle-plugin:${LibraryVersion.HILT}"
    const val PERFORMANCE_MONITORING =
        "com.google.firebase:perf-plugin:${LibraryVersion.PERFORMANCE_MONITORING}"
    const val ANDROID_JUNIT_5 =
        "de.mannodermaus.gradle.plugins:android-junit5:${LibraryVersion.ANDROID_JUNIT_5}"
}
