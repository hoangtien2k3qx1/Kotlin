package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 14:20
 * @file: demo_function_kotlin.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: Function Kotlin
 *
 * Inline functions
 *
 * Noinline Functions
 *
 * Non-local returns
 *
 * Reified type parameters
 */


// Inline functions
inline fun operate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}


// Noinline Functions
inline fun operateAndPrint(x: Int, y: Int, noinline operation: (Int, Int) -> Int) {
    val result = operation(x, y)
    println("Result: $result")
}



// Non-local returns
fun foo() {
    ordinaryFunction {
        return@ordinaryFunction // ERROR: cannot make `foo` return here
    }
}

fun ordinaryFunction(function: () -> Unit) {}



// Reified type parameters



// Higher-order function nhận một hàm làm tham số
fun higherOrderFunction(operation: (Int, Int) -> Int): Int {
    return operation(10, 5)
}

// Hàm nhận làm tham số cho higher-order function
val sum: (Int, Int) -> Int = { a, b -> a + b }

val difference: (Int, Int) -> Int = { a, b -> a - b }



fun main() {
    val result = operate(5, 3) { a, b -> a + b }
    println("Result: $result")


    operateAndPrint(5, 3) { a, b -> a + b }


    // Truyền hàm làm tham số
    val sumResult = higherOrderFunction(sum)
    val differenceResult = higherOrderFunction(difference)

    println("Sum result: $sumResult")
    println("Difference result: $differenceResult")


}


