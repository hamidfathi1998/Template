buildscript {
    repositories {
        mavenCentral()
        maven(url = "https://jitpack.io")
        google()
        jcenter()
    }
    dependencies {
        classpath(ir.hfathi.template.buildsrc.dependency.GradleOldWayPlugins.ANDROID_GRADLE_BUILD_TOOLS)
        classpath(ir.hfathi.template.buildsrc.dependency.GradleOldWayPlugins.KOTLIN_GRADLE)
        classpath(ir.hfathi.template.buildsrc.dependency.GradleOldWayPlugins.ANDROID_JUNIT_5)
    }
}

plugins {
    id(ir.hfathi.template.buildsrc.dependency.GradlePluginId.ANDROID_APPLICATION) version ir.hfathi.template.buildsrc.dependency.GradlePluginVersion.ANDROID_GRADLE_PLUGIN apply false
    id(ir.hfathi.template.buildsrc.dependency.GradlePluginId.ANDROID_LIBRARY) version ir.hfathi.template.buildsrc.dependency.GradlePluginVersion.ANDROID_GRADLE_PLUGIN apply false
    id(ir.hfathi.template.buildsrc.dependency.GradlePluginId.KOTLIN_ANDROID) version ir.hfathi.template.buildsrc.dependency.GradlePluginVersion.KOTLIN apply false
}


tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
}