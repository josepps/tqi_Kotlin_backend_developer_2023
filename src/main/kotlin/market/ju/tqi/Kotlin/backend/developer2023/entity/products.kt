package market.ju.tqi.Kotlin.backend.developer2023.entity

data class products(
    val id: Long? = null,
    var brand: String = "",
    var name: String = "",
    var unit_of_measurement: String = "",
    var measure: Number = 0,
    var price: Number = 0,
)

//Coferir tipo number
//Como pega o id do outro