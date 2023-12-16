package _12Ranges.IntegralTypeRanges

fun main(args: Array<String>) {
    for(x in 'a'..'e')
        print("$x ") // a b c d e

    println()

    for (x in 'e' downTo 'a')
        print("$x ") // e d c b a
}