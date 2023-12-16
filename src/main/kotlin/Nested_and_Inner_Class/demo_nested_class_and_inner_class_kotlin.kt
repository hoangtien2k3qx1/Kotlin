package Nested_and_Inner_Class

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 17:32
 * @file: demo_nested_class_and_inner_class_kotlin.kt
 * @update: 13/12/2023
 * @description:
 */

/**
 * @note: nested class
 * @note: inner class
 * @note: Anonymous inner classes
 *
 *
 *  class Outer {
 *     private val bar: Int = 1
 *     class Nested {
 *         fun foo() = 2
 *     }
 * }
 *
 * val demo = Outer.Nested().foo() // == 2
 */


// Inner classes
class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo(): Int = 2
    }
}


///////////////////////////////////////////////////////////////

interface OuterInterface {
    class InnerClass
    interface InnerInterface
}

class OuterClass {
    class InnerClass
    interface InnerInterface
}


// Anonymous inner classes with Object Expressions
interface MyInterface {
    fun myMethod()
}



fun main() {

    val demo: Int = Outer.Nested().foo() // == 2
    println(demo)


    //////// Object Expressions
    val myInterface: MyInterface = object : MyInterface {
        override fun myMethod() {
            println("This is a lambda expression in Kotlin.")
        }
    }
    myInterface.myMethod()

}

