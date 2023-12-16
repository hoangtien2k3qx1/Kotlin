package _12Ranges.KotlinUtilityFunctions

fun main(args: Array<String>) {
    val range: IntRange = 1..10
    println("Print range value with step 2:")
    for(x in range step (2)){
        print("$x ") // 1 3 5 7 9
    }
    println("")
    println("Print range value with step 3:")
    for(x in range step 3){
        print("$x ") // 1 4 7 10
    }
    val first=((range step 2).first)
    val last=((range step 2).last)
    println("")
    println("First value of interval: $first") // 1
    println("Last value of interval: $last ") // 9
}