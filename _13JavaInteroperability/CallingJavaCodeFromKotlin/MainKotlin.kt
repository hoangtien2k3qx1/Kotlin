package _13JavaInteroperability.CallingJavaCodeFromKotlin

import _13JavaInteroperability.CallingJavaCodeFromKotlin.MyJavaClass

fun main(args: Array<String>) {
    val sum = MyJavaClass.add(5, 10)
    println("printing sum inside Kotlin file: $sum")

    val area: Int = MyJavaClass.area(3, 4)
    println("printing area from java insideKotlin file: $area")

    ///
    val myJava = MyJavaClass()

    myJava.lastName = "Kumar"
    myJava.setfirstName("Arjun")

    println("accessing value using property: "+myJava.firstName)
    println("accessing value using property: "+myJava.lastName)

    println("accessing value using method: "+myJava.getfirstName())
    println("accessing value using method: "+myJava.getlastName())

}






