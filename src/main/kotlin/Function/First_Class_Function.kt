package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 14:59
 * @file: First_Class_Function.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: First_Class_Function
 *
 * Đặc điểm chính:
 *      Trong một ngôn ngữ có first-class functions, hàm được coi là một "đối tượng" đầy đủ, có thể thao tác như bất kỳ giá trị khác trong ngôn ngữ đó.
 *
 * Khả năng:
 *      Có thể gán một hàm vào một biến.
 *      Có thể truyền hàm như là một tham số cho một hàm khác.
 *      Có thể trả về một hàm từ một hàm khác.
 */


// First-Class Functions
val myFunction: () -> Unit = { println("Hello from myFunction") }

val anotherFunction = myFunction // Gán hàm vào một biến

fun applyFunction(fn: () -> Unit) {
    fn() // Thực thi hàm được truyền vào
}


fun main() {

    // First-Class Functions
    applyFunction(myFunction) // Truyền hàm làm tham số


}