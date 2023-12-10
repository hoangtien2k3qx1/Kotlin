
## Kotlin if Expression
if is an expression is which returns a value. It is used for control the flow of program structure.
- if-else expression
- if-else if-else ladder expression
- nested if expression

## Traditional if Statement
```kotlin
if(condation){  
    //code statement  
}  
else{  
    //code statement  
}  
```

## Kotlin if-else Expression
As if is an expression it is not used as standalone, it is used with if-else expression and the result of an if-else expression is assign into a variable.
```kotlin
val returnValue = if (condation) {  
        //code statement  
    } else {  
        // code statement  
    }  
    println(returnValue)  
```

Example:
```kotlin
fun main(args: Array<String>) {  
        val num1 = 10  
        val num2 =20  
        val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"  
        println(result)  
}  
```

## Kotlin if-else if-else Ladder Expression
```kotlin
fun main(args: Array<String>) {  
    val num = 10  
    val result = if (num > 0){  
        "$num is positive"  
    }else if(num < 0){  
        "$num is negative"  
    }else{  
        "$num is zero"  
    }  
    println(result)  
}  
```

## Kotlin Nested if Expression
```kotlin
fun main(args: Array<String>) {  
    val num1 = 25  
    val num2 = 20  
    val num3 = 30  
    val result = if (num1 > num2){  
  
        val max = if(num1 > num3){  
            num1  
        }else{  
            num3  
        }  
        "body of if "+max  
    }else if(num2 > num3){  
        "body of else if"+num2  
    }else{  
        "body of else "+num3  
    }  
    println("$result")  
}  
```




