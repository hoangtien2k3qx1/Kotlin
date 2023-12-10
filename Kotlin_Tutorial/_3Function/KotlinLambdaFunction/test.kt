package _3Function.KotlinLambdaFunction

// hàm thông thường
fun addNumber(a: Int, b: Int){
    val add = a + b
    println(add)
}

// hàm có lambda
fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter
    val add = a + b
    mylambda(add) // println(add)
}

fun main(args: Array<String>){
    val myLambda: (Int) -> Unit = {s: Int -> println(s) } // lambda function
    addNumber(5,10, myLambda)
    addNumber(15, 20)
}
