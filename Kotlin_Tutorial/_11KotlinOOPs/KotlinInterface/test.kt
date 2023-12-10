package _11KotlinOOPs.KotlinInterface

interface MyInterface  {
    var id: Int            // abstract property
    fun absMethod():String    // abstract method
    fun doSomthing() {
        println("MyInterface doing some work")
    }
}

class InterfaceImp : MyInterface {
    override var id: Int = 101
    override fun absMethod(): String{
        return "Implementing abstract method.."
    }
}

fun main(args: Array<String>) {
    val obj = InterfaceImp()
    println("Calling overriding id value = ${obj.id}")
    obj.doSomthing()
    println(obj.absMethod())
}