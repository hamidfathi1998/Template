package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object MockFlavor : ProductFlavor {
    override val name = "mock"
    override val dimension = FlavorDimension.API.value
    override val versionNameSuffix = ""

}
