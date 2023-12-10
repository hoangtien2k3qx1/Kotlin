
## Kotlin Function
Function is a group of inter related block of code which performs a specific task.
- Standard library function
- User defined function

## Standard Library Function
Kotlin Standard library function is built-in library functions which are implicitly present in library and available for use.

Example:
```kotlin
fun main(args: Array<String>){  
    var number = 25  
    var result = Math.sqrt(number.toDouble())  
    print("Square root of $number is $result")  
}  
```

## User defined Function
- User defined function is a function which is created by user. 
- User defined function takes the parameter(s), perform an action and return the result of that action as a value.

Syntax:
```kotlin
fun functionName(){  
    // body of function  
}  
```

Example:
```kotlin
fun main(args: Array<String>){  
    sum()  
    print("code after sum")  
}  

fun sum(){  
    var num1 = 5  
    var num2 = 6  
    println("sum = "+(num1+num2))  
}

fun sum_return(): Int {
    var num1 = 5
    var num2 = 6
    return (num1 + num2)
}  
```

## Kotlin Parameterize Function and Return Value
```kotlin
fun main(args: Array<String>){  
   val result = sum(5, 6)  
    print(result)  
}  

fun sum(number1: Int, number2:Int): Int {  
    val add = number1 + number2  
    return add  
}  
```



