package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 15:28
 * @file: typealias_kotlin.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: typealias
 *
 * typealias là một cách để tạo ra một từ ngữ mới để đặt tên lại một kiểu dữ liệu có sẵn hoặc một sự kết hợp của các kiểu dữ liệu.
 */

typealias IntList = List<Int>

fun main() {
    val numbers: IntList = listOf(1, 2, 3, 4, 5)
    println("Numbers: $numbers")
}

