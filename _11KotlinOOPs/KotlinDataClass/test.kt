package _11KotlinOOPs.KotlinDataClass

data class User(var name: String, var id: Int, var email: String)

fun main(agrs: Array<String>) {
    val u = User("Ashu", 101, "mymail@mail.com")
    println(u)
}