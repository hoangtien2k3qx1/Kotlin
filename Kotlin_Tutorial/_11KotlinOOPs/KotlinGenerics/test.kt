package _11KotlinOOPs.KotlinGenerics

fun main(args: Array<String>){
    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
    val s: String = stringList[0]
    println("printing the string value of stringList: $s")
    printValue(stringList)
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
    printValue(floatList)
}

fun <T>printValue(list: ArrayList<T>){
    for(element in list){
        println(element)
    }
}