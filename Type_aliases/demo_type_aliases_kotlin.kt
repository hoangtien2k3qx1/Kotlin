package Type_aliases

import java.io.File
import java.util.function.Predicate

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 16:24
 * @file: demo_type_aliases_kotlin.kt
 * @update: 13/12/2023
 * @description:
 */

/**
 * @note:
 *
 * class A {
 *     inner class Inner
 * }
 *
 * class B {
 *     inner class Inner
 * }
 *
 * typealias AInner = A.Inner
 * typealias BInner = B.Inner
 */


// demo
//typealias NodeSet = Set<Network.Node>

typealias FileTable<K> = MutableMap<K, MutableList<File>>

// orther demo
typealias MyHandler = (Int, String, Any) -> Unit



// Example demo kotlin

//typealias Predicate<T> = (T) -> Boolean


// Định nghĩa một typealias cho kiểu dữ liệu PhoneNumber
typealias PhoneNumber = String

// Sử dụng typealias trong khai báo biến và hàm
fun printPhoneNumber(phoneNumber: PhoneNumber) {
    println("Phone Number: $phoneNumber")
}

fun main() {
    // Sử dụng biến có kiểu là PhoneNumber
    val myPhoneNumber: PhoneNumber = "+1234567890"
    printPhoneNumber(myPhoneNumber)

    // Sử dụng kiểu PhoneNumber trong một hàm
    val phoneNumbers: List<PhoneNumber> = listOf("+9876543210", "+1122334455")
    phoneNumbers.forEach { printPhoneNumber(it) }
}

