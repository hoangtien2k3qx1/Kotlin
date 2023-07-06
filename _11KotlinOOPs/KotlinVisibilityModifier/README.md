
## Kotlin Visibility Modifier
In Kotlin, visibility modifiers are categorized into four different types:

= public
- protected
- internal
- private 


## `public` modifier
```kotlin
public class Example{  
}  
class Demo{  
}  
public fun hello()  
fun demo()  
public val x = 5  
val y = 10  
```

## `protected` modifier
```kotlin
open class Base{  
    protected val i = 0  
}  
  
class Derived : Base(){  
  
    fun getValue() : Int  
    {  
        return i  
    }  
}  
```

## Overriding of `protected` types
```kotlin
open class Base{  
  open protected val i = 5  
}  
class Another : Base(){  
    fun getValue() : Int  
    {  
        return i  
    }  
    override val i =10  
}  
```

## internal modifier
```kotlin
internal class Example{  
    internal val x = 5  
    internal fun getValue(){  
  
    }  
}  
internal val y = 10  
```

## private modifier
```kotlin
private class Example {  
    private val x = 1  
    private valdoSomething() {  
    }  
}
```

#### Example of Visibility Modifier
```kotlin
open class Base() {  
var a = 1 // public by default  
    private var b = 2 // private to Base class  
    protected open val c = 3  // visible to the Base and the Derived class  
    internal val d = 4 // visible inside the same module  
    protected fun e() { } // visible to the Base and the Derived class  
}  
  
class Derived: Base() {  
    // a, c, d, and e() of the Base class are visible  
    // b is not visible  
    override val c = 9 // c is protected  
}  
  
fun main(args: Array<String>) {  
    val base = Base()  
    // base.a and base.d are visible  
    // base.b, base.c and base.e() are not visible  
    val derived = Derived()  
    // derived.c is not visible  
}  
```







