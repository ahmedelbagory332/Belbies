package bego.market.belbies.Models

 data class AllUsersOrders(
    val UsersOrders: MutableList<UsersOrder>
)

data class UsersOrder(
    val mail: String,
    val orderNumbers: String,
    val userAddress: String

)