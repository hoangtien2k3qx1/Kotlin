package Lambda

import javax.security.auth.callback.Callback

fun sumMethod(a: Int, b: Int): Int {
    println("Called $a and $b")
    return a + b
}

fun isEven(int: Int): Boolean = int % 2 == 0


// example hight-order-function
fun receiveCallback(callback: () -> Unit) {
    Thread {
        Thread.sleep(500)
        callback()
    }.start()
}


// single param of lambda <=> it
//val isNumberGreaterThan10: (Int) -> Boolean = { number: Int -> number > 10}
val isNumberGreaterThan10: (Int) -> Boolean = { it > 10}


// curry function
fun adder(firstNumber: Int): (Int) -> Int {
    return { secondNumber ->
        firstNumber * secondNumber
    }
}


// curry function
fun adder1(s1: Int): (Int) -> Int = { s2 -> s1 * s2 }


fun main() {

    val sumLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

    sumMethod(1, 2)


//    val value = sumLambda.invoke(1, 2)
    val value: Int = sumLambda(1, 2)
    println(value)


    // method reference, function reference: nomal method/function -> lambda
    val sumLambdaFromMethod: (a: Int, b: Int) -> Int = ::sumMethod


//    val eventNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 9, 10).filter({ t -> isEven(t) })
//    val eventNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 9, 10).filter { t -> isEven(t) }

    listOf(1, 2, 3, 4, 5, 6, 7, 9, 10)
        .filter(::isEven)
        .forEach(::println)


    listOf(1, 2, 3, 4, 5, 6, 7, 9, 10)
        .filter(isNumberGreaterThan10)
        .forEach(::println)


    // callback hell
    receiveCallback {
        println("Callback 1")

        receiveCallback {
            println("Callback 2")

            receiveCallback {
                println("Callback 3")

                receiveCallback {
                    println("Callback 4")

                    receiveCallback {
                        println("Callback 5")
                    }
                }
            }
        }

    }



    val adder1 = adder(firstNumber = 1) // 1 + 10
    println(adder1)
    val adder2 = adder(2) // 2 + 10
    println(adder2)

}