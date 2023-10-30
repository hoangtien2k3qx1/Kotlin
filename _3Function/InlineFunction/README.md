
## Inline Function
- Declaration of local classes
- Declaration of inner nested classes
- Function expressions
- Declarations of local function
- Default value for optional parameters

Example:
```kotlin
fun main(args: Array<String>) {  
    inlineFunction({ println("calling inline functions")})  
}  
  
inline fun inlineFunction(myFun: () -> Unit) {  
    myFun()  
    print("code inside inline function")  
}  
```

## Non local control flow
```kotlin
fun main(args: Array<String>) {  
inlineFunction({ println("calling inline functions")  
        return},{ println("next parameter in inline functions")})  
}  
  
inline fun inlineFunction(myFun: () -> Unit, nxtFun: () -> Unit) {  
myFun()  
nxtFun()  
    print("code inside inline function")  
}  
```

## crossinline annotation
```kotlin
fun main(args: Array<String>) {  
inlineFunction({ println("calling inline functions")  
        return // compile time error  
},{ println("next parameter in inline functions")})  
}  
  
inline fun inlineFunction(crossline myFun: () -> Unit, nxtFun: () -> Unit) {  
myFun()  
nxtFun()  
    print("code inside inline function")  
}  
```

## noinline modifier
```kotlin
fun main(args: Array<String>) {  
    inlineFunctionExample({  println("calling inline functions")},  
                {  println("next parameter in inline functions")} )  
      
    println("this is main function closing")  
}  
  
inline fun inlineFunctionExample(myFun: () -> Unit, noinline nxtFun: () -> Unit  ) {  
    myFun()  
    nxtFun()  
    println("code inside inline function")  
}  
```
