package _12Ranges.IntegralTypeRanges

fun main(args: Array<String>) {
    for (x in 1..10 step 2)
        print("$x ") // 1 3 5 7 9

    println()

    for (x in 10 downTo 1 step 3)
        print("$x ") // 10 7 4 1
}