package _11KotlinOOPs.KotlinConstructor

class myClass5{

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
    val myclass = myClass5("Ashu", 101)

}