package Kotlin_Learn.Contructor.SecondaryContructor

// private primary constructor kết hợp với secondary constructor
class Product private constructor(val name: String) {
    // Secondary constructor
    constructor(name: String, age: Int) : this(name) {
        // Các công việc chuẩn bị khác (nếu có) có thể thực hiện ở đây
        // Secondary constructor cũng có thể gán giá trị cho các thuộc tính khác
        // Nếu bạn muốn thực hiện logic đặc biệt ở đây
    }

    fun getInfo() {
        println("Animal name: $name")
    }

    companion object {
        fun newProduct(name: String) = Product(name)
    }
}

fun main() {
    val animal1 = Product.newProduct("Dog")
    val animal2 = Product("Cat", 3)

    animal1.getInfo()
    animal2.getInfo()
}
