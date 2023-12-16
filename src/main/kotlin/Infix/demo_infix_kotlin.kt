package Infix


class DemoInfix {
    fun doSomething1(input: String) {
        println("hello with $input 1")
    }

    infix fun demoInfixFunction(input: String) {
        println("hello with $input 2") // string template
    }

}


fun getUserInfo(): Pair<String, Int> {
    // Giả sử hàm trả về một cặp (Pair) tên và tuổi
    return Pair("hoangtien2k3", 20)
}



fun main() {

    // normal function
    DemoInfix().doSomething1("hoangtien2k3")

    // using infix function kotlin
    DemoInfix() demoInfixFunction "Hoàng Anh Tiến"


    println("_".repeat(50))


    val map: Map<String, Int> = mapOf("1" to 1, "2" to 2, "3" to 3)

    // call destructuring declaration in kotlin
    for((key, value) in map) {
        println("$key to $value")
    }


    println("_".repeat(50))


    // Destructuring declaration khi gọi hàm
    val (name, age) = getUserInfo()
    println("Name: $name, Age: $age")


}