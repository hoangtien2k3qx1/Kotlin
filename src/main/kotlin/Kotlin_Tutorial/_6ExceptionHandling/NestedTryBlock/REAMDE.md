
## Kotlin Nested try-catch block
We can also able to use nested try block whenever required. Nested try catch block is such block in which one try catch block is implemented into another try block.

Syntax of nested try block:
```kotlin
try {
    // code block   
    try {
        // code block   
    } catch (e: SomeException) {
    }
} catch (e: SomeException) {
}    
```

Example:
```kotlin
fun main(args: Array<String>) {  
    val nume = intArrayOf(4, 8, 16, 32, 64, 128, 256, 512)  
    val deno = intArrayOf(2, 0, 4, 4, 0, 8)  
    try {  
        for (i in nume.indices) {  
            try {  
                println(nume[i].toString() + " / " + deno[i] + " is " + nume[i] / deno[i])  
            } catch (exc: ArithmeticException) {  
                println("Can't divided by Zero!")  
            }  
  
        }  
    } catch (exc: ArrayIndexOutOfBoundsException) {  
        println("Element not found.")  
    }  
}  
```




