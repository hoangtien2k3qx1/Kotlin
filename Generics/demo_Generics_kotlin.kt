package Generics

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 17:46
 * @file: demo_Generics_kotlin.kt
 * @update: 13/12/2023
 * @description:
 */

/**
 * @note: Generics: `in`, `out`, `where`
 *
 * Classes in Kotlin can have type parameters, just like in Java
 */


// demo
class Box<T>(t: T) {
    var value: T = t
}



// demo covariant (out)
/**
 * @note: covariant (out): theo chiều tăng dần: nghĩa là có thể gán kiểu String cho kiểu Any
 *
 * Khi được đánh dấu là covariant (out) thì subtype(bất kỳ) có thể gán supertype `Any` của lớp cha
 */
interface Source<out T> {
    fun nextT(): T
}

class StringSource(private val value: String) : Source<String> {
    override fun nextT(): String {
        return value
    }
}



/**
 * @note: contravariant (in): theo chiều giảm dần: ví dụ từ kiểu Number có thể gán xuống kiểu Int
 *
 */
interface Consumer<in T> {
    fun consume(value: T)
}


fun main() {

    val box: Box<Int> = Box(1)
    println(box.value)


    println("___________".repeat(30))

    // Example out (covariant)
    val stringSource: Source<String> = StringSource("Hello, Kotlin!")
    val anySource: Source<Any> = stringSource // OK, vì T được đánh dấu là covariant (out)

    // Gọi hàm nextT() trên Source<Any> trả về giá trị kiểu Any
    val result: Any = anySource.nextT()
    println(result)

    try {
        // kiểm tra kiểm intValue: String có phải là subtype của Any không
        val intValue: Any = result
        if (intValue is String) {
            println("Value as Int: $intValue")
        }
    } catch (e: ClassCastException) {
        println("Result is not an Int")
    }


    println("___________".repeat(30))

    // Example in (contravariant)
    val numberConsumer: Consumer<Number> = object : Consumer<Number> {
        override fun consume(value: Number) {
            println("Consuming number: $value")
        }
    }

    val intConsumer: Consumer<Int> = numberConsumer // OK, giảm chiều từ Consumer<Number> sang Consumer<Int>

    intConsumer.consume(42)
    intConsumer.consume(0)


}