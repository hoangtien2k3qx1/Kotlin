package _12Ranges.KotlinUtilityFunctions

fun main(args: Array<String>) {

    println("Range 1")
    var range1 = 5 downTo 1
    for (x in range1){
        print("$x ") // 5 4 3 2 1
    }

    println()

    println("Range 2")
    var range2: IntProgression = 5.downTo(1)
    for (x in range2){
        print("$x ") // 5 4 3 2 1
    }

    println()

    println("Range 3")
    var range3: IntProgression = IntProgression.fromClosedRange(5,1,-1)
    for (x in range3){
        print("$x ") // 5 4 3 2 1
    }

}