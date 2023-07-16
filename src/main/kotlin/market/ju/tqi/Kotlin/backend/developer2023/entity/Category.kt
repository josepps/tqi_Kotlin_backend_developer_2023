package market.ju.tqi.Kotlin.backend.developer2023.entity

import jakarta.persistence.*

@Entity
data class Category(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @Column(nullable = false, unique = true) var name: String = ""
)
