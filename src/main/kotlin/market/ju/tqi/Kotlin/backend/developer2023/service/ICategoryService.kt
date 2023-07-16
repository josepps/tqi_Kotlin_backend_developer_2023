package market.ju.tqi.Kotlin.backend.developer2023.service

import market.ju.tqi.Kotlin.backend.developer2023.entity.Category

interface ICategoryService {
    fun save(category: Category): Category
}