package _2ControlFlow.KotlinIfExpression

fun main(args: Array<String>) {
    val num1 = 25
    val num2 = 20
    val num3 = 30
    val result = if (num1 > num2){

        val max = if(num1 > num3){
            num1
        }else{
            num3
        }
        "body of if $max"
    }else if(num2 > num3){
        "body of else if$num2"
    }else{
        "body of else $num3"
    }
    println("$result")
}