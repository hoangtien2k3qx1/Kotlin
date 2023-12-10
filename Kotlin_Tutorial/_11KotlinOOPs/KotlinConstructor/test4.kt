package _11KotlinOOPs.KotlinConstructor

class myClass4(password: String){
    constructor(name: String, id: Int, password: String): this(password){
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${password}")
    }
}

fun main(args: Array<String>){
    val myclass = myClass4("Ashu", 101, "mypassword")
}