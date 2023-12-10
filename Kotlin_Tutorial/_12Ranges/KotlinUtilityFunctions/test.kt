package _12Ranges.KotlinUtilityFunctions

fun main(args: Array<String>) {
    var range: IntRange = 1.rangeTo(5)
    println("Printing value: 1.rangeTo(5)")
    for (x in range){
        print("$x ") // 1 2 3 4 5
    }
    println("")
    var range2: IntRange = IntRange(1,5)
    println("Printing value: IntRange(1,5)")
    for (x in range2){
        print("$x ") // 1 2 3 4 5
    }
}