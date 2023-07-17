package market.ju.tqi.Kotlin.backend.developer2023.service.impl

import market.ju.tqi.Kotlin.backend.developer2023.service.CartItem
import market.ju.tqi.Kotlin.backend.developer2023.service.ICartService
import market.ju.tqi.Kotlin.backend.developer2023.service.PaymentMethod
import org.springframework.stereotype.Service

@Service
class CartService: ICartService {
    private val cartItems = mutableListOf<CartItem>()
    override fun addToCart(cartItem: CartItem) {
        cartItems.add(cartItem)
    }

    override fun removeFromCart(productName: String) {
        cartItems.removeAll { it.productName == productName }
    }

    override fun getCartItems(): List<CartItem> {
        return cartItems.toList()
    }

    override fun getTotalPrice(): Double {
        return cartItems.sumOf { it.quantity * it.unitPrice }
    }

    override fun finalizeSale(paymentMethod: PaymentMethod): Double {
        val totalPrice = getTotalPrice()

        println("Valor total da compra: R$ $totalPrice")

        when (paymentMethod) {
            PaymentMethod.CREDIT_CARD, PaymentMethod.DEBIT_CARD -> {
                println("Forma de pagamento selecionada: Cartão de crédito/débito")
            }
            PaymentMethod.CASH -> {
                println("Forma de pagamento selecionada: Dinheiro")
            }
            PaymentMethod.PIX -> {
                println("Forma de pagamento selecionada: PIX")
            }
        }

        return totalPrice
    }
}