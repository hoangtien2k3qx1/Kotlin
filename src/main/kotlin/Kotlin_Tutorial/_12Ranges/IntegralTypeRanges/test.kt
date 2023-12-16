package _12Ranges.IntegralTypeRanges

fun main(args: Array<String>) {

    for (x in 1..5)
        print(x) // 12345

    println()

    for (x in 5 downTo 1)
        print(x) // 54321

    println()

    for (x in 1.rangeTo(5))
        print(x) // 12345

    println()

    for (x in 5.downTo(1))
        print(x) // 54321

    println()

    for (x in 1..10 step 2)
        print("$x ") // 1 3 5 7 9

    println()

    for (x in 10 downTo 1 step 3)
        print("$x ") // 10 7 4 1

    println()

    for(x in 'a'..'e')
        print("$x ") // a b c d e

    println()

    for (x in 'e' downTo 'a')
        print("$x ") // e d c b a

}

