package Operator_Overloading


interface IndexedContainer {
    operator fun get(index: Int)
}

class OrdersList: IndexedContainer {
    override fun get(index: Int) {
        println("Operator Overloading")
    }
}


data class Point(val x: Int, val y: Int)

val point = Point(10, 20)


// mix operator overloading and extension function
operator fun Point.unaryMinus() = Point(-x, -y)

// plus
operator fun Point.plus(a: Int): Int = a + 1


// demo invoke function
class Greeter(private val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}


fun main() {
    println(-point)  // prints "Point(x=-10, y=-20)"

    println(point.plus(1))


    // invoke()
    val greet = Greeter("Hello")
    greet.invoke("Tiến")  // prints "Hello, Tiến!"
    greet("Tiến")  // prints "Hello, Tiến!"

}

