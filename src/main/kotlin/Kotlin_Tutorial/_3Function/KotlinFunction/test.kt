package _3Function.KotlinFunction

fun main(args: Array<String>){
    val result = sum(5, 6)
    print(result)
}

fun sum(number1: Int, number2:Int): Int{
    val add = number1 + number2
    return add
}