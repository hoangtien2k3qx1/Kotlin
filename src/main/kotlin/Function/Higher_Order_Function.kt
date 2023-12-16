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



// Demo sự khác nhau;
fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiplyByTwo(x: Int): Int {
    return x * 2
}

fun operateOnNumbers(a: Int, b: Int, operation: (Int) -> Int): Int {
    val resultA = operation(a)
    val resultB = operation(b)
    return resultA + resultB
}



fun main() {
    // Higher-Order Functions
    val result1 = higherOrderFunction(sumTest1, 3, 2) // Truyền hàm làm tham số
    val result2 = higherOrderFunction(differenceTest1, 5, 3) // Truyền hàm làm tham số



    println("_".repeat(80))


    val result = add(3, 5)
    println("Result: $result")


//    val sum = operateOnNumbers(3, 5, ::add) // sử dụng hàm bậc nhất add
    val product = operateOnNumbers(3, 5, ::multiplyByTwo) // sử dụng hàm bậc nhất multiplyByTwo

    println("Sum: $sum")
    println("Product: $product")


}