package Extention_Function_and_Properties

class CheckNumbers {

    fun greaterThan10(x: Int): Boolean = x > 10

}

class ResponseNetword(val code: Int, val message: String) {

    val isSuccess: Boolean
        get() = code == 200

    val isFailed: Boolean
        get() = code != 200

}


// Extention function
fun CheckNumbers.lessThan10(x: Int): Boolean {
    return x < 10
}


// extention properties
val String.isPhoneNumber: Boolean
    get() = this.matches("^\\d{10}$".toRegex()  )


fun main() {

    val checkNumbers = CheckNumbers()

    // check number greater than 10 with function in class CheckNumber
    println(checkNumbers.greaterThan10(12))

    // check number less than 10 with Extention Function:
    println(checkNumbers.lessThan10(12))


    // ------------------------------------------------------------------

    val phoneNumber = "123456789"
    println("CheckPhoneNumber: ${phoneNumber.isPhoneNumber}")


    // ------------------------------------------------------------------

    val responseNetwork = ResponseNetword(200, "Call api successfully")
    println(responseNetwork.isSuccess)

    println(responseNetwork.isFailed)


}