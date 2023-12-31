package _3Function.HigherOrderFunction

fun myFun1(org: String, portal: String, fn: (String, String) -> String): Unit {
    val result = fn(org, portal)
    println(result)
}

fun main(args: Array<String>) {
    val fn: (String, String) -> String = { org, portal -> "$org develop $portal" }
    myFun1("sssit.org", "javatpoint.com", fn)
}