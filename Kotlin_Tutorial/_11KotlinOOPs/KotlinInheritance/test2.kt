package _11KotlinOOPs.KotlinInheritance

open class Patent {

    constructor(name: String, id: Int) {
        println("execute super constructor $name: $id")
    }
}

class Child: Patent {

    constructor(name: String, id: Int, dept: String): super(name, id) {
        print("execute child class constructor with property $name, $id, $dept")
    }
}
fun main(args: Array<String>) {
    val child = Child("Ashu",101, "Developer")
}