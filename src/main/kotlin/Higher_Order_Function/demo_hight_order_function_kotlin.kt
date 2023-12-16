package Higher_Order_Function

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 23:29
 * @file: demo_hight_order_function_kotlin.kt
 * @update: 13/12/2023
 * @description:
 */

/**
 * @note: higher order function kotlin
 *
 * Các hàm thông thường luôn chỉ nhận vào các tham số dữ liệu,
 * nhưng với Higher Oder Funtion lại có thể nhận một funtion khác như một param
 * hoặc có thể trả về một funtion được gọi là 1 Higher order funtion.
 */

/**
 * @note: Higher Order Function
 *
 * Chia làm 2 loại:
 *
 *  1. Hàm nhận hàm làm tham số
 *
 *  2. Hàm trả về hàm
 */

/**
 * @note:
 *
 * Phần 1 - Higher Order Function?
 *
 * Phần 2 - Lambda?
 */


// 1. Hàm nhận hàm làm tham số
fun doSomething(callback: () -> Unit) {
    // Thực hiện một số công việc...
    callback() // Gọi hàm lambda khi cần
}

fun doSomething1(callback: () -> Int) {
    // Thực hiện một số công việc...
    callback() // Gọi hàm lambda khi cần
}


// 2. Hàm trả về hàm
fun multiplyBy(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}




// ## 3 cách sử dụng trên là như nhau và như các cách function reference và function anonymous.
/*
*  `it`: implicit name of a single parameter
*   doSomethingWithNumber(1000) {
        println("The result is $it")
        // do something with result
    }



    Destructuring trong Lambdas:
    map.mapValues { entry -> "${entry.value}!" }
    map.mapValues { (key, value) -> "$value!" }




    Lambda return:
    //The first way
    ints.filter {
        val shouldFilter = it > 0
        shouldFilter
    }

    //The second way
    ints.filter {
        val shouldFilter = it > 0
        return@filter shouldFilter
    }


* */


fun demo_input_function() {
    println("1. Hàm nhận hàm làm tham số")
}



fun doSomethingWithNumber(number: Int, receiver: (String?) -> Unit) {
    val result: String? = null
    //...do complex work with number

    receiver(result)
}


fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"




///////
val m = { x: String -> println(x) }
val n: (String) -> Unit = { x -> println(x) }
val o: (String) -> Unit = { x: String -> println(x) }


fun main() {

    // 1. hàm nhận hàm làm tham số
    val demo_result = doSomething {
        println("1. Hàm nhận hàm làm tham số")
    }

    doSomething(::demo_input_function)

    val result_123 = doSomething1 {
        42
    }
    println("Result: $result_123")


    println("_______________________________________________________")


    // 2. Hàm trả về hàm
    val multiplyBy2 = multiplyBy(factor = 2).also {
        println(it)
    }
    val result1 = multiplyBy2(5).also {
        println(it)
    }


    println("_______________________________________________________")


    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd)) // refers to isOdd(x: Int)


    println("_______________________________________________________")


    m("good morning")
    n("good morning")
    o("good morning")




}