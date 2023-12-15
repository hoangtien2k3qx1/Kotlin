package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 15:19
 * @file: noinline_function.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: noinline_function
 *
 * noinline, bạn đang nói với trình biên dịch rằng tham số hàm đó không nên được chuyển thành một hàm inline khi được truyền vào.
 */


inline fun performOperationNoInline(a: Int, b: Int, noinline operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val resultNoInline = performOperationNoInline(5, 3) { x, y -> x + y }
    println("Result NoInline: $resultNoInline")
}