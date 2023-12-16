package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 15:21
 * @file: crossinline.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: crossinline
 *
 * crossinline, bạn đang nói với trình biên dịch rằng việc sử dụng return từ một lambda không được phép, ngay cả khi lambda được truyền vào một hàm inline.
 */

inline fun performOperationWithCrossInline(crossinline operation: () -> Unit) {
    println("Before operation")
    operation()
    println("After operation")
}

fun main() {
    performOperationWithCrossInline {
        // return is not allowed here with crossinline
        println("Performing operation")
    }
}

