package Kotlin_Learn.Contructor.PrimaryContructor

class PrimaryConstructor_2 private constructor(val name: String){
    companion object{
        fun newPrimaryConstructor(name: String) = PrimaryConstructor_2(name);
    }
}

fun main() {
    val instancePrimary = PrimaryConstructor_2.newPrimaryConstructor("Hoàng Anh Tiến")
    println(instancePrimary.name)
}