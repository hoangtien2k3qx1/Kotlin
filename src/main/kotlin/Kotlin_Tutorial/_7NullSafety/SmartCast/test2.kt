package _7NullSafety.SmartCast

fun main(args: Array<String>){
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if(obj is String) {
        // No Explicit Casting needed.
        println("String length is ${obj.length}")
    }
}