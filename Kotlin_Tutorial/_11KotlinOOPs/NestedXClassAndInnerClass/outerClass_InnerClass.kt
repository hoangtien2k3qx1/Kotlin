package _11KotlinOOPs.NestedXClassAndInnerClass

class outerClass_InnerClass {
    private var name: String = "Ashu"
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

    println(outerClass_InnerClass().innerClass().description) // accessing property

    var obj = outerClass_InnerClass().innerClass() // object creation

    obj.foo() // access member function

   
}