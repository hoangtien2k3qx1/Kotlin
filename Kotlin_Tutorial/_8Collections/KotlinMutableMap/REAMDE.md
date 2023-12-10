
## Kotlin MutableMap Interface
Khai báo `MutableMap` không null và có thể thay đổi sử dụng `mutableMapOf<K, V>()` hoặc `hashMapOf<K, V>()`

Các chức năng chính của `Map` trong Kotlin bao gồm:

- `get(key: K)`: Lấy giá trị tương ứng với khóa `key` từ `Map`.
- `containsKey(key: K)`: Kiểm tra xem `Map` có chứa khóa `key` hay không.
- `containsValue(value: V)`: Kiểm tra xem `Map` có chứa giá trị `value` hay không.
- `put(key: K, value: V)`: Thêm một cặp khóa-giá trị vào `Map`.
- `remove(key: K)`: Xóa khóa và giá trị tương ứng khỏi `Map`.
- `isEmpty()`: Kiểm tra xem `Map` có rỗng hay không.
- `size`: Trả về số lượng cặp khóa-giá trị trong `Map`.

  
Kotlin MutableMap Interface Declaration
```kotlin
interface MutableMap<K, V> : Map<K, V> (source)  
```

Example:
```kotlin
fun main(args: Array<String>) {  
  
    val mutableMap1: MutableMap<Int, String> = mutableMapOf<Int, String>(1 to "Ashu", 4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")  
  
    val mutableMap2: MutableMap<String, String> = mutableMapOf<String, String>()  
    mutableMap2.put("name", "Ashu")  
    mutableMap2.put("city", "Delhi")  
    mutableMap2.put("department", "Development")  
    mutableMap2.put("hobby", "Playing")  
    val mutableMap3: MutableMap<Any, Any> = mutableMapOf<Any, Any>(1 to "Ashu", "name" to "Rohsan", 2 to 200)  
    println(".....traverse mutableMap1........")  
    for (key in mutableMap1.keys) {  
        println("Key = ${key}, Value = ${mutableMap1[key]}")  
    }  
    println("......traverse mutableMap2.......")  
    for (key in mutableMap2.keys) {  
        println("Key = "+key +", "+"Value = "+mutableMap2[key])  
    }  
    println("......traverse mutableMap3......")  
    for (key in mutableMap3.keys) {  
        println("Key = ${key}, Value = ${mutableMap3[key]}")  
    }  
}  
```






