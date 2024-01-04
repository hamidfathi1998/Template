package ir.hfathi.template.buildsrc.build_type

object BuildTypeDebug : BuildType {
    override val isMinifyEnabled = false
    override val isShrinkResources = false
}