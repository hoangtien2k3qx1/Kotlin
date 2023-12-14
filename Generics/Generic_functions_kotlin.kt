package Generics

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 18:56
 * @file: Generic_functions_kotlin.kt
 * @update: 13/12/2023
 * @description:
 */

/**
 * @note: Generic functions
 *
 * fun <T> singletonList(item: T): List<T> {
 *     // ...
 * }
 *
 * fun <T> T.basicToString(): String { // extension function
 *     // ...
 * }
 */

/**
 * @note: Generic constraints
 *
 * fun <T : Comparable<T>> sort(list: List<T>) {  ... }
 */


// Generic function with a constraint
fun <T : Comparable<T>> max(a: T, b: T): T {
    return if (a > b) a else b
}

inline fun <reified A, reified B> Pair<*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B)
        return null
    return first as A to second as B
}

fun main() {

    val resultInt = max(3, 7)
    println("Max of 3 and 7 is: $resultInt")

    val resultDouble = max(4.5, 2.5)
    println("Max of 4.5 and 2.5 is: $resultDouble")

    println("___".repeat(50))


    val somePair: Pair<Any?, Any?> = "items" to listOf(1, 2, 3)

    val stringToSomething = somePair.asPairOf<String, Any>()
    println("stringToSomething: $stringToSomething")

    val stringToInt = somePair.asPairOf<String, Int>()
    println("stringToInt: $stringToInt")

    val stringToList = somePair.asPairOf<String, List<*>>()
    println("stringToList: $stringToList")

    // Note: The following compiles but breaks type safety!
    val stringToStringList = somePair.asPairOf<String, List<String>>()
    println("stringToStringList: $stringToStringList") // Compiles but breaks type safety!

}


