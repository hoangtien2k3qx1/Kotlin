
## Kotlin Inheritance
- Inheritance is an important feature of object oriented programming language.
- Inheritance allows to inherit the feature of existing class (or base or parent class) to new class (or derived class or child class).

```kotlin
open class Base(p: Int){  
  
}  
class Derived(p: Int) : Base(p){  
  
}  
```

Example:
```kotlin
open class Employee(name: String, age: Int, salary: Float) {  
    // code of employee  
}  
  
class Programmer(name: String, age: Int, salary: Float): Employee(name,age,salary) {  
    // code of programmer  
}  
  
class Salesman(name: String, age: Int, salary: Float): Employee(name,age,salary) {  
    // code of salesman  
}  
```


## Kotlin open keyword
- Khi một lớp được đánh dấu là `open`, bất kỳ lớp con nào cũng có thể kế thừa nó và mở rộng tính năng hoặc thay đổi hành vi của lớp gốc (lớp được kế thừa).
```kotlin
open class Example{  
    // I can now be extended!  
}  
```

## Kotlin Inheriting fields from a class
```kotlin
open class Base{  
    val x = 10  
}  

class Derived: Base() {  
    fun foo() {  
        println("x is equal to " + x)  
    }  
}  

fun main(args: Array<String>) {  
    val derived = Derived()  
    derived.foo()   
}  
```

## Kotlin Inheriting methods from a class
```kotlin
open class Bird {  
    fun fly() {  
        println("flying...")  
    }  
}  

class Duck: Bird() {  
    fun swim() {  
        println("swimming...")  
    }  
}  

fun main(args: Array<String>) {  
    val duck = Duck()  
    duck.fly()   
    duck.swim()  
}  
```

## Kotlin Inheritance and secondary constructor
```kotlin
open class Patent {  
  
    constructor(name: String, id: Int) {  
        println("execute super constructor $name: $id")  
    }  
}  
  
class Child: Patent {  
  
    constructor(name: String, id: Int, dept: String): super(name, id) {  
        print("execute child class constructor with property $name, $id, $dept")  
    }  
}  
fun main(args: Array<String>) {  
    val child = Child("Ashu",101, "Developer")  
}  
```








