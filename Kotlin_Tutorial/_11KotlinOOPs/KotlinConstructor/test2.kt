package _11KotlinOOPs.KotlinConstructor

import java.util.*

class myClass2(name: String, id: Int) {
    val e_name: String
    var e_id: Int
    init{
        e_name = name.capitalize()
        e_id = id

        println("Name = ${e_name}")
        println("Id = ${e_id}")
        // Name = Ashu
        // Id = 101
    }
}
fun main(args: Array<String>){
    val myclass = myClass2("Ashu", 101)
}