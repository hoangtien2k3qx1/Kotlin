package Lambda

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 14:00
 * @file: demo_currying_function_kotlin.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: currying function kotlin
 *
 * Một hàm currying là một hàm mà thay vì nhận một danh sách các tham số, nó nhận một tham số và trả về một hàm mới chấp nhận
 * tham số tiếp theo và tiếp tục quá trình này cho đến khi đủ tham số
 */


fun <T> curry(fn: (T, T) -> T): (T) -> (T) -> T {
    return { x: T -> { y: T -> fn(x, y) } }
}


fun <T> curryingFunction(fn: (T, T) -> T): (T) -> (T) -> T = {x: T -> {y: T -> fn(x, y)}}


// curry function
fun adder12(firstNumber: Int): (Int) -> Int {
    return { secondNumber: Int ->
        firstNumber * secondNumber
    }
}


// curry function
fun adder13(s1: Int): (Int) -> Int = { s2: Int -> s1 * s2 }


fun adder14(s1: Int) = { s2: Int -> { s3: Int -> s1 * s2 * s3 } }

fun main() {

    val multiply: (Int) -> (Int) -> Int = curry { a: Int, b: Int -> a * b }
    val result = multiply(2)(3)
    println("Result: $result")

    // function lambda example:
    val sum_a_plus_b = operation(1, 2, {a, b -> a + b})
    println("Demo1: $sum_a_plus_b")


    // C1
    val addOne1 = adder1(2)
    val addOne2 = addOne1(4)
    println("AddOne: $addOne2")

    // C2
    val addOneExample = adder1(2)(4)
    println("AddOneExample: $addOneExample")


    val resultDemo = adder14(2)(3)(4)
    println("Result: $resultDemo")

}