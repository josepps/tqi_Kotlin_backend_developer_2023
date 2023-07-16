package market.ju.tqi.Kotlin.backend.developer2023.reposirory

import market.ju.tqi.Kotlin.backend.developer2023.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Long> {
}