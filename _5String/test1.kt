package _5String

fun main(args: Array<String>) {
    val str1 = buildString { "string value" }
    val str2 = buildString { "string value" }
    println(str1 === str2)
    println(str1 !== str2)
}