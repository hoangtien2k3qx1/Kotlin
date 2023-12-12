package Delegation

/**
 * @author: hoangtien2k3
 * @create: 12/12/2023 - 12:40
 * @file: demo_delegation_kotlin.kt
 * @update: 12/12/2023
 * @description:
 */

/**
 * @note: `Delegation` Design Pattern Kotlin
 * @note: `Delegation` implementation pattern
 *
 * interface Base {
 *     fun print()
 * }
 *
 * class BaseImpl(val x: Int) : Base {
 *     override fun print() { print(x) }
 * }
 *
 * class Derived(b: Base) : Base by b
 *
 * fun main() {
 *     val b = BaseImpl(10)
 *     Derived(b).print()
 * }
 */


// Demo
data class ProductEntity(
    val id: String,
    val name: String,
    val price: Double
)

interface ProductRepository {
    fun getFavoriteProduct(): List<ProductEntity>
    fun getTrendingProduct(): List<ProductEntity>
    fun getPopularProduct(): List<ProductEntity>
}


// hàm này sẽ kế thừa từ ProductRepository và triển khai lại tất cả function interface
class ProductRepositoryAPIVersion1 : ProductRepository {
    override fun getFavoriteProduct(): List<ProductEntity> {
        println("\n$this::getFavoriteProduct")
        return listOf(ProductEntity(id = "faucibus", name = "Kayla Rodriquez", price = 4.5))

    }

    override fun getTrendingProduct(): List<ProductEntity> {
        println("\n$this::getTrendingProduct")
        return listOf(ProductEntity(id = "discere", name = "Melinda Sanchez", price = 8.9))
    }

    override fun getPopularProduct(): List<ProductEntity> {
        println("\n$this::getPopularProduct")
        return listOf(ProductEntity(id = "conubia", name = "Shawn Holder", price = 12.13))
    }
}


// giờ ta chỉ muốn kế thừa và triển khai lại 1 hàm trong ProductEntity thôi thì làm thế nào
// nên kotlin có 1 cái là Delegation rất hay cho việc đó
class ProductRepositoryAPIVersion2(
    val demoDelegate: ProductRepository
) : ProductRepository by demoDelegate {
    override fun getPopularProduct(): List<ProductEntity> {
        println("\nVersion 2: Delegation >>>>> $this::getPopularProduct")
        return listOf(ProductEntity(id = "pericula", name = "Laurie Lester", price = 16.17))
    }
}


fun makeProductRepository(): ProductRepository {
    val v1 = ProductRepositoryAPIVersion1()
    return ProductRepositoryAPIVersion2(v1) // version 2 update
}


fun main() {
    val repository: ProductRepository = makeProductRepository()

    repository.getFavoriteProduct().let(::println)
    repository.getTrendingProduct().let(::println)
    repository.getPopularProduct().let(::println) // update áp dụng Delegation

}