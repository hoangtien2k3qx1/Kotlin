package Delegation.Delegation_Properties

/**
 * @author: hoangtien2k3
 * @create: 12/12/2023 - 13:56
 * @file: demo_delegation_properties_kotlin.kt
 * @update: 12/12/2023
 * @description:
 */

/**
 * @note: Delegation Properties
 *
 * Lazy properties
 *
 * Observable properties
 */



import kotlin.properties.Delegates
import kotlin.reflect.KProperty

// Example delegate properties
class Example {
    var delegationProperty: String by Delegate()
}


class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegation '${property.name}' to me"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value, has been assigned to '${property.name}' in $thisRef.")
    }
}


// Standard delegates
// Example Lazy Properties in kotlin delegation
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}


// Example Observable in kotlin delegation
class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")
    }
}



fun main() {

    val e = Example()
    println(e.delegationProperty)

    println("_".repeat(80))

    e.delegationProperty = "New Value"
    println(e.delegationProperty)



    println("_".repeat(80))

    // Lazy properties delegation kotlin
    println(lazyValue)
    println(lazyValue)


    println("_".repeat(80))

    // Observable delegation properties kotlin:
    val user = User()
    user.name = "first"
    user.name = "second"


}