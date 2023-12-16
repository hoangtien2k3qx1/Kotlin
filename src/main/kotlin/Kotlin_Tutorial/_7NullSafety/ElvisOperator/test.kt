package _7NullSafety.ElvisOperator

fun main(args: Array<String>){

    var str: String? = null
    var str2: String? = "May be declare nullable string"

    var len1: Int = if (str != null) str.length else -1
    var len2: Int = if (str2 != null) str2.length else -1


    var len_1: Int = str?.length ?: -1
    var len_2: Int = str2?.length ?:  -1

    println("Length of str is ${len1}")
    println("Length of str2 is ${len2}")

    println("Length of str_1 is ${len_1}")
    println("Length of str_2 is ${len_2}")

}