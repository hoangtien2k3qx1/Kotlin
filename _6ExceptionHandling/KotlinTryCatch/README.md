
## Kotlin try catch
Kotlin try-catch block is used for exception handling in the code.

Syntax of try with catch block
```kotlin
try {
    // some code  
}
catch (e: SomeException) {
    // handler  
}
finally {
    // optional finally block  
}  
```

## Solution by exception handling
```kotlin
fun main(args: Array<String>){  
    try {  
        val data = 20 / 0  //may throw exception  
    } catch (e: ArithmeticException) {  
        println(e)  
    }  
    println("code below exception...")  
}  
```

## Kotlin try block as an Expression
```kotlin
fun main(args: Array<String>){  
    val str = getNumber("10")  
    println(str)  
}  

fun getNumber(str: String): Int{  
    return try {  
        Integer.parseInt(str)  
    } catch (e: ArithmeticException) {  
        0  
    }  
}  
```

```kotlin
fun main(args: Array<String>){  
    val str = getNumber("10.5")  
    println(str)  
}  
fun getNumber(str: String): Int{  
    return try {  
        Integer.parseInt(str)  
    } catch (e: NumberFormatException) {  
        0  
    }  
}  
```
