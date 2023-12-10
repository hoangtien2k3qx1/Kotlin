
## Kotlin Null Safety
Kotlin null safety is a procedure to eliminate the risk of null reference from the code. Kotlin compiler throws NullPointerException immediately if it found any null argument is passed without executing any other statements.

- An forcefully call to throw NullPointerException();
- An uninitialized of this operator which is available in a constructor passed and used somewhere.
- Use of external java code as Kotlin is Java interoperability.


## Nullable Types
Nullable types are declared by putting a ? behind the String as:
```kotlin
var str1: String? = "hello"  
str1 = null     // ok  
```

## Non Nullable Types
Non nullable types are normal strings which are declared as String types as:
```kotlin
val str: String = null  // compile error  
str = "hello"           // compile error Val cannot be reassign  
var str2: String = "hello"  
str2 = null             // compile error  
```


## Checking for null in conditions
```kotlin
fun main(args: Array<String>){  
    var str: String? = "Hello"     // variable is declared as nullable  
    var len = if(str!=null) str.length else -1  
    println("str is : $str")  
    println("str length is : $len")  
      
    str = null  
    println("str is : $str")  
    len = if(str!=null) str.length else -1  
    println("b length is : $len")  
}  
```






