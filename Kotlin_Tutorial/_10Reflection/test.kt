package _10Reflection

data class Person(val name: String, val age: Int?)

fun main() {
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob", null)

    println(person1.age?.toString()) // Kết quả: "25"
    println(person2.age?.toString()) // Kết quả: null

    val nullableList: List<Int>? = null
    println(nullableList?.size) // Kết quả: null
}