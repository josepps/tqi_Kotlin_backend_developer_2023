package market.ju.tqi.Kotlin.backend.developer2023.service

interface ICartService {
    fun addToCart(cardItem: CartItem)
    fun removeFromCart(productName: String)
    fun getCartItems(): List<CartItem>
    fun getTotalPrice(): Double
    fun finalizeSale(paymentMethod: PaymentMethod): Double
    fun getAvailablePaymentMethods(): List<PaymentMethod>
}

data class CartItem(
    val productName: String,
    val quantity: Int,
    val unitPrice: Double
)

enum class PaymentMethod {
    CREDIT_CARD,
    DEBIT_CARD,
    CASH,
    PIX
}