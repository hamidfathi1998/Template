package ir.hfathi.template.buildsrc.dependency

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addPresentationModulesDependencies() {
    implementation(LibraryDependency.CORE_KTX)
    implementation(LibraryDependency.COIL_COMPOSE)
    implementation(LibraryDependency.NAVIGATION_COMPOSE)
    implementation(LibraryDependency.COMPOSE_MATERIAL_3)
    implementation(LibraryDependency.COMPOSE_MATERIAL)
    implementation(LibraryDependency.CONSTRAINT_LAYOUT_COMPOSE)
    debugImplementation(LibraryDependency.COMPOSE_UI_TOOLING)
    implementation(LibraryDependency.COMPOSE_UI_TOOLING_PREVIEW)
    implementation(LibraryDependency.COMPOSE_UI)
    implementation(LibraryDependency.SHIMMER)
}

fun DependencyHandler.addTestDependencies() {
    testImplementation(LibraryDependency.JUNIT)
    testImplementation(LibraryDependency.KOTLINX_COROUTINES_TEST)
    testImplementation(LibraryDependency.MOCKK)
}

fun DependencyHandler.addAndroidTestDependencies() {
    androidTestImplementation(LibraryDependency.ANDROID_TEST_EXT_JUNIT)
    androidTestImplementation(LibraryDependency.COMPOSE_UI_TEST)
    debugImplementation(LibraryDependency.COMPOSE_UI_TEST_MANIFEST)
    androidTestImplementation(LibraryDependency.NAVIGATION_TEST)
    androidTestImplementation(LibraryDependency.MOCKK_ANDROID_UI)
    debugImplementation(LibraryDependency.TEST_MONITOR)
}

private fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)

private fun DependencyHandler.kapt(dependencyNotation: Any): Dependency? =
    add("kapt", dependencyNotation)

private fun DependencyHandler.testImplementation(dependencyNotation: Any): Dependency? =
    add("testImplementation", dependencyNotation)

fun DependencyHandler.`kaptTest`(dependencyNotation: Any): Dependency? =
    add("kaptTest", dependencyNotation)

fun DependencyHandler.`kaptAndroidTest`(dependencyNotation: Any): Dependency? =
    add("kaptAndroidTest", dependencyNotation)

private fun DependencyHandler.androidTestImplementation(dependencyNotation: Any): Dependency? =
    add("androidTestImplementation", dependencyNotation)

private fun DependencyHandler.debugImplementation(dependencyNotation: Any): Dependency? =
    add("debugImplementation", dependencyNotation)

private fun DependencyHandler.releaseImplementation(dependencyNotation: Any): Dependency? =
    add("releaseImplementation", dependencyNotation)

fun DependencyHandler.coreLibraryDesugaring(dependencyNotation: Any): Dependency? =
    add("coreLibraryDesugaring", dependencyNotation)
