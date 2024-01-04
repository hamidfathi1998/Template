package ir.hfathi.template.buildsrc.flavor

import ir.hfathi.template.buildsrc.flavor.dimension.FlavorDimension

object DevelopmentFlavor : ProductFlavor {
    const val APPLICATION_ID_SUFFIX = ".dev"
    override val name = "development"
    override val dimension = FlavorDimension.ENVIRONMENT.value
    override val versionNameSuffix = "-development"
}
