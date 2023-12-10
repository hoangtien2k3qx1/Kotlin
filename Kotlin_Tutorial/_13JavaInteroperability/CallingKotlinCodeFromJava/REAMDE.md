
## Calling Kotlin code from Java code

Example:

#### `MyKotlin.kt`
```kotlin
fun main(args: Array<String>){  
    //code  
}  

fun area(l: Int, b: Int):Int{  
    return l * b  
}  
```

#### ``MyJava.java
```Java
public class MyJava {  
    public static void main(String[] args) {  
        int area = MyKotlinKt.area(4,5);  
        System.out.print("printing area inside Java class returning from Kotlin file: "+area);  
    }  
}  
```
























