package Callback

// Đây là cách viết hàm khởi tạo trong kotlin,
// truyền vào what ??????
class Callback_Kotlin_Demo(val doThis: () -> Unit, val doThat: (number: Int) -> Unit = {}) {
    fun someFunction() {
        // Đoạn này gọi phương thức như phần callback đó
        // mà không cần callback đâu :))
        doThis()
        doThat(12)
    }
}

class UserClass {
    // Hàm khởi tạo của class MyClass, truyền cái :: ??
    val myClass = Callback_Kotlin_Demo(::doThis, ::doThat)

    private fun doThis() {
        println("Do this")
    }

    private fun doThat(number: Int) {
        println("Do that: $number")
    }
}

fun main() {
    // Tạo một đối tượng UserClass
    val user = UserClass()

    // Gọi phương thức someFunction từ đối tượng myClass
    user.myClass.someFunction()
}
