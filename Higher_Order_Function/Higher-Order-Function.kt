package Higher_Order_Function

/**
 * @author: hoangtien2k3
 * @create: 14/12/2023 - 17:26
 * @file: Higher-Order-Function.kt
 * @update: 14/12/2023
 * @description:
 */

/**
 * @note: Higher Order Function with Generic Kotlin
 *
 *
 */

// higher order function collection
fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}


fun <S, T> StringBuilder.get(
    initial: S,
    combine: (acc: S, nextElement: T) -> S
): S {
    var accumulator = initial

    for (index in indices) {
        accumulator = combine(accumulator, get(index) as T)
    }

    return accumulator
}

fun main() {

    val items = listOf(1, 2, 3, 4, 5)

// Lambdas are code blocks enclosed in curly braces.
//    items.fold(0, {
//        acc: Int, i: Int ->
//        print("acc = $acc, i = $i, ")
//        val result = acc + i
//        println("result = $result")
//
//        // The last expression in a lambda is considered the return value:
//        result
//    })

    items.fold(0) { acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")

        // The last expression in a lambda is considered the return value:
        result
    }



    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)


    println("________________________________________________")


    val stringBuilder = StringBuilder().apply {
        append("Hello, ")
        append("world")
        append("!")
    }

    // Sử dụng hàm get để kết hợp các phần tử thành một giá trị
    val result = stringBuilder.get(" ", String::plus)

    val result2 = stringBuilder.get(" ") { acc: String, nextElement: Char -> acc + nextElement }


    // In kết quả result
    println("Result: $result")

    // In kết quả result2
    println("Result: $result2")

}