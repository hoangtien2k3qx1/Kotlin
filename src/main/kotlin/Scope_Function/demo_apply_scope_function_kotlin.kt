package Scope_Function

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 15:17
 * @file: demo_apply_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description:
 */

/**
 * @note:
 *
 * @kotlin.internal.InlineOnly
 * public inline fun <T> T.apply(block: T.() -> Unit): T {
 *     contract {
 *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
 *     }
 *     block()
 *     return this
 * }
 *
 */

/**
 * @note: apply
 *
 * The context object is available as a receiver (this).
 *
 * The return value is the object itself.
 */

/**
 * @note:
 *
 * Object được sử dụng như 1 tham số receiver của lambda block (this). Giá trị trả về của function apply là giá trị receiver object.
 *
 * ‘apply’ có thể hữu ích khi chúng ta truy cập vào 1 thuộc tính  và hàm của object mà không cần viết lại tên object nhiều lần hoặc block lambda không có giá trị trả về.
 */

class DemoUser2 {
    var name = "hoangtien2k3"
    var age = 20
    var phoneNumber = "+84123456789"

    fun action(): String {
        println("Hello Run Action")
        return "Oke"
    }
}

// using declaration normal new Object Demo2
private fun makeUserDemo2(): DemoUser2 {
    val user2 = DemoUser2()
    user2.name = "hoangtien2k3"
    user2.age = 14
    user2.phoneNumber = "+84123456789"
    user2.action()
    return user2
}

// using scope funcion new Object with `apply`
private fun newUserDemo2(): DemoUser2 = DemoUser2().apply {
    name = "hoangtien2k3"
    age = 14
    phoneNumber = "+84123456789"
    action()
}

fun main() {

    // normal function
    val newDemo1: DemoUser2 = makeUserDemo2()

    // using apply scope function
    val newDemo2: DemoUser2 = newUserDemo2()


}