
## Kotlin Nested class and Inner class

## Kotlin Nested class:
- Nested class is such class which is created inside another class.
- In Kotlin, nested class is by default `static`, so its data member and member function can be accessed without creating an object of class. 
- Nested class cannot be able to access the data member of outer class.

```kotlin
class outerClass{  
   //outer class code  
    class nestedClass{  
      //nested class code  
    }  
}  
```

Kotlin Nested Class Example
```kotlin
class outerClass{  
    private var name: String = "Ashu"  
    class nestedClass{  
    var description: String = "code inside nested class"  
        private var id: Int = 101  
        fun foo(){  
            //  print("name is ${name}") // cannot access the outer class member  
            println("Id is ${id}")  
        }  
    }  
}  

fun main(args: Array<String>){  
    // nested class must be initialize  
    println(outerClass.nestedClass().description) // accessing property  
    var obj = outerClass.nestedClass() // object creation  
    obj.foo() // access member function  
}  
```


## Kotlin Inner class:
- Inner class is a class which is created inside another class with keyword inner. 
- In other words, we can say that a nested class which is marked as "inner" is called inner class.

Inner class `cannot be declared` `inside interfaces` or `non-inner nested` classes.
```kotlin
class outerClass{  
    //outer class code  
    inner class innerClass{  
        //nested class code  
    }  
}  
```

Kotlin Inner Class Example
```kotlin
class outerClass{  
     private  var name: String = "Ashu"  
     inner class  innerClass{ 
         var description: String = "code inside inner class"  
         private var id: Int = 101  
         fun foo(){  
             println("name is ${name}") // access the outer class member even private  
             println("Id is ${id}")  
         }  
     }  
}  

fun main(args: Array<String>){  
    println(outerClass().innerClass().description) // accessing property  
    var obj = outerClass().innerClass() // object creation  
    obj.foo() // access member function
}  
```








