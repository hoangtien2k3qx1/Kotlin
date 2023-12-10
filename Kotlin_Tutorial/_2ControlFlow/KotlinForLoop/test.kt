package _2ControlFlow.KotlinForLoop

fun example() {
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()
    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()
    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()
    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) print(i)
    println()
    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()
    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}

fun main(args : Array<String>) {

    val marks = arrayOf(80,85,60,90,70)
    for(item in marks.indices)
        println("marks[$item]: "+ marks[item])


    example()

}