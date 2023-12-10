
## Kotlin Standard Input/Output

### [Kotlin Output]()
Kotlin output operation is performed using the standard methods `print()` and `println()`.
```kotlin
fun main(args: Array<String>) {  
    println("Hello World!")  
    print("Welcome to  JavaTpoint")  
}  
```

Difference between print() and println() methods:
- `print()`: print() method is used to print values provided inside the method "()".
- `println()`: println() method is used to print values provided inside the method "()" and moves cursor to the beginning of next line.


### [Kotlin Input]()
- Kotlin has standard library function readLine() which is used for reads line of string input from standard input stream. 
- It returns the line read or null.

cách 1:
```kotlin
fun main(args: Array<String>) {  
    println("Enter your name")  
    val name = readLine()  
    println("Enter your age")  
    var age: Int = Integer.valueOf(readLine())  
    println("Your name is $name and your age is $age")  
}  
```

cách 2:
```kotlin
import java.util.Scanner
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    println("Enter your age")
    var age = read.nextInt()
    println("Your input age is "+age)
}  
```











