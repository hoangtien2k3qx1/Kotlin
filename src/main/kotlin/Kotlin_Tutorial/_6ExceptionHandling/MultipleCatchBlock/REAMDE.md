
## Kotlin Multiple catch Block
We can use multiple catch block in our code. Kotlin multiple catch blocks are used when we are using different types of operation in try block which may causes different exceptions in try block.

Example:
```kotlin
 fun main(args: Array<String>){  
    try {  
        val a = IntArray(5)  
        a[5] = 10 / 0  
    } catch (e: ArithmeticException) {  
        println("arithmetic exception catch")  
    } catch (e: ArrayIndexOutOfBoundsException) {  
        println("array index outofbounds exception")  
    } catch (e: Exception) {  
        println("parent exception class")  
    }  
    println("code after try catch...")  
}  
```








