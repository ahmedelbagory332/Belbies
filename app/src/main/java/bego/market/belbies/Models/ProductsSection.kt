package bego.market.belbies.Models

data class ProductsSection(
    val allProducts: MutableList<AllProduct>
)

data class AllProduct(
    val description: String,
    val id: String,
    val image: String,
    val name: String,
    val price: String,
    val productOfferPercentage: String,
    val productOfferPrice: String,
    val section: String
)