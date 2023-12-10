package _3Function.KotlinRecursionFunction


// đệ quy tính n giai thừa
fun main(args: Array<String>) {
    val number = 5
    val result: Long = factorial(number)
    println("Factorial of $number = $result")
}

/*
    factorial(5)
       factorial(4)
          factorial(3)
             factorial(2)
                factorial(1)
                   return 1
                return 2*1 = 2
             return 3*2 = 6
          return 4*6 = 24
       return 5*24 = 120
*/

fun factorial(n: Int): Long {
    return if(n == 0 || n == 1){
        n.toLong()
    } else{
        n * factorial(n - 1)
    }
}