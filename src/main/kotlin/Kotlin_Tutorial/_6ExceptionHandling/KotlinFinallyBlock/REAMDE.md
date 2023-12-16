
## Kotlin finally Block
Kotlin finally block such block which is always executes whether exception is handled or not. So it is used to execute important code statement.

Example:
```kotlin
fun main (args: Array<String>){  
    try {  
        val data = 10 / 5  
        println(data)  
    } catch (e: NullPointerException) {  
        println(e)  
    } finally {  
        println("finally block always executes")  
    }  
    println("below codes...")  
}  
```
