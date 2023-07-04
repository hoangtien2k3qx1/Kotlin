
## Unsafe and Safe Cast

### Unsafe cast operator: as
A `nullable` string (String?) `cannot be cast to non nullabe` string (String), this throw an exception.

// sẽ lỗi
```kotlin
fun main(args: Array<String>){  
    val obj: Any? = null  
    val str: String = obj as String  
    println(str)  
 }  
```

// đúng
```kotlin
fun main(args: Array<String>){  
    val obj: String? = "String unsafe cast"  
    val str: String? = obj as String? // // ép kiểu từ Any sang String và gán cho str 
    println(str)  
}  
```

## Kotlin Safe cast operator: as?
Kotlin provides a safe cast operator as? for safely cast to a type. It returns a null if casting is not possible rather than throwing an ClassCastException exception.
```kotlin
fun main(args: Array<String>){  
      
    val location: Any = "Kotlin"  
    val safeString: String? = location as? String  
    val safeInt: Int? = location as? Int  
    println(safeString)  
    println(safeInt)  
    
}  
```

### Lưu ý:
1. Toán tử `as`:
- Toán tử `as` được sử dụng để thực hiện ép kiểu từ một kiểu dữ liệu sang kiểu dữ liệu khác.
- Nếu kiểu dữ liệu cần ép kiểu không tương thích với kiểu đích, một ngoại lệ `ClassCastException` sẽ được ném.
- Toán tử `as` chỉ nên được sử dụng khi bạn chắc chắn rằng việc ép kiểu sẽ thành công.
```kotlin
val obj: Any = "Hello"
val str: String = obj as String // Ép kiểu từ Any sang String
```

2. Toán tử an toàn `as?`:
- Toán tử an toàn `as?` cũng được sử dụng để thực hiện ép kiểu từ một kiểu dữ liệu sang kiểu dữ liệu khác.
- Nếu kiểu dữ liệu cần ép kiểu không tương thích với kiểu đích, kết quả sẽ là `null` thay vì ném ngoại lệ `ClassCastException`.
- Toán tử `as?` được sử dụng trong các trường hợp mà bạn không chắc chắn về kiểu dữ liệu và muốn tránh lỗi ngoại lệ.
```kotlin
val obj: Any = "Hello"
val str: String? = obj as? String // Ép kiểu từ Any sang String? (nullable String)
```



