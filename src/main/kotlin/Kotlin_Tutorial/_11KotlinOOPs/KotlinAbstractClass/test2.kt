package _11KotlinOOPs.KotlinAbstractClass

open class MyParentClass {
    open fun myMethod() {
        println("This is a method in the parent class.")
    }
}

class MyChildClass : MyParentClass() {
    override fun myMethod() {
        println("This is a method in the child class.")
    }
}

fun main() {
    val obj = MyChildClass()
    obj.myMethod()
}