package _12Ranges.KotlinUtilityFunctions

fun main(args: Array<String>) {
    println("Reversed 1")
    var range1 = 1..5
    for (x in range1.reversed()){
        print("$x ") // 5 4 3 2 1
    }
    println()
    println("Reversed 2")
    var range2: IntRange = IntRange(1,5)
    for (x in range2.reversed()){
        print("$x ") // 5 4 3 2 1
    }
    println()
    println("Reversed 3")
    var range3 = IntProgression.fromClosedRange(5,1,-1)
    for (x in range3.reversed()){
        print("$x ") // 1 2 3 4 5
    }
    println()
    println("Reversed 4")
    var range4: IntProgression = IntProgression.fromClosedRange(5,1,-2)
    for (x in range4.reversed()){
        print("$x ") // 1 3 5
    }
}