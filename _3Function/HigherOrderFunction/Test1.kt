package _3Function.HigherOrderFunction

class Test1 {

}

fun doSomethingWithNumber(number: Int, receiver: (String?) -> Unit) {
    var result: String? = null
    result = "HOANG ANH TIEN"

    receiver(result)
}

fun processWithResult(result: String?) : Unit {
    // do something with result
}

fun main() {
    doSomethingWithNumber(1000, ::processWithResult)

    processWithResult("Hoang Anh Tien")

}
