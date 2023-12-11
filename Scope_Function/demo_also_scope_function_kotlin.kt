package Scope_Function


/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 15:32
 * @file: demo_also_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description:
 */


/**
 * @note:
 *
 * @kotlin.internal.InlineOnly
 * @SinceKotlin("1.1")
 * public inline fun <T> T.also(block: (T) -> Unit): T {
 *     contract {
 *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
 *     }
 *     block(this)
 *     return this
 * }
 */

/**
 * @note:
 *
 * also: also scope function returns the context object
 */


class PersonDetails{
    var name: String = ""
    var age: Int = 0
}

fun main() {
    val personDetail=PersonDetails().apply{
        name = "hoangtien2k3"
        age = 20
    }

    with(personDetail){
        println(name)
        println(age)
    }

    // also scope function return this no return body lambda
    personDetail.also{
        it.name = "hoangtien2k3 a backend developer"
        println("New Name: ${it.name}")
    }

}



