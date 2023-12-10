package _8Collections.KotlinHashMap

fun main(args: Array<String>){

    val intMap: HashMap<Int, String> = hashMapOf<Int,String>(1 to "Ashu",4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")

    val stringMap: HashMap<String,String> = hashMapOf<String,String>("name" to "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")
    val anyMap: HashMap<Any, Any> = hashMapOf<Any, Any>(1 to "Ashu", "name" to "Rohsan", 2 to 200)
    println(".....traverse intMap........")
    for(key in intMap.keys){
        println(intMap[key])
    }
    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println(stringMap[key])
    }
    println("......traverse anyMap.......")
    for(key in anyMap.keys){
        println(anyMap[key])
    }
}