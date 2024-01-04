package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object StagingFlavor : ProductFlavor {
    override val name = "staging"
    override val dimension = FlavorDimension.ENVIRONMENT.value
    override val versionNameSuffix = "-staging"

}
