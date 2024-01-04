package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object NormalFlavor : ProductFlavor {
    override val name = "normal"
    override val dimension = FlavorDimension.API.value
    override val versionNameSuffix = ""

}
