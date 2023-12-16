package _3Function.KotlinRecursionFunction

var count = 0
fun rec(){
    count++;
    if(count<=5){
        println("hello $count");
        rec();
    }
}

fun rec1(){
    count++
    if (count == 5) {
        return
    }
    println("hello $count");
    rec();
}

fun main(args: Array<String>) {
    rec1()
}