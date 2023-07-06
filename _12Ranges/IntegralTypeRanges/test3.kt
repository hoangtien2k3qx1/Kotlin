package _12Ranges.IntegralTypeRanges

fun main(args: Array<String>) {

    val chars = ('a'..'e')
    val it = chars.iterator()
    while (it.hasNext()) {
        val x = it.next()
        print("$x ") // a b c d e
    }

}