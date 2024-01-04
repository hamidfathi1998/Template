package ir.hfathi.template.buildsrc.build_type

object BuildTypeRelease : BuildType {
    override val isMinifyEnabled = true
    override val isShrinkResources = true
    val proguardFiles = arrayOf("proguard-android-optimize.txt", "proguard-rules.pro")
    val consumerProguardFiles = arrayOf("consumer-rules.pro")
}