
## Kotlin Class and Object
- Kotlin supports both object oriented programming (OOP) as well as functional programming. 
- Object oriented programming is based on real time objects and classes. 
- Kotlin also support pillars of OOP language such as encapsulation, inheritance and polymorphism.


## Kotlin Class
- Kotlin class is similar to Java class, a class is a blueprint for the objects which have common properties.
- Kotlin classes are declared using keyword class.
- Kotlin class has a class header which specifies its type parameters, constructor etc.

Syntax of Kotlin class declaration
```kotlin
class className{   // class header  
      // property  
      // member function  
}  
```

if we want to provide a `constructor`, we need to write a constructor keyword followed by class name as:
```kotlin
class className constructor(){   // class header  
      // property  
      // member function  
}  
```

=> Example:
```kotlin
class account {  
    var acc_no: Int = 0  
    var name: String? = null  
    var amount: Float = 0f  
  
    fun deposit() {  
        //deposite code  
    }  
  
    fun withdraw() {  
       // withdraw code  
    }  
  
    fun checkBalance() {  
        //balance check code  
    }
}  
```

## Kotlin Object
- state: it represents value of an object.
- behavior: it represent the functionality of an object.

## Create an object
```kotlin
var obj1 = className()  
var obj2 = className()  
```

## Access class property and member function
```kotlin
class Account {  
    var acc_no: Int = 0  
    var name: String =  ""  
    var amount: Float = 0.toFloat()  
    fun insert(ac: Int,n: String, am: Float ) {  
        acc_no = ac  
        name = n  
        amount = am  
        println("Account no: ${acc_no} holder :${name} amount :${amount}")  
    }  
  
    fun deposit() {  
        //deposite code  
    }  
  
    fun withdraw() {  
       // withdraw code  
    }  
  
    fun checkBalance() {  
        //balance check code  
     }
}  

fun main(args: Array<String>){  
    Account()  
    var acc = Account()  
    acc.insert(832345, "Ankit", 1000f) //accessing member function  
    println("${acc.name}") //accessing class property  
}  
```




