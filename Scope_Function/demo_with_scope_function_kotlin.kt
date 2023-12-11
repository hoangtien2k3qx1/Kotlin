package Scope_Function

/**
 * @author: hoangtien2k3
 * @create: 11/12/2023 - 14:13
 * @file: demo_run_scope_function_kotlin.kt
 * @update: 11/12/2023
 * @description:
 */


/**
 * @note: scope function with run
 *
 * with: Object sẽ được sử dụng như 1 tham số receiver của lambda block. Giá trị trả về của function with là giá trị trả về của lambda ‘block’.
 *
 * between: ‘with’ có mục đích tương tự như ‘run’ nhưng ‘with’ là một function nhận object như tham số đầu tiên, còn ‘run ’ là một extension function của object .
 */


class DemoUser {
    var name = "hoangtien2k3"
    var age = 20
    var phoneNumber = "+84123456789"

    fun action(): String {
        println("Hello Run Action")
        return "Oke"
    }
}


fun main() {

    // scope function with input receiver normal function
    // no handling nullable type
    // choice using run and with is run can handling nullable type contradictory with no declaration nullable type
    val demo3 = with(DemoUser()) {
        this.name = "new name"
        this.age = 21
        this.phoneNumber = "84123456789"
        this.action()
    }

}