package vn.eclipse.pluginswitcher.core

import org.junit.jupiter.api.Test

class PluginRegistryTest {
    @Test
    fun testPluginRegistry() {
        val registry: PluginRegistry<ProductProcessor, ProductType> = DefaultPluginRegistry.of(ProductProcessorImpl())
        val count = registry.countPlugins()
        println(count)

        val plugin = registry.getPluginFor(ProductType.HARDWARE)
    }
}