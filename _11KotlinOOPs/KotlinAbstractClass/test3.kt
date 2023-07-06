package _11KotlinOOPs.KotlinAbstractClass

open class MyBaseClass {
    private val privateProperty: String = "Private Property"
    protected val protectedProperty: String = "Protected Property"
    val publicProperty: String = "Public Property"

    private fun privateMethod() {
        println("Private Method")
    }

    protected fun protectedMethod() {
        println("Protected Method")
    }

    fun publicMethod() {
        println("Public Method")
    }

    fun accessPropertiesAndMethods() {
        println(privateProperty)    // Không thể truy cập thuộc tính privateProperty từ bên ngoài lớp
        println(protectedProperty)  // Có thể truy cập thuộc tính protectedProperty từ lớp con
        println(publicProperty)     // Có thể truy cập thuộc tính publicProperty từ bất kỳ đâu

        privateMethod()             // Không thể gọi privateMethod từ bên ngoài lớp
        protectedMethod()           // Có thể gọi protectedMethod từ lớp con
        publicMethod()              // Có thể gọi publicMethod từ bất kỳ đâu
    }
}

class MyDerivedClass : MyBaseClass() {
    fun accessPropertiesAndMethodsFromDerivedClass() {
        println(protectedProperty)  // Có thể truy cập thuộc tính protectedProperty từ lớp con
        protectedMethod()           // Có thể gọi protectedMethod từ lớp con
    }
}

fun main() {
    val obj = MyBaseClass()
    println(obj.publicProperty)     // Có thể truy cập thuộc tính publicProperty từ bất kỳ đâu
    obj.publicMethod()              // Có thể gọi publicMethod từ bất kỳ đâu

    // Không thể truy cập thuộc tính protectedProperty và gọi protectedMethod từ bên ngoài lớp hoặc lớp con
    // obj.protectedProperty
    // obj.protectedMethod()

    val derivedObj = MyDerivedClass()
    derivedObj.accessPropertiesAndMethodsFromDerivedClass()
}