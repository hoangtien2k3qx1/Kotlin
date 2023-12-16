
## Kotlin Extension Function
- Kotlin extension function provides a facility to "add" methods to class without inheriting a class or using any type of design pattern. 
- The created extension functions are used as a regular function inside that class.

Syntax:
```kotlin
fun <class_name>.<method_name>()  
```

Example:
```kotlin
class Student{  
    fun isPassed(mark: Int): Boolean{  
        return mark>40  
    }  
}  

fun Student.isExcellent(mark: Int): Boolean{  
    return mark > 90  
}  

fun main(args: Array<String>){  
    val student = Student()  
    val passingStatus = student.isPassed(55)  
    println("student passing status is $passingStatus")  
      
    val excellentStatus = student.isExcellent(95)  
    println("student excellent status is $excellentStatus")  
}  
```

Example:
```kotlin
fun MutableList<Int>?.swap(index1: Int, index2: Int): Any {  
    if (this == null) return "null"  
    else  {  
        val tmp = this[index1] // 'this' represents to the list  
        this[index1] = this[index2]  
        this[index2] = tmp  
        return this  
    }  
}  

fun main(args: Array<String>) {  
    val list = mutableListOf(5,10,15)  
    println("before swapping the list :$list")  
    val result = list.swap(0, 2)  
    println("after swapping the list :$result")  
}  
```











