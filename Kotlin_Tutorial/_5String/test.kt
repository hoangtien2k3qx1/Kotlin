package _5String

fun main() {
    val str1 = "abc"
    val str2 = "def"

    val result1 = str1.compareTo(str2)
    val result2 = str2.compareTo(str1)
    val result3 = str1.compareTo(str1)

    println(result1) // Kết quả: -3 (abc < def)
    println(result2) // Kết quả: 3 (def > abc)
    println(result3) // Kết quả: 0 (abc = abc)
}