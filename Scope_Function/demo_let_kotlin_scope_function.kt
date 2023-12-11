package Scope_Function

import kotlin.random.Random

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 14:08
 * @file: demo_let_kotlin_scope_function.kt
 * @update: 11/12/2023
 * @description: scope function with let
 */

/**
 * @note:
 *
 * @kotlin.internal.InlineOnly
 * public inline fun <T, R> T.let(block: (T) -> R): R {
 *     contract {
 *         callsInPlace(block, InvocationKind.EXACTLY_ONCE)
 *     }
 *     return block(this)
 * }
 */

/**
 * @note: let
 *
 *  The context object is available as an argument (it).
 *
 *  The return value is the lambda result.
 */


// normal function
fun randomEvenIntOrNullOld(): Int? {
    val number = Random.nextInt()
    return if (number % 2 != 0) number else null
}

// scope function with let <=> extention function

//fun randomEvenIntOrNull(): Int? = Random.nextInt().let {
//    random -> if (random % 2 != 0) random else null
//}


// extention function
fun randomEvenIntOrNull(): Int? = Random.nextInt().let { if (it % 2 != 0) it else null }

fun sumAll(a: Int?, b: Int?, c: Int?): Int? {
    return if (a != null && b != null && c != null) a + b + c else null

    // warn
//    return a?.let { a1 ->
//        b?.let {b1 ->
//            c?.let {c1 ->
//                a1 + b1 + c1
//            }
//        }
//    }

}

// TODO
private fun dosomething(number: Int) {
    println("Example: $number")
}


// demo using let in nested class -> domo
class A
class B
class C
class D

fun f1(a: A) = B()
fun f2(b: B) = C()
fun f3(c: C) = D()


fun main() {

    // Example:
    val numbersDemo = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbersDemo.map { it.length }.filter { it > 3 }
    println(resultList)


    // With let
    val numbersLet = mutableListOf("one", "two", "three", "four", "five")
    numbersLet.map { it.length }.filter { it > 3 }.let(::println)


    //
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")


    println("_".repeat(50))


    // using let in scope function
    val result = "hello scope function".let {
        println(it)

        1 + 2
    }

    println(result)

    println("_".repeat(50))

    val randomEvenIntOrNullOld = randomEvenIntOrNullOld()
    println(randomEvenIntOrNullOld)

    println("_".repeat(50))

    val randomEvenIntOrNull = randomEvenIntOrNull()
    println(randomEvenIntOrNull)

    // ?.let => if randomEvenIntOrNull() return != null
    randomEvenIntOrNull()?.let {
        println("nullableInt = $it")
    }

    randomEvenIntOrNull?.let(::dosomething)


    // demo using nested class
    // C1
    f3(f2(f1(A())))

    // C2
    A().let { f1(it) }.let { f2(it) }.let { f3(it) }

    // C3
    A().let(::f1).let(::f2).let(::f3) // pipe operator

}

