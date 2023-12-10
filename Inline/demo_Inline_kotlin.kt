
fun demo1(lambda: () -> Unit) {
    val start = System.currentTimeMillis()

    val result = lambda()

    val end = System.currentTimeMillis()

    println("Time: ${end - start} (ms)")

    return result
}

inline fun demoInline(lambda: () -> Unit) {
    val start = System.currentTimeMillis()

    val result = lambda()

    val end = System.currentTimeMillis()

    println("Time: ${end - start} (ms)")

    return result
}



fun main() {

    println("hoangtien2k3")

    demoInline {
        Thread.sleep(100)
        1 + 2
    }

    println("_".repeat(50))

    val result = demoInline {
        Thread.sleep(100)
        1 + 2
    }
    println(result)


}