package _4Array.KotlinArray

fun main(args: Array<String>) {
    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(11,12,13,14)
    array1.set(0,5)
    array1[2] = 6

    array2.set(2,10)
    array2[3] = 8

    for(element in array1){
        println(element)
    }
    println()
    for(element in array2){
        println(element)
    }
}