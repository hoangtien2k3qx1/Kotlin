
## Kotlin Reflection

- Reflection is a set of language and library features that examines the structure of program at runtime.

#### Class Reference

Syntax of class reference:
```kotlin
val c1 = String::class  
val c2 = MyClass::class 
```

### Functional Reference
```kotlin
fun isPositive(x: Int) = x > 0  
val number = listOf(-10,-5,0,5,10)  
print(number.filter(::isPositive))  
```

Kotlin functional reference example
```kotlin
fun main(args: Array<String>) {
    fun isPositive(x: Int) = x > 0
    val numbers = listOf(-10, -5, 0, 5, 10)
    println(numbers.filter(::isPositive))
}  

Kết quả: [5,10]
```

## Overloaded function reference operator (::)
- The operator :: can be used with overload function when the expected type is known from the context.

```kotlin
fun main(args: Array<String>) {  
    fun isPositive(x: Int) = x > 0  
    fun isPositive(s: String) = s == "kotlin" || s == "Kotlin"  
  
    val numbers = listOf(-10,-5,0,5,10)  
    val strings = listOf("kotlin", "program")  
      
    println(numbers.filter(::isPositive))  
    println(strings.filter(::isPositive))  
}  

Kết quả:
[5, 10]
[kotlin]
```


## Property Reference
- We can also access the properties as first-class object in Kotlin, to access object property we can use :: operator:

```kotlin
fun main(args: Array<String>) {  
    println(::x.get())  
    println(::x.name)  
    println(::y.set(10))  
}  
val x = 5  
var y = 5 

Kết quả:
5
x
10
```


## Access the property of member class:
```kotlin
class A(val x: Int)  
    fun main(args: Array<String>) {
        val prop = A::x
        println(prop.get(A(5)))
    }
}   

Kết quả: 5
```







