# Kotlin
Welcome to Kotlin! It is an open-source, statically typed programming language supported and developed by JetBrains and open-source contributors.

### Toán tử Elvis `?:` (còn được gọi là "Elvis operator")
syntax: `Toán tử Elvis `?:` có cú pháp: `expression1 ?: expression2`.`

Cách hoạt động của toán tử này như sau:
- Nếu `expression1` không phải là `null`, giá trị của `expression1` sẽ được trả về.
- Nếu `expression1` là `null`, giá trị của `expression2` sẽ được trả về.
```kotlin
val nullableValue: Int? = null
val result = nullableValue ?: 0
println(result) // Kết quả: 0
```


### Toán tử `?.` (safe call operator)
- Toán tử `?.` có cú pháp `object?.property` hoặc `object?.method()`, trong đó `object` là biểu thức có thể chứa giá trị null.
- Toán tử này sẽ trả về giá trị null nếu `object` là null, và nếu `object` khác null, thì thuộc tính hoặc phương thức được gọi.
- Việc sử dụng toán tử ?. giúp tránh các lỗi NullPointerException (NPE) khi làm việc với giá trị null.
```kotlin
data class Person(val name: String, val age: Int?)

fun main() {
    val person1 = Person("Alice", 25)
    val person2: Person? = null

    println(person1.age?.toString()) // Kết quả: "25"
    println(person2?.age?.toString()) // Kết quả: null
}
```


### Toán tử `as` và `as?`
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

## Trong Kotlin, có hai loại các bộ sưu tập (collection): Immutable Collection (hoặc Collection không thay đổi) và Mutable Collection.

1. `Immutable Collection` (Collection không thay đổi):

- `Immutable Collection` là một loại bộ sưu tập mà các phần tử của nó không thể thay đổi sau khi được tạo ra.
- Để tạo một `Immutable Collection`, bạn có thể sử dụng các phương thức như `listOf()`, `setOf()`, `mapOf()` để tạo danh sách, tập hợp, hoặc bản đồ không thay đổi.
- Các phương thức trên trả về một bản sao bất biến của dữ liệu được cung cấp, không cho phép sửa đổi các phần tử hoặc thay đổi kích thước của bộ sưu tập.

```kotlin
val names = listOf("Alice", "Bob", "Charlie") // Immutable List
val numbers = setOf(1, 2, 3, 4) // Immutable Set
val personMap = mapOf("Alice" to 25, "Bob" to 30) // Immutable Map
```

2. `Mutable Collection`:

- `Mutable Collection` là một loại bộ sưu tập mà các phần tử của nó có thể thay đổi sau khi được tạo ra.
- Để tạo một `Mutable Collection`, bạn có thể sử dụng các phương thức tương ứng như `mutableListOf()`, `mutableSetOf()`, `mutableMapOf()` để tạo danh sách, tập hợp, hoặc bản đồ có thể thay đổi.
- Các phương thức trên trả về một `Mutable Collection`, cho phép thêm, xóa, sửa đổi các phần tử, và thay đổi kích thước của bộ sưu tập.

```kotlin
val mutableNames = mutableListOf("Alice", "Bob", "Charlie") // Mutable List
val mutableNumbers = mutableSetOf(1, 2, 3, 4) // Mutable Set
val mutablePersonMap = mutableMapOf("Alice" to 25, "Bob" to 30) // Mutable Map
```

## Kotlin Nested class and Inner class

### Giống nhau:
- Đều là các lớp được giới hạn phạm vi và liên kết chặt chẽ với lớp bên ngoài.
- Cả hai có thể truy cập vào các thành viên (biến và phương thức) của lớp bên ngoài.
- Có thể tạo đối tượng của lớp nested class hoặc inner class từ lớp bên ngoài.


### Khác nhau:
### Nested class (static nested class):
- Trong Java, lớp `nested class` được khai báo là `static`, nghĩa là nó `không tham chiếu` đến lớp `bên ngoài`.
- `Nested class` trong Kotlin không có từ khóa `"static"`, nhưng mặc định nó `được coi là static`.
- `Không thể truy cập trực tiếp` vào các biến `non-static` của lớp bên ngoài.
- Thường được sử dụng để nhóm các lớp có quan hệ chặt chẽ lại với nhau, như là một thành viên của lớp bên ngoài.

### Inner class:
- Trong Java, lớp `inner class` được khai báo bên trong lớp bên ngoài và `có thể truy cập trực tiếp` vào các biến `non-static` của lớp bên ngoài.
- `Inner class` trong Kotlin cũng tương tự, nhưng không cần sử dụng từ khóa "this@Outer" để truy cập vào các thành viên của lớp bên ngoài.
- Thường được sử dụng để xử lý các tác vụ liên quan trong cùng một đối tượng và có thể truy cập dễ dàng vào các thành viên của lớp bên ngoài.









