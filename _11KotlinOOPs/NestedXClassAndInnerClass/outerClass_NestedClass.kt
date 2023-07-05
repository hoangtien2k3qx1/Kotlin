package _11KotlinOOPs.NestedXClassAndInnerClass

class outerClass_NestedClass{
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
    println(outerClass_NestedClass.nestedClass().description) // accessing property

    var obj = outerClass_NestedClass.nestedClass() // object creation

    obj.foo() // access member function



}