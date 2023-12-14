package Higher_Order_Function

/**
 * @author: hoangtien2k3
 * @create: 14/12/2023 - 13:41
 * @file: test.kt
 * @update: 14/12/2023
 * @description:
 */


fun add(a: Int, b: Int): Int = a + b

fun returnMethodAddFunction(): (Int, Int) -> Int {
    // can do something and return function as well
    return::add
}

fun main() {

    val add = returnMethodAddFunction()
    val result = add(10, 20)
    println("10 + 20 = $result")

    // C1
    val russianNames = arrayOf("Maksim", "Artem", "Sophia", "Maria", "Maksim")
    val selectedName = russianNames
        .filter { name -> name.startsWith("m", ignoreCase = true) }
        .sortedBy { name -> name.length }
        .firstOrNull()
    println(selectedName)

    // C2
    val selectByName = russianNames
        .filter { it.startsWith("m", ignoreCase = true) }
        .sortedBy { name -> name.length }
        .firstOrNull()
    println(selectedName)

}