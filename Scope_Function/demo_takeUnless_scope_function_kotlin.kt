package Scope_Function

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 15:46
 * @file: demo_takeUnless_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description:
 */

/**
 * @note:
 *
 * @kotlin.internal.InlineOnly
 * @SinceKotlin("1.1")
 * public inline fun <T> T.takeUnless(predicate: (T) -> Boolean): T? {
 *     contract {
 *         callsInPlace(predicate, InvocationKind.EXACTLY_ONCE)
 *     }
 *     return if (!predicate(this)) this else null
 * }
 *
 */

private fun debuglog(any: Any?) {
    println(any)
}

private fun findUserByIdFromDB(id: String): UserManager4.User = UserManager4.User(
    id = "1",
    username = "hoangtien2k3",
    isDeleted = true
)

private class UserManager4 {
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


    // using takeUnless in scope function with kotlin: takeUnless contradictory with takeIf
    fun findNewUserById(id: String): User? = findUserByIdFromDB(id).takeUnless { it.isDeleted }

}

fun main() {

    UserManager4().findUserById("hello")

    UserManager4().findNewUserById("hoangtien2k3")

}