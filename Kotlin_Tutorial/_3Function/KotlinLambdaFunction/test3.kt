package _3Function.KotlinLambdaFunction

fun addOrderFunction(a: Int, b: Int, lambda: (Int) -> Unit) {
    val tutal = a + b
    lambda(tutal)
}

fun main() {
    val myLambda: (Int) -> Unit = {s: Int -> println(s)} // lambda expresion
    addOrderFunction(5, 10, myLambda) // hight order function
}