package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 15:18
 * @file: inline_function.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: inline_function
 *
 * inline, trình biên dịch có thể sao chép nội dung của hàm trực tiếp vào nơi gọi hàm
 */


inline fun performOperationInline(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {

    val resultInline = performOperationInline(5, 3) { x, y -> x + y }
    println("Result Inline: $resultInline")

}