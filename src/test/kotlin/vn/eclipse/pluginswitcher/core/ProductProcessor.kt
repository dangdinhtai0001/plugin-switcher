package vn.eclipse.pluginswitcher.core

interface ProductProcessor : Plugin<ProductType> {
    fun process(product: Product)
}