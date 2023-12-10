package _11KotlinOOPs.KotlinConstructor

class myClass3{

    constructor(name: String, id: Int){
        println("Name = ${name}")
        println("Id = ${id}")
    }
}

fun main(args: Array<String>){
    val myclass = myClass3("Ashu", 101)

}