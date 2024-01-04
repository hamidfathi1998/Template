package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.ProductFlavor
import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object ProductionFlavor : ProductFlavor {
    override val name = "production"
    override val dimension = FlavorDimension.ENVIRONMENT.value
    override val versionNameSuffix = ""

}
