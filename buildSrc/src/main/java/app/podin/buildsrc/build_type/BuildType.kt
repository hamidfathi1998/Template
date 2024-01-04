package ir.hfathi.template.buildsrc.build_type

interface BuildType {
    val isMinifyEnabled: Boolean
    val isShrinkResources: Boolean

    object BuildType {
        const val BUILD_TYPE: String = "BuildType"
        const val RELEASE = "release"
        const val DEBUG = "debug"
    }
}