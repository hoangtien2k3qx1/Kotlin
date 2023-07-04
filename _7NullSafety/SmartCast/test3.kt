package _7NullSafety.SmartCast

fun findLength(str: String?): Int {
    return str?.length ?: 0
}

fun main(args: Array<String>) {
    println(findLength(null)) // Kết quả: 0
    println(findLength("Hello")) // Kết quả: 5
}