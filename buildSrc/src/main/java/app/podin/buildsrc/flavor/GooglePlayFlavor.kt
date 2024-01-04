package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object GooglePlayFlavor : ProductFlavor {
    override val name = "googlePlay"
    override val dimension = FlavorDimension.MARKET.value
    override val versionNameSuffix = ""

}