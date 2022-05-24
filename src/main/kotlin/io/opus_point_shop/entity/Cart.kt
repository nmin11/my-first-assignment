package io.opus_point_shop.entity

import lombok.Getter
import javax.persistence.*

@Entity
@Getter
class Cart {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @OneToOne(mappedBy = "cart")
    lateinit var customer: Customer

    @OneToMany(mappedBy = "cart", cascade = [CascadeType.ALL])
    var products: MutableList<ProductCart> = mutableListOf()
}