package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 14:59
 * @file: Higher_Order_Function.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: Higher_Order_Function
 *
 *
 */


// Higher-Order Functions
fun higherOrderFunction(operation: (Int, Int) -> Int, a: Int, b: Int): Int {
    return operation(a, b)
}

val sumTest1: (Int, Int) -> Int = { x, y -> x + y }
val differenceTest1: (Int, Int) -> Int = { x, y -> x - y }


fun main() {
    // Higher-Order Functions
    val result1 = higherOrderFunction(sumTest1, 3, 2) // Truyền hàm làm tham số
    val result2 = higherOrderFunction(differenceTest1, 5, 3) // Truyền hàm làm tham số
}