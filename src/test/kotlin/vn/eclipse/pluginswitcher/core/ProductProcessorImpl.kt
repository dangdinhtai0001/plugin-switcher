package vn.eclipse.pluginswitcher.core

class ProductProcessorImpl : ProductProcessor {
    override fun process(product: Product) {
        println(product)
    }

    override fun supports(delimiter: ProductType): Boolean {
        return true
    }
}