package Scope_Function

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 14:13
 * @file: demo_run_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description:
 */


/**
 * @note: scope function with run
 *
 * @kotlin.internal.InlineOnly
 * public inline fun <T, R> T.run(block: T.() -> R): R {
 *     contract {
 *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
 *     }
 *     return block()
 * }
 *
 */


class DemoRunScopeFunction {
    var name = "hoangtien2k3"
    var age = 20
    var phoneNumber = "+84123456789"

    fun action(): String {
        println("Hello Run Action")
        return "Oke"
    }
}


fun main() {
    val str = "Hello"
    // this
    str.run {
        println("The string's length: $length")
        //println("The string's length: ${this.length}") // does the same
    }

    // it
    str.let {
        println("The string's length is ${it.length}")
    }


    println("_".repeat(50))

    // C1
    val demo1 = DemoRunScopeFunction()
    demo1.name = "HoangAnhTien"
    demo1.age = 20
    demo1.phoneNumber = "+84123456789"
    demo1.action()


    // C2: input type is extention function
    // handling nullable type
    val demo2 = DemoRunScopeFunction().run {
        name = "hoangtien2k3"
        age = 20
        phoneNumber = "+84123456789"
        action() // demo2
    }

}