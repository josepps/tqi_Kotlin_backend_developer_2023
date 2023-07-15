package market.ju.tqi.Kotlin.backend.developer2023.entity

import jakarta.persistence.*

@Entity
data class Products(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category", referencedColumnName = "id")
    var category: Categories? = null,
    @Column(nullable = false) var brand: String = "",
    @Column(nullable = false) var name: String = "",
    @Column(nullable = false) var unitOfMeasurement: String = "",
    @Column(nullable = false) var measure: Double = 0.0,
    @Column(nullable = false) var price: Double = 0.0
)