package _8Collections.KotlinListInterface

fun main(args: Array<String>){
    var intList: List<Int> = listOf<Int>(1, 2, 3)
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash")
    var anyList: List<Any> = listOf<Any>(1,2,3,"Ajay","Vijay","Prakash")
    println("print int list")
    for(element in intList){
        println(element)
    }
    println()
    println("print string list")
    for(element in stringList){
        println(element)
    }
    println()
    println("print any list")
    for(element in anyList){
        println(element)
    }

    var sum: Int
    if (anyList[0] is Int && anyList[1] is Int) {
        sum = anyList[0] as Int + anyList[1] as Int
        println(sum)
    }

    println()
    println(anyList[4])
}
