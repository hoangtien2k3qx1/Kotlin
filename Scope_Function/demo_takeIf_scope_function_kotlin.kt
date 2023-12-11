package Scope_Function

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 15:36
 * @file: demo_takeIf_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description: 
 */

/**
 * @note:
 *
 * @kotlin.internal.InlineOnly
 * @SinceKotlin("1.1")
 * public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T? {
 *     contract {
 *         callsInPlace(predicate, InvocationKind.EXACTLY_ONCE)
 *     }
 *     return if (predicate(this)) this else null
 * }
 *
 */

/**
 * @note:
 * 
 * takeIf: Returns this value if it satisfies the given predicate or null, if it doesn't.
 */

private fun debuglog(any: Any?) {
    println(any)
}

private fun findUserByIdFromDB(id: String): UserManager.User = UserManager.User(
        id = "1",
        username = "hoangtien2k3",
        isDeleted = true
    )

private class UserManager {
    class User(
        var id: String,
        var username: String,
        var isDeleted: Boolean
    )


    // using normal function
    fun findUserById(id: String): User? {
        val found = findUserByIdFromDB(id)
        return if (found != null && !found.isDeleted) found else null
    }


    // using takeIf in scope function with kotlin
    fun findNewUserById(id: String): User? = findUserByIdFromDB(id).takeIf { !it.isDeleted }


}

fun main() {

    UserManager().findUserById("hello")

    UserManager().findNewUserById("hoangtien2k3")

}