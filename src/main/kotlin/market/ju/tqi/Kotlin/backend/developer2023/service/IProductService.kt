package market.ju.tqi.Kotlin.backend.developer2023.service

import market.ju.tqi.Kotlin.backend.developer2023.entity.Product
import org.springframework.stereotype.Service

interface IProductService {
    fun save(product: Product): Product
}