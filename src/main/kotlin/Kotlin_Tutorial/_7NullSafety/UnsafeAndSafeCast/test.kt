package _7NullSafety.UnsafeAndSafeCast

fun main(args: Array<String>){
    val obj: Any? = null
    val str: String = obj as String
    println(str)
}