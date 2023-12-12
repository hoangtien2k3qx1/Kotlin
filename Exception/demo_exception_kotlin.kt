package Exception

import java.io.IOException

class Person(var nam: String?)


fun main() {

    val result = try {
        throw RuntimeException(":)")
//        throw RuntimeException("Demo broken!", IOException("Net work"))
    } catch (e: IOException) {
        //
    } catch (e: RuntimeException) {
        e.printStackTrace(System.err)
        println("Caught $e")
    } catch (e: IllegalStateException) {
        e.printStackTrace()
        1
    } finally {
        println("Finally")
    }



    // check null
    val p = Person(null)
    val length = p.nam?.length ?: throw IllegalStateException("name is null")

    println(length + 1)



    // trường phaái check null trong kotlin:
    listOf(1, 2, 3).max() // can throw exception if null
    listOf(1, 2, 3).maxOrNull() // return null if exception happen


}