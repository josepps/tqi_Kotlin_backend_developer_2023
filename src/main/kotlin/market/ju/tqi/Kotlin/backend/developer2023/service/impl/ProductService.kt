package market.ju.tqi.Kotlin.backend.developer2023.service.impl

import market.ju.tqi.Kotlin.backend.developer2023.entity.Product
import market.ju.tqi.Kotlin.backend.developer2023.reposirory.ProductRepository
import market.ju.tqi.Kotlin.backend.developer2023.service.IProductService
import org.springframework.stereotype.Service

@Service
class ProductService(
    private val productRepository: ProductRepository
): IProductService {
    override fun save(product: Product): Product = this.productRepository.save(product)
}