package Kotlin_Learn.Contructor.SecondaryContructor

// primary constructor kết hợp với secondary constructor
class Animal(val firstName: String, val lastName: String){
    // Primary constructor

    // Secondary constructor 1: Gọi primary constructor
    constructor(firstName: String) : this(firstName, "") {
        // Gọi primary constructor bằng từ khóa "this"
    }

    // Secondary constructor 2: Không gọi primary constructor
    constructor() : this("", "") {
        // Không gọi primary constructor, khởi tạo các thuộc tính tại đây
    }
}

fun main() {
    val myAnimal = Animal("Hoàng Anh Tiến", "2K3")
    println(myAnimal.firstName + " - " + myAnimal.lastName)
}