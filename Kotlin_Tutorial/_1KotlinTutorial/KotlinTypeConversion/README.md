
## Kotlin Type Conversion

## In Java
```java
int value1 = 10;  
long value2 = value1;  // Valid code   
```

## In Kotlin
```kotlin
var value1 = 10  
val value2: Long = value1  //Compile error, type mismatch 
```

However in Kotlin, conversion is done by explicit in which smaller data type is converted into larger data type and vice-versa. 
```kotlin
var value1 = 10  
val value2: Long = value1.toLong()  
```

The list of helper functions used for numeric conversion in Kotlin is given below:
- toByte()
- toShort()
- toInt()
- toLong()
- toFloat()
- toDouble()
- toChar()

Example:
```kotlin
fun main(args : Array<String>) {  
    var value1 = 100  
    val value2: Long = value1.toLong()  
    println(value2)  
}  
```

```kotlin
fun main(args : Array<String>) {  
    var value1: Long = 200  
    val value2: Int =value1.toInt()  
    println(value2)  
}  
```


