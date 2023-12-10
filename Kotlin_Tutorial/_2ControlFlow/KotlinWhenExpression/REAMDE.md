
## Kotlin when Expression
Kotlin, when expression works as a `switch - case` statement of other language (Java, C++, C).

## Using when as an Expression
```kotlin
fun main(args: Array<String>){  
    var number = 4  
    var numberProvided = when(number) {  
        1 -> "One"  
        2 -> "Two"  
        3 -> "Three"  
        4 -> "Four"  
        5 -> "Five"  
        else 
            -> "invalid number"  
    }  
    println("You provide $numberProvided")  
}  
```

## Using when Without Expression
```kotlin
fun main(args: Array<String>){
    var number = 4  
    when(number) {  
        1 -> println("One")  
        2 -> println("Two")  
        3 -> println("Three")  
        4 -> println("Four")  
        5 -> println("Five")  
        else -> println("invalid number")  
    }
}  
```

## Multiple Statement of when Using Braces
We can use multiple statement enclosed within block of condition.
```kotlin
fun main(args: Array<String>){  
    var number = 1  
    when(number) {  
        1 -> {  
            println("Monday")  
            println("First day of the week")  
        }  
        7 -> println("Sunday")  
        else -> println("Other days")  
    }  
}  
```

## Multiple branches of when
We can use multiple branches of condition separated with a comma.
```kotlin
fun main(args: Array<String>){  
    var number = 8  
    when(number) {  
        3, 4, 5, 6 ->  
            println("It is summer season")  
        7, 8, 9 ->  
            println("It is rainy season")  
        10, 11 ->  
            println("It is autumn season")  
        12, 1, 2 ->  
            println("It is winter season")  
        else -> println("invalid input")  
    }  
}  
```

## Using when in the range
```kotlin
fun main(args: Array<String>){  
    var number = 7  
    when(number) {  
        in 1..5 -> println("Input is provided in the range 1 to 5")  
        in 6..10 -> println("Input is provided in the range 6 to 10")  
        else -> println("none of the above")  
    }  
}  
```


