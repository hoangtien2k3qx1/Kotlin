
## `Inline` trong Kotlin

### + [Inline Function:]()
Trong Kotlin, từ khóa inline được sử dụng để khai báo một hàm inline. Khi bạn sử dụng inline, nội dung của hàm sẽ được sao chép trực tiếp vào nơi mà hàm được gọi thay vì được gọi thông qua một cuộc gọi hàm thông thường. Điều này có thể giúp tối ưu hóa hiệu suất bằng cách giảm số lượng cuộc gọi hàm và giảm độ trễ.

```kotlin
inline fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = calculateSum(3, 5)
    println("Sum: $result")
}
```

Code trên khi sử dụng `inline` sẽ trông như thế này:
```kotlin
inline fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Khi biên dịch, nội dung của hàm calculateSum sẽ được sao chép trực tiếp vào đây
    val result = 3 + 5
    println("Sum: $result")
}
```


### + [Inline Class:]()
inline class là một tính năng mới từ phiên bản Kotlin 1.5 trở đi. Nó cho phép bạn định nghĩa một lớp với một và chỉ một thuộc tính. Khi biên dịch, các thực thể của inline class sẽ được thay thế bằng kiểu dữ liệu cơ bản của nó, giúp giảm bớt đối tượng và tiết kiệm bộ nhớ.

```kotlin
inline class UserId(val value: Int)

fun main() {
    val userId: UserId = UserId(42)
    val intValue: Int = userId.value

    println("User ID: $intValue")
}
```


