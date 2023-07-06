
## Kotlin Constructor
- In Kotlin, constructor is a block of code similar to method.
- Constructor is declared with the same name as the class followed by parenthesis '()'. 
- Constructor is used to initialize the variables at the time of object creation.

## Types of Kotlin constructors
There are two types of constructors in Kotlin:
1. `Primary constructor`
2. `Secondary constructor`

`Note`: There is `only one primary constructor` in a Kotlin class whereas `secondary constructor` may be `one` or `more`.

## Kotlin primary constructor
- Primary constructor is used to initialize the class.
-  It is declared at class header.
- Primary constructor code is surrounded by parentheses with optional parameter `'()'`.

Syntax:
```kotlin
class myClass(valname: String,varid: Int) {  
    // class body  
}  
```

Example:
```kotlin
class myClass(val name: String, var id: Int) {  
}  

fun main(args: Array<String>){  
    val myclass = myClass ("Ashu", 101)  
      
    println("Name = ${ myclass.name}")  
    println("Id = ${ myclass.id}")  
}  
```

## Primary constructor with initializer block
- The primary constructor does not contain any code. 
- Initializer blocks are used to initialization of code.
- This block is prefixed with init keyword. 

```kotlin
class myClass(name: String, id: Int) {  
    val e_name: String  
    var e_id: Int  
    
    init{  
        e_name = name.capitalize()  
        e_id = id  
          
        println("Name = ${e_name}")  
        println("Id = ${e_id}")  
    }  
}  

fun main(args: Array<String>){  
    val myclass = myClass ("Ashu", 101)  
  
}  
```


## Kotlin secondary constructor
- In Kotlin, secondary constructor can be created one or more in class.
- The secondary constructor is created using "constructor" keyword.

```kotlin
class myClass{  
  
    constructor(id: Int){  
        //code   
    }  
    constructor(name: String, id: Int){  
        //code   
    }  
}  
```

Example:
```kotlin
class myClass{
    constructor(name: String, id: Int){
        println("Name = ${name}")
        println("Id = ${id}")
    }
}

fun main(args: Array<String>){
    val myclass = myClass ("Ashu", 101)

}
```

Example:
```kotlin
class myClass(password: String){
    constructor(name: String, id: Int, password: String): this(password){  
        println("Name = ${name}")  
        println("Id = ${id}")  
        println("Password = ${password}")  
    }  
}  
fun main(args: Array<String>){  
    val myclass = myClass ("Ashu", 101, "mypassword")
}  
```


## Calling one secondary constructor from another secondary constructor of same class
- In Kotlin, one secondary constructor can call another secondary constructor of same class. This is done by using this() keyword.

Example:
```kotlin
class myClass{
    constructor(name: String, id: Int): this(name,id, "mypassword"){  
        println("this executes next")  
        println("Name = ${name}")  
        println("Id = ${id}")  
    }  
  
    constructor(name: String, id: Int,pass: String){  
        println("this executes first")  
        println("Name = ${name}")  
        println("Id = ${id}")  
        println("Password = ${pass}")  
    }  
}  

fun main(args: Array<String>){  
    val myclass = myClass ("Ashu", 101)
}  
```













