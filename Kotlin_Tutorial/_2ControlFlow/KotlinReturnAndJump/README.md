
## Kotlin Return and Jump
There are three jump expressions in Kotlin.
- break
- continue
- return

## Break Expression
A break expression is used for terminate the nearest enclosing loop. It is almost used with if-else condition.

Syntax:
```kotlin
for(..){  
       //body of for  
       if(checkCondition){  
           break;  
       }  
}  
```

Example:
```kotlin
fun main(args: Array<String>) {  
    for (i in 1..5) {  
        if (i == 3) {  
            break  
        }  
        println(i)  
    }  
}  
```

## Kotlin Labeled break Expression
Kotlin labeled break expression is used to terminate the specific loop. This is done by using break expression with @ sign followed by label name (break@loop).

Kotlin labeled break example
```kotlin
fun main(args: Array<String>) {  
    loop@ for (i in 1..3) {  
        for (j in 1..3) {  
            println("i = $i and j = $j")  
            if (i == 2)  
                break@loop  
        }  
    }  
}  
```



