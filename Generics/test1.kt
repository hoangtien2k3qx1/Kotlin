package Generics

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 23:58
 * @file: test1.kt
 * @update: 13/12/2023
 * @description: 
 */


/**
 * @note: receiver type:
 *
 * VD syntax: StringBuilder.() -> Unit
 *
 * Lambda này có một đối tượng StringBuilder như là một receiver
 * nghĩa là bạn có thể thao tác trực tiếp trên đối tượng StringBuilder bên trong lambda mà không cần chỉ định tên biến hoặc this.
 */
inline fun buildString(builderAction: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.builderAction()
    return stringBuilder.toString()
}


/**
 * @note: (lambda thông thường không có receiver)
 *
 * Khái niệm về higher order function
 *
 * VD: () -> Unit
 *
 */
inline fun doSomething(callback: () -> Unit) {
    // Thực hiện một số công việc...
    callback() // Gọi hàm lambda khi cần
}


// demo function kiểu: StringBuilder.() -> Unit
fun customBuilderAction(builder: StringBuilder) {
    builder.append("Hello")
    builder.append(", ")
    builder.append("Kotlin!")
}


// Hàm cụ thể có kiểu dữ liệu là () -> Unit
fun myFunctionDemo() {
    println("Callback executed from myFunction")
}


fun main() {

    // demo receiver type
    // Sử dụng DSL
    // C1
    val result1 = buildString {
        append("Hello")
        append(", ")
        append("Kotlin!")
    }
    println(result1)

    // C2
    val result2 = buildString(::customBuilderAction)
    println(result2)



    // _______________________
    println("_".repeat(50))



    // Sử dụng hàm doSomething với lambda
    // syntax sugar
    // Truyền vào hàm myFunction thay vì lambda
    // C1
    doSomething {
        println("Callback executed from myFunction")
    }

    // C2
    doSomething(::myFunctionDemo)

}