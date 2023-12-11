package Scope_Function

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 14:13
 * @file: demo_run_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description:
 */

/**
 * @note:
 *
 * @kotlin.internal.InlineOnly
 * public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
 *     contract {
 *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
 *     }
 *     return receiver.block()
 * }
 */

/**
 * @note:
 *
 * The context object is available as a receiver (this).
 *
 * The return value is the lambda result.
 */

/**
 * @note: scope function with run
 *
 * with: Object sẽ được sử dụng như 1 tham số receiver của lambda block. Giá trị trả về của function with là giá trị trả về của lambda ‘block’.
 *
 * between: ‘with’ có mục đích tương tự như ‘run’ nhưng ‘with’ là một function nhận object như tham số đầu tiên, còn ‘run ’ là một extension function của object .
 */


class DemoUser {
    var name = "hoangtien2k3"
    var age = 20
    var phoneNumber = "+84123456789"

    fun action(): String {
        println("Hello Run Action")
        return "Oke"
    }
}


fun main() {

    // scope function with input receiver normal function
    // no handling nullable type
    // choice using run and with is run can handling nullable type contradictory with no declaration nullable type
    val demo3 = with(DemoUser()) {
        this.name = "new name"
        this.age = 21
        this.phoneNumber = "84123456789"
        this.action()
    }


    println("_".repeat(50))


    val numbersDemo1 = mutableListOf("one", "two", "three")
    with(numbersDemo1) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }


    val numbersDemo2 = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbersDemo2) {
        "The first element is ${first()}," +
        " the last element is ${last()}"
    }
    println(firstAndLast)

}