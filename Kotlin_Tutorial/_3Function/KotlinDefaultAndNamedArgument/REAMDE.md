
## Kotlin Default and Named Argument

### Kotlin Default Argument

passing no argument in function call
```kotlin
fun main(args: Array<String>) {  
    run()  
}  
fun run(num:Int= 5, latter: Char ='x'){  
    print("parameter in function definition $num and $latter")  
}  
```

passing some argument in function call
```kotlin
fun main(args: Array<String>) {  
    run(3)  
}  
fun run(num:Int= 5, latter: Char ='x'){  
    print("parameter in function definition $num and $latter")  
}  
```












