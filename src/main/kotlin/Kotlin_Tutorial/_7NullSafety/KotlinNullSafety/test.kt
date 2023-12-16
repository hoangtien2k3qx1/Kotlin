package _7NullSafety.KotlinNullSafety

fun main(args: Array<String>){
    var str: String? = "Hello" // variable is declared as nullable
    println(str)
    str = null

    // var str: String = "Hello"
    // str = null // compile error

}