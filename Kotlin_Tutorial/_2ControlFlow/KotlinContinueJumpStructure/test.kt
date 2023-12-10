package _2ControlFlow.KotlinContinueJumpStructure

fun example() {
    exp@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2) {
                continue@exp
            }
            println("this is below if")
        }
    }
}

fun main(args: Array<String>) {
    for (i in 1..3) {
        println("i = $i")
        if (i == 2) {
            continue
        }
        println("this is below if")
    }

    println()

    example()
}