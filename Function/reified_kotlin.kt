package Function

/**
 * @author: hoangtien2k3
 * @create: 15/12/2023 - 17:36
 * @file: reified_kotlin.kt
 * @update: 15/12/2023
 * @description:
 */

/**
 * @note: reified in kotlin
 *
 * Reified (thống nhất) có thể hiểu là việc làm cho mọi thứ trở nên cụ thể và thực tế hơn.
 *
 * "reified type parameters" là một tính năng giúp duy trì thông tin về kiểu generic ở runtime trong các hàm inline.
 *
 *  Nếu không có reified trong Kotlin thì thông tin về kiểu generic thường bị mất đi ở thời điểm chạy (runtime) do hiện tượng "type erasure".
 */


inline fun <reified T> getTypeName(value: T): String {
    return when (T::class) {
        Int::class -> "Integer"
        String::class -> "String"
        Double::class -> "Double"
        Long::class -> "Long"
        else -> "Unknown"
    }
}

inline fun <reified T> printType() {
    val typeName = T::class.simpleName
    println("Type is: $typeName")
}



/**
 * @note: type erasure
 *
 * khái niệm: "type erasure"
 *
 * // Java
 * public class Example<T> {
 *     private T value;
 *
 *     public Example(T value) {
 *         this.value = value;
 *     }
 *
 *     public T getValue() {
 *         return value;
 *     }
 * }
 *
 * // Sau khi biên dịch với type erasure:
 * public class Example {
 *     private Object value;
 *
 *     public Example(Object value) {
 *         this.value = value;
 *     }
 *
 *     public Object getValue() {
 *         return value;
 *     }
 * }
 *
 */


class TreeNode(val name: String, val parent: TreeNode? = null)

fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

fun main() {
    val intTypeName = getTypeName<Int>(42)
    val stringTypeName = getTypeName("Hello")

    println("Type of 42: $intTypeName")
    println("Type of 'Hello': $stringTypeName")


    println("__________________________________________________")

    printType<String>()
    printType<Int>()


    println("__________________________________________________")


    val rootNode = TreeNode("Root")
    val childNode = TreeNode("Child", rootNode)
    val grandchildNode = TreeNode("Grandchild", childNode)

    val foundParent: TreeNode? = grandchildNode.findParentOfType(TreeNode::class.java)

    if (foundParent != null) {
        println("Found parent: ${foundParent.name}")
    } else {
        println("Parent not found.")
    }


}
