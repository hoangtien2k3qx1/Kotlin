package Null_safety

/**
 * @author: hoangtien2k3
 * @create: 16/12/2023 - 02:20
 * @file: demo_null_safety_kotlin.kt
 * @update: 16/12/2023
 * @description:
 */

/**
 * @note: Null safety
 *
 *
 */


fun main() {

    var a: String = "abc" // Regular initialization means non-nullable by default
    //a = null // compilation error (vì nó không thể gán giá trị null)

    var b: String? = "abc" // can be set to null
    b = null // ok
    print(b)

}