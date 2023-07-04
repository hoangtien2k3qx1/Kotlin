package _4Array.KotlinArray

fun main(args: Array<String>) {

    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(11,12,13,14)

    println(array1.get(0))
    println(array1[2])

    println()

    println(array2.get(2))
    println(array2[3])
}