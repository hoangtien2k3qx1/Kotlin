
## Kotlin for Loop
Kotlin for loop is equivalent to the foreach loop in languages like C#.

syntax:
```kotlin
for (item in collection){  
    //body of loop  
}  
```

Iterate through array
```kotlin
fun main(args : Array<String>) {  
    val marks = arrayOf(80,85,60,90,70)  
    for(item in marks){  
        println(item)  
    }  
} 
```

## Iterate through range
Let's see an example of iterating the elements of range
```kotlin
fun main(args : Array<String>) {  
  
    print("for (i in 1..5) print(i) = ")  
    for (i in 1..5) print(i)  
    println()  
    print("for (i in 5..1) print(i) = ")  
    for (i in 5..1) print(i)             // prints nothing  
    println()  
    print("for (i in 5 downTo 1) print(i) = ")  
    for (i in 5 downTo 1) print(i)  
    println()  
    print("for (i in 5 downTo 2) print(i) = ")  
    for (i in 5 downTo 2) print(i)  
    println()  
    print("for (i in 1..5 step 2) print(i) = ")  
    for (i in 1..5 step 2) print(i)  
    println()  
    print("for (i in 5 downTo 1 step 2) print(i) = ")  
    for (i in 5 downTo 1 step 2) print(i)  
}  
```

















