
## Kotlin Collections

### Types of Kotlin Collections
- Immutable Collection (or Collection)
- Mutable Collection


## Immutable Collection:
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/4a5d089a-9096-4a69-b63b-75cc284d876f)

## Mutable Collection:
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/5b35f0a5-5bb5-47c2-93ca-5b33e22ec68c)


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


