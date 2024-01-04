package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object BazaarFlavor : ProductFlavor {
    override val name = "bazaar"
    override val dimension = FlavorDimension.MARKET.value
    override val versionNameSuffix = ""

}