package Enum_Classes

/**
 * @author: hoangtien2k3
 * @create: 13/12/2023 - 16:57
 * @file: demo_Enum_Classes_Kotlin.kt
 * @update: 13/12/2023
 * @description:
 */

/**
 * @note: Enum Class
 *
 * enum class Direction {
 *     NORTH, SOUTH, WEST, EAST
 * }
 */


// Demo enum Direction
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class RGB { RED, GREEN, BLUE }

// demo enum Color
enum class Color(val rgbs: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ComplexColor(val rgb: Int, val names: String, val hexCode: String) {
    RED(0xFF0000, "Red", "#FF0000"),
    GREEN(0x00FF00, "Green", "#00FF00"),
    BLUE(0x0000FF, "Blue", "#0000FF");

    override fun toString(): String {
        return "Color: $name, RGB: $rgb, Hex Code: $hexCode"
    }
}


// Anonymous classes in kotlin
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

@OptIn(ExperimentalStdlibApi::class)
fun main() {

    println(Direction.EAST)
    println(Direction.WEST)
    println(Direction.NORTH)
    println(Direction.SOUTH)

    println("______________________________________________________")

    println(Color.RED)
    println(Color.GREEN)
    println(Color.BLUE)

    println("______________________________________________________")

    for (color in RGB.entries)
        println(color.toString()) // prints RED, GREEN, BLUE
    println("The first color is: ${RGB.valueOf("RED")}") // prints "The first color is: RED"

    println("______________________________________________________")

    var currentState: ProtocolState = ProtocolState.WAITING
    println("Current State: $currentState")

    currentState = currentState.signal()
    println("After signaling: $currentState")

    currentState = currentState.signal()
    println("After signaling again: $currentState")


    println("______________________________________________________")

    val redColor: Color = Color.RED
    println("Red Color RGB: ${redColor.rgbs}")

    val greenColor: Color = Color.GREEN
    println("Green Color RGB: ${greenColor.rgbs}")

    val blueColor: Color = Color.BLUE
    println("Blue Color RGB: ${blueColor.rgbs}")


    println("______________________________________________________")

    val redColor1: ComplexColor = ComplexColor.RED
    println(redColor1) // In ra "Color: Red, RGB: 16711680, Hex Code: #FF0000"

    val greenColor1: ComplexColor = ComplexColor.GREEN
    println(greenColor1) // In ra "Color: Green, RGB: 65280, Hex Code: #00FF00"

    val blueColor1: ComplexColor = ComplexColor.BLUE
    println(blueColor1) // In ra "Color: Blue, RGB: 255, Hex Code: #0000FF"

}
