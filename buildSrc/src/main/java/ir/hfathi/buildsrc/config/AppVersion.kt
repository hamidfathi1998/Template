package ir.hfathi.buildsrc.config

object AppVersion {
    private const val MAJOR = 1
    private const val MINOR = 0
    private const val PATCH = 0

    fun getVersionCode(): Int = (MAJOR * 10_000 + MINOR * 100 + PATCH)

    fun getVersionName(): String = "$MAJOR.$MINOR.$PATCH"
}
