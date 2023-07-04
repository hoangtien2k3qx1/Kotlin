
## Smart cast
We have seen in previous tutorial Kotlin Nullable Types and Non-Nullable Types how nullable type is declared.


When we try to access a nullable type of String without safe cast it will generate a compile error.
```kotlin
    var string: String? = "Hello!"  
    print(string.length) // Compile error  
```

To solve the above expression we use a safe cast as:
```kotlin

import kotlin.reflect.typeOffun

main(args: Array< String >){
    var string: String? = null
    var str: String = string ?: ""
    val a = if (string == "") {
        ""
    }

    var value = 123.4
    var value1: String = "tien"
    val strBuilder = StringBuilder().append("tien")
    print(typeOf(value))

    if (string != null) { // smart cast
        println(string.length) // It works now!
    }

    println(string?.length ?: 0) // sử dụng toán tử "elvis" (`?:`)
    print(string?.length)        // sử dụng toán tử an toàn (`?.`)
}
```

## Use of is for smart cast
```kotlin
fun main(args: Array<String>){  
    
    // Any tương tự như Object trong Java
    val obj: Any = "The variable obj is automatically cast to a String in this scope"  
    if(obj is String) {  
        // No Explicit Casting needed.  
        println("String length is ${obj.length}")  
    }  
}  
```

## Use of !is for smart cast
```kotlin
fun main(args: Array<String>){  
    val obj: Any = "The variable obj is automatically cast to a String in this scope"  
    if(obj !is String) {  
        println("obj is not string")
    } else  
        // No Explicit Casting needed.  
        println("String length is ${obj.length}")  
}  
```





