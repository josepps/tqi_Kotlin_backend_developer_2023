package market.ju.tqi.Kotlin.backend.developer2023.service.impl

import market.ju.tqi.Kotlin.backend.developer2023.entity.Category
import market.ju.tqi.Kotlin.backend.developer2023.reposirory.CategoryRepository
import market.ju.tqi.Kotlin.backend.developer2023.service.ICategoryService
import org.springframework.stereotype.Service

@Service
class CategoryService(
    private val categoryRepository: CategoryRepository
): ICategoryService {
    override fun save(category: Category): Category = this.categoryRepository.save(category)
}