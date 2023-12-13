package Object_Expressions_and_Declarations


class MyClass1 {
    companion object Named { }
}

val x: MyClass1.Named = MyClass1

class MyClass2 {
    companion object { }
}

val y: MyClass2.Companion
    get() = MyClass2


////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}


fun main() {
    // C1
    val myObject: MyClass = MyClass.create()
    // C2 the same C1
    val f: Factory<MyClass> = MyClass.Companion


}