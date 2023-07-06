
## Kotlin Utility Functions

- rangeTo()
- downTo()
- reversed()
- step()

## Kotlin rangeTo()
- The  rangeTo() function is used to return the value from start to end in increasing order mentioned in a range. 
- The rangeTo() function is integral types which calls the constructors of Range class.

```kotlin
fun main(args: Array<String>) {
    var range: IntRange = 1.rangeTo(5)
    println("Printing value: 1.rangeTo(5)")
    for (x in range){
        print("$x ") // 1 2 3 4 5
    }
    println("")
    var range2: IntRange = IntRange(1,5)
    println("Printing value: IntRange(1,5)")
    for (x in range2){
        print("$x ") // 1 2 3 4 5 
    }
}
```

## Kotlin downTo()

Syntax:
```kotlin
fun Long.downTo(other: Int): LongProgression {  
    return LongProgression.fromClosedRange(this, other.toLong(), -1L)  
}  
  
fun Byte.downTo(other: Int): IntProgression {  
    return IntProgression.fromClosedRange(this.toInt(), other, -1)  
}  
```

Example:
```kotlin
fun main(args: Array<String>) {

    println("Range 1")
    var range1 = 5 downTo 1
    for (x in range1){
        print("$x ") // 5 4 3 2 1
    }

    println()

    println("Range 2")
    var range2: IntProgression = 5.downTo(1)
    for (x in range2){
        print("$x ") // 5 4 3 2 1
    }

    println()

    println("Range 3")
    var range3: IntProgression = IntProgression.fromClosedRange(5,1,-1)
    for (x in range3){
        print("$x ") // 5 4 3 2 1
    }

}
```

## Kotlin reversed()
- The reversed() function is used to return the reversed order of the given range type.

Syntax:
```kotlin
fun IntProgression.reversed(): IntProgression {  
    return IntProgression.fromClosedRange(last, first, -step)  
}  
```

Example:
```kotlin
fun main(args: Array<String>) {
    println("Reversed 1")
    var range1 = 1..5
    for (x in range1.reversed()){
        print("$x ") // 5 4 3 2 1
    }
    println()
    println("Reversed 2")
    var range2: IntRange = IntRange(1,5)
    for (x in range2.reversed()){
        print("$x ") // 5 4 3 2 1
    }
    println()
    println("Reversed 3")
    var range3 = IntProgression.fromClosedRange(5,1,-1)
    for (x in range3.reversed()){
        print("$x ") // 1 2 3 4 5
    }
    println()
    println("Reversed 4")
    var range4: IntProgression = IntProgression.fromClosedRange(5,1,-2)
    for (x in range4.reversed()){
        print("$x ") // 1 3 5
    }
}
```

## Kotlin step()
```kotlin
fun main(args: Array<String>) {
    val range: IntRange = 1..10
    println("Print range value with step 2:")
    for(x in range step (2)){
        print("$x ") // 1 3 5 7 9
    }
    println("")
    println("Print range value with step 3:")
    for(x in range step 3){
        print("$x ") // 1 4 7 10
    }
    val first=((range step 2).first)
    val last=((range step 2).last)
    println("")
    println("First value of interval: $first") // 1
    println("Last value of interval: $last ") // 9
} 
```



