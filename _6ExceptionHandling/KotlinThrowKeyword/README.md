
## Kotlin throw keyword
Kotlin throw keyword is used to throw an explicit exception. It is used to throw a custom exception.

Syntax of throw keyword: `throw SomeException()`

Example:
```kotlin
fun main(args: Array<String>) {  
    validate(15)  
    println("code after validation check...")  
} 

fun validate(age: Int) {  
    if (age < 18)  
        throw ArithmeticException("under age")  
    else  
        println("eligible for drive")  
}  
```











