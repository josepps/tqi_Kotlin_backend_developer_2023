package market.ju.tqi.Kotlin.backend.developer2023.reposirory

import market.ju.tqi.Kotlin.backend.developer2023.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Long> {
}