package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object MyketFlavor : ProductFlavor {
    override val name = "myket"
    override val dimension = FlavorDimension.MARKET.value
    override val versionNameSuffix = ""
}