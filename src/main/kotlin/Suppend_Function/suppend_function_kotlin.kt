package Suppend_Function

/**
 * @author: hoangtien2k3
 * @create: 16/12/2023 - 16:35
 * @file: suppend_function_kotlin.kt
 * @update: 16/12/2023
 * @description:
 */

/**
 * @note: Suppend Function
 *
 *
 */

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

// Định nghĩa một suspend function
suspend fun doSomething() {
    println("Bắt đầu thực hiện công việc")
    delay(1000) // Giả lập một công việc mất thời gian
    println("Hoàn thành công việc")
}

fun main() = runBlocking {
    println("Bắt đầu hàm main")

    // Gọi suspend function trong một coroutine
    doSomething()

    println("Kết thúc hàm main")
}
