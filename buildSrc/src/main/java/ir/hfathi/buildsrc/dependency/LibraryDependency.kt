package ir.hfathi.buildsrc.dependency

object LibraryVersion {
    const val ACCOMPONIST_PAGER = "0.27.0"
    const val ACCOMPONIST_PAGER_INDICATORS = "0.23.1"
    const val ACCOMPONIST_SYSTEM_UI_CONTROLLER = "0.27.1"
    const val ACCOMPONIST_PERMISSION = "0.31.1-alpha"
    const val KOIN_VERSION = "3.5.3"
    const val COMPOSE_MATERIAL_3 = "1.0.1"
    const val COMPOSE_MATERIAL = "1.3.1"
    const val COMPOSE_UI = "1.3.2"
    const val NAVIGATION_TEST = "2.5.3"
    const val ACTIVITY_COMPOSE = "1.6.1"
    const val LIFECYCLE_RUNTIME_KTX = "2.5.1"
    const val HILT_NAVIGATION_COMPOSE = "1.0.0"
    const val NAVIGATION_COMPOSE = "2.5.3"
    const val CORE_KTS = "1.9.0"
    const val APP_COMPAT = "1.5.1"
    const val CONSTRAINT_LAYOUT_COMPOSE = "1.0.1"
    const val ANDROID_TEST_EXT_JUNIT = "1.1.4"
    const val ESPRESSO_CORE = "3.5.0"
    const val MATERIAL = "1.7.0"
    const val LIFECYCLE = "2.5.1"
    const val RETROFIT = "2.9.0"
    const val LOGGING_INTERCEPTOR = "4.9.0"
    const val ROOM = "2.4.3"
    const val SQL_CIPHER = "4.4.2"
    const val SQLITE_KTX = "2.2.0"
    const val JUNIT = "4.13.2"
    const val TEST_MONITOR = "1.6.0"
    const val MOCKITO = "5.3.1"
    const val MOCKK = "1.13.5"
    const val MOCKK_ANDROID_UI = "1.12.0"
    const val HILT_ANDROID_TESTING = "2.44"
    const val HILT_ANDROID_COMPILER = "2.44"
    const val KOTLINX_COROUTINES_TEST = "1.6.4"
    const val CHUCKER = "3.5.2"
    const val JALALI_DATE = "0.5.1"
    const val JALALI_CALENDAR = "1.3.3"
    const val PRETTY_TIME = "4.0.4.Final"
    const val TIMBER = "4.7.1"
    const val HILT = "2.44"
    const val HILT_ANDROIDX_LIFECYCLE = "1.0.0-alpha03"
    const val HILT_NAVIGATION = "1.0.0"
    const val COIL = "2.2.2"
    const val GSON = "2.10"
    const val ANDROID_JUNIT_5 = "1.8.2.0"
    const val PERFORMANCE_MONITORING = "1.4.1"
    const val SENTRY = "5.5.0"
    const val FIREBASE_BOM = "31.1.1"
    const val DATA_STORE_PREFERENCES = "1.0.0"
    const val MULTI_DEX = "2.0.1"
    const val ROOT_BEER = "0.1.0"
    const val PLAY_SERVICES_AUTH_API_PHONE = "18.0.1"
    const val PLAY_SERVICES_AUTH = "20.4.0"
    const val BIOMETRIC = "1.2.0-alpha05"
    const val LIB_PHONE_NUMBER = "8.13.5"
    const val MODAL_BOTTOM_SHEET = "0.5.0"
    const val METRIX = "1.5.1"
    const val SOCKET_IO = "2.1.0"
    const val TEST_RUNNER = "1.4.0"
    const val SHIMMER = "1.0.5"
    const val HEAP = "0.3.0"
}

object LibraryDependency {
    const val CORE_KTX = "androidx.core:core-ktx:${LibraryVersion.CORE_KTS}"
    const val APP_COMPAT = "androidx.appcompat:appcompat:${LibraryVersion.APP_COMPAT}"
    const val TEST_RUNNER = "androidx.test:runner:${LibraryVersion.TEST_RUNNER}"
    const val CONSTRAINT_LAYOUT_COMPOSE =
        "androidx.constraintlayout:constraintlayout-compose:${LibraryVersion.CONSTRAINT_LAYOUT_COMPOSE}"
    const val JUNIT = "junit:junit:${LibraryVersion.JUNIT}"
    const val TEST_MONITOR = "androidx.test:monitor:${LibraryVersion.TEST_MONITOR}"
    const val MOCKITO = "org.mockito:mockito-core:${LibraryVersion.MOCKITO}"
    const val MOCKK = "io.mockk:mockk:${LibraryVersion.MOCKK}"
    const val MOCKK_ANDROID_UI = "io.mockk:mockk-android:${LibraryVersion.MOCKK_ANDROID_UI}"
    const val KOTLINX_COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${LibraryVersion.KOTLINX_COROUTINES_TEST}"

    const val ACCOMPONIST_PAGER =
        "com.google.accompanist:accompanist-pager:${LibraryVersion.ACCOMPONIST_PAGER}"
    const val ACCOMPONIST_PAGER_INDICATORS =
        "com.google.accompanist:accompanist-pager-indicators:${LibraryVersion.ACCOMPONIST_PAGER_INDICATORS}"
    const val ACCOMPONIST_SYSTEM_UI_CONTROLLER =
        "com.google.accompanist:accompanist-systemuicontroller:${LibraryVersion.ACCOMPONIST_SYSTEM_UI_CONTROLLER}"
    const val ACCOMPONIST_PERMISSION =
        "com.google.accompanist:accompanist-permissions:${LibraryVersion.ACCOMPONIST_PERMISSION}"
    const val ANDROID_TEST_EXT_JUNIT =
        "androidx.test.ext:junit:${LibraryVersion.ANDROID_TEST_EXT_JUNIT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${LibraryVersion.ESPRESSO_CORE}"
    const val COMPOSE_UI_TEST = "androidx.compose.ui:ui-test-junit4:${LibraryVersion.COMPOSE_UI}"
    const val COMPOSE_UI_TEST_MANIFEST = "androidx.compose.ui:ui-test-manifest:${LibraryVersion.COMPOSE_UI}"
    const val NAVIGATION_TEST = "androidx.navigation:navigation-testing:${LibraryVersion.NAVIGATION_TEST}"

    const val MATERIAL = "com.google.android.material:material:${LibraryVersion.MATERIAL}"
    const val VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.LIFECYCLE}"
    const val VIEW_MODEL_COMPOSE =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${LibraryVersion.LIFECYCLE}"
    const val LIFECYCLE_COMMON =
        "androidx.lifecycle:lifecycle-common-java8:${LibraryVersion.LIFECYCLE}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${LibraryVersion.RETROFIT}"
    const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${LibraryVersion.RETROFIT}"
    const val LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${LibraryVersion.LOGGING_INTERCEPTOR}"
    const val ROOM_RUN_TIME = "androidx.room:room-runtime:${LibraryVersion.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${LibraryVersion.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${LibraryVersion.ROOM}"
    const val SQL_CIPHER = "net.zetetic:android-database-sqlcipher:${LibraryVersion.SQL_CIPHER}"
    const val SQLITE_KTX = "androidx.sqlite:sqlite-ktx:${LibraryVersion.SQLITE_KTX}"
    const val GSON = "com.google.code.gson:gson:${LibraryVersion.GSON}"
    const val CHUCKER = "com.github.chuckerteam.chucker:library:${LibraryVersion.CHUCKER}"
    const val CHUCKER_NO_OP =
        "com.github.chuckerteam.chucker:library-no-op:${LibraryVersion.CHUCKER}"
    const val JALALI_DATE = "org.bardframework:jalali-date:${LibraryVersion.JALALI_DATE}"
    const val JALALI_CALENDAR = "ir.huri:JalaliCalendar:${LibraryVersion.JALALI_CALENDAR}"
    const val PRETTY_TIME = "org.ocpsoft.prettytime:prettytime:${LibraryVersion.PRETTY_TIME}"
    const val TIMBER = "com.jakewharton.timber:timber:${LibraryVersion.TIMBER}"
    const val HILT = "com.google.dagger:hilt-android:${LibraryVersion.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${LibraryVersion.HILT}"
    const val HILT_NAVIGATION =
        "androidx.hilt:hilt-navigation-fragment:${LibraryVersion.HILT_NAVIGATION}"
    const val COIL_COMPOSE =
        "io.coil-kt:coil-compose:${LibraryVersion.COIL}"
    const val NAVIGATION_COMPOSE =
        "androidx.navigation:navigation-compose:${LibraryVersion.NAVIGATION_COMPOSE}"
    const val HILT_NAVIGATION_COMPOSE =
        "androidx.hilt:hilt-navigation-compose:${LibraryVersion.HILT_NAVIGATION_COMPOSE}"
    const val LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${LibraryVersion.LIFECYCLE_RUNTIME_KTX}"
    const val ACTIVITY_COMPOSE =
        "androidx.activity:activity-compose:${LibraryVersion.ACTIVITY_COMPOSE}"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${LibraryVersion.COMPOSE_UI}"
    const val COMPOSE_UI_TOOLING_PREVIEW =
        "androidx.compose.ui:ui-tooling-preview:${LibraryVersion.COMPOSE_UI}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${LibraryVersion.COMPOSE_UI}"
    const val COMPOSE_MATERIAL_3 =
        "androidx.compose.material3:material3:${LibraryVersion.COMPOSE_MATERIAL_3}"
    const val COMPOSE_MATERIAL =
        "androidx.compose.material:material:${LibraryVersion.COMPOSE_MATERIAL}"
    const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:1.3.1"
    const val VIEW_MODEL_SAVED_STATE =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${LibraryVersion.LIFECYCLE}"
    const val SENTRY_BOM = "io.sentry:sentry-bom:${LibraryVersion.SENTRY}"
    const val SENTRY = "io.sentry:sentry-android"
    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${LibraryVersion.FIREBASE_BOM}"
    const val PERFORMANCE_MONITORING_KTX = "com.google.firebase:firebase-perf-ktx"
    const val CRASHLYTICS_KTX = "com.google.firebase:firebase-crashlytics-ktx"
    const val ANALYTICS_KTX = "com.google.firebase:firebase-analytics-ktx"
    const val FIREBASE_MESSAGING = "com.google.firebase:firebase-messaging-ktx"
    const val DATA_STORE_PREFERENCES =
        "androidx.datastore:datastore-preferences:${LibraryVersion.DATA_STORE_PREFERENCES}"
    const val MULTI_DEX = "androidx.multidex:multidex:${LibraryVersion.MULTI_DEX}"
    const val ROOT_BEER = "com.scottyab:rootbeer-lib:${LibraryVersion.ROOT_BEER}"
    const val PLAY_SERVICES_AUTH_API_PHONE =
        "com.google.android.gms:play-services-auth-api-phone:${LibraryVersion.PLAY_SERVICES_AUTH_API_PHONE}"
    const val PLAY_SERVICES_AUTH =
        "com.google.android.gms:play-services-auth:${LibraryVersion.PLAY_SERVICES_AUTH}"
    const val LIB_PHONE_NUMBER =
        "com.googlecode.libphonenumber:libphonenumber:${LibraryVersion.LIB_PHONE_NUMBER}"
    const val MODAL_BOTTOM_SHEET =
        "io.github.oleksandrbalan:modalsheet:${LibraryVersion.MODAL_BOTTOM_SHEET}"
    const val BIOMETRIC = "androidx.biometric:biometric:${LibraryVersion.BIOMETRIC}"
    const val METRIX =
        "ir.metrix:metrix:${LibraryVersion.METRIX}"
    const val SOCKET_IO = "io.socket:socket.io-client:${LibraryVersion.SOCKET_IO}"
    const val SHIMMER = "com.valentinilk.shimmer:compose-shimmer:${LibraryVersion.SHIMMER}"
    const val HEAP = "io.heap.core:heap-android-core:${LibraryVersion.HEAP}"
}
