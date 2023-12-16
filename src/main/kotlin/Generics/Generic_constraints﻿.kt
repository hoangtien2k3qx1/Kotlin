package Generics

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 13:14
 * @file: Generic_constraints﻿.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: Generic constraints
 *
 *
 */


// Upper bounds
fun <T : Comparable<T>> sort(list: List<T>) {  }


// Generic constraints
fun <T> copyWhenGreater(list: List<T>, threshold: T): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it > threshold }.map { it.toString() }
}


fun main() {

    val result = copyWhenGreater(listOf("apple", "banana", "orange"), "banana")
    println(result)

}