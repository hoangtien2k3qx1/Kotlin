
## Kotlin `continue` Jump Structure
The continue statement within a nested loop only affects the inner loop.

Example:
```kotlin
fun main(args: Array<String>) {
    for (i in 1..3) {
        println("i = $i")
        if (j == 2) {
            continue
        }
        println("this is below if")
    }
}  
```

## Kotlin Labeled continue Expression

Kotlin labeled continue example
```kotlin
fun main(args: Array<String>) {  
    labelname@ for (i in 1..3) {  
    for (j in 1..3) {  
        println("i = $i and j = $j")  
        if (i == 2) {  
            continue@labelname  
        }  
        println("this is below if")  
    }  
 }  
}  
```












