
## Kotlin do-while Loop
The do-while loop is similar to while loop except one key difference. A do-while loop first execute the body of do block after that it check the condition of while.

Syntax:
```kotlin
do{  
//body of do block  
}  
while(condition);  
```

Example:
```kotlin
fun main(args: Array<String>) {
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 5);
}
```



