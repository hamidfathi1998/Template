import ir.hfathi.template.buildsrc.build_type.BuildType.BuildType.DEBUG
import ir.hfathi.template.buildsrc.build_type.BuildType.BuildType.RELEASE
import ir.hfathi.template.buildsrc.config.AndroidConfig.APPLICATION_ID
import ir.hfathi.template.buildsrc.config.AndroidConfig.COMPILE_SDK
import ir.hfathi.template.buildsrc.config.AndroidConfig.MIN_SDK
import ir.hfathi.template.buildsrc.config.AndroidConfig.MULTI_DEX_ENABLED
import ir.hfathi.template.buildsrc.config.AndroidConfig.TARGET_SDK
import ir.hfathi.template.buildsrc.config.AndroidConfig.TEST_INSTRUMENTATION_RUNNER
import ir.hfathi.template.buildsrc.config.AndroidConfig.VECTOR_DRAWABLES_USE_SUPPORT_LIBRARY
import ir.hfathi.template.buildsrc.config.AndroidConfig.VERSION_CODE
import ir.hfathi.template.buildsrc.config.AndroidConfig.VERSION_NAME
import ir.hfathi.template.buildsrc.config.SigningConfig
import ir.hfathi.template.buildsrc.config.SigningConfig.NAME
import org.jetbrains.kotlin.konan.properties.Properties
import ir.hfathi.template.buildsrc.build_type.BuildTypeDebug
import ir.hfathi.template.buildsrc.build_type.BuildTypeRelease
import ir.hfathi.template.buildsrc.dependency.CoreVersion.JAVA_VERSION
import ir.hfathi.template.buildsrc.dependency.LibraryDependency.ACTIVITY_COMPOSE
import ir.hfathi.template.buildsrc.dependency.LibraryVersion.COMPOSE_UI
import ir.hfathi.template.buildsrc.dependency.LibraryDependency.LIFECYCLE_RUNTIME_KTX
import ir.hfathi.template.buildsrc.dependency.LibraryDependency.ROOT_BEER
import ir.hfathi.template.buildsrc.dependency.LibraryDependency.MULTI_DEX
import ir.hfathi.template.buildsrc.dependency.addAndroidTestDependencies
import ir.hfathi.template.buildsrc.dependency.addPresentationModulesDependencies
import ir.hfathi.template.buildsrc.dependency.addTestDependencies

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ir.hfathi.template"
    compileSdk = COMPILE_SDK

    defaultConfig {
        applicationId = APPLICATION_ID
        minSdk = MIN_SDK
        targetSdk = TARGET_SDK
        versionCode = VERSION_CODE
        versionName = VERSION_NAME
        multiDexEnabled = MULTI_DEX_ENABLED
        testInstrumentationRunner = TEST_INSTRUMENTATION_RUNNER
        vectorDrawables.useSupportLibrary = VECTOR_DRAWABLES_USE_SUPPORT_LIBRARY
    }

//    var keyProperties = System.getenv(SigningConfig.ANDROID_KEY_PROPERTIES)
//    if (keyProperties.isNullOrBlank())
//        keyProperties = SigningConfig.KEY_PROPERTIES
//    signingConfigs {
//        create(NAME) {
//            val localPropertiesFile = rootDir.resolve(keyProperties)
//            if (localPropertiesFile.exists()) {
//                val localProperties = Properties()
//                localProperties.load(localPropertiesFile.inputStream())
//                storeFile =
//                    localProperties[SigningConfig.STORE_FILE]?.let { rootDir.resolve(it as String) }
//                storePassword = localProperties[SigningConfig.STORE_PASSWORD] as? String ?: String()
//                keyAlias = localProperties[SigningConfig.KEY_ALIAS] as? String ?: String()
//                keyPassword = localProperties[SigningConfig.KEY_PASSWORD] as? String ?: String()
//            }
//        }
//    }

    buildTypes {
        getByName(DEBUG) {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
            isShrinkResources = BuildTypeDebug.isShrinkResources
//            signingConfig = signingConfigs.getByName(NAME)
        }
        getByName(RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            isShrinkResources = BuildTypeRelease.isShrinkResources
            proguardFiles(*BuildTypeRelease.proguardFiles)
//            signingConfig = signingConfigs.getByName(NAME)
        }

    }

    compileOptions {
        sourceCompatibility = JAVA_VERSION
        targetCompatibility = JAVA_VERSION
    }

    kotlinOptions {
        jvmTarget = JAVA_VERSION.toString()
    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = COMPOSE_UI
    }

    lint {
        checkReleaseBuilds = false
        abortOnError = false
    }
}


dependencies {

    addPresentationModulesDependencies()
    implementation(LIFECYCLE_RUNTIME_KTX)
    implementation(ACTIVITY_COMPOSE)
    implementation(ROOT_BEER)
    implementation(MULTI_DEX)

    addTestDependencies()
    addAndroidTestDependencies()
//    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
//    implementation("androidx.compose.ui:ui-graphics")

//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
//    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
//    debugImplementation("androidx.compose.ui:ui-tooling")
//    debugImplementation("androidx.compose.ui:ui-test-manifest")
}