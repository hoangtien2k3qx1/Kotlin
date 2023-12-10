package _11KotlinOOPs.KotlinDataClass

open class MyBaseClass(val baseProperty: String)

data class MyDataClass(val dataProperty: Int, val additionalProperty: String) : MyBaseClass("Base Property"), Comparable<MyDataClass> {
    override fun compareTo(other: MyDataClass): Int {
        return this.dataProperty.compareTo(other.dataProperty)
    }
}

fun main() {
    val dataObj = MyDataClass(10, "Additional Property")
    println(dataObj.baseProperty) // Output: Base Property
    println(dataObj.dataProperty) // Output: 10
    println(dataObj.additionalProperty) // Output: Additional Property
}