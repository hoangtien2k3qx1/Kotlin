package _7NullSafety.SmartCast

fun main(args: Array<String>){
    var string: String? = "Hello!"
    if(string != null) { // smart cast
        println(string.length) // It works now!
    }

    println(string?.length ?: 0) // sử dụng toán tử "elvis" (`?:`)
    print(string?.length)        // sử dụng toán tử an toàn (`?.`)
}