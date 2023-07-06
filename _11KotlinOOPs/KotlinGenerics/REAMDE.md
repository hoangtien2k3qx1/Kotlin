
## Kotlin Generics

Syntax of generic class:
```kotlin
class_or_interface<Type>  
```

Syntax of generic method
```kotlin
<Type>methodName(parameter: classType<Type>)  
```

Advantage of Generics

- `Type-safety`: Generic allows to hold only single type of object. Generic does not allow to store other object.
- `Type casting is not required`: There is no need to typecast the object.
- `Compile time checking`: Generics code is checked at compile time so that it can avoid any problems at runtime.


#### Nếu không có Generics
```kotlin
class Person (age:Int){  
    var age: Int = age  
    init {  
        this.age= age  
        println(age)  
    }  
}  
    fun main(args: Array<String>){  
    var ageInt: Person = Person(30)  
    var ageString: Person = Person("30")// compile time error  
}  
```


#### Khi có Generics
```kotlin
class Person<T>(age: T){  
    var age: T = age  
    init {  
        this.age= age  
        println(age)  
    }  
}  

fun main(args: Array<String>){  
    var ageInt: Person<Int> = Person<Int>(30)  
    var ageString: Person<String> = Person<String>("40")  
}  
```


Example:
```kotlin
fun main(args: Array<String>){  
    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")  
    val s: String = stringList[0]  
    println("printing the string value of stringList: $s")  
    printValue(stringList)  
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)  
    printValue(floatList)     
}  
fun <T>printValue(list: ArrayList<T>){  
    for(element in list){  
        println(element)  
    }  
}  
```


## Kotlin generic extension function example
```kotlin
fun main(args: Array<String>){  
    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")  
    stringList.printValue()  
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)  
    floatList.printValue()  
}  

fun <T>ArrayList<T>.printValue(){  
    for(element in this){  
        println(element)  
    }  
}  
```




