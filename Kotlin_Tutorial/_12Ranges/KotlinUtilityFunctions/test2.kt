package _12Ranges.KotlinUtilityFunctions

fun main() {
    val progression = 1..10 step 2
    val reversedProgression = progression.reversed()

    println(progression.joinToString()) // Output: 1, 3, 5, 7, 9
    println(reversedProgression.joinToString()) // Output: 9, 7, 5, 3, 1
}