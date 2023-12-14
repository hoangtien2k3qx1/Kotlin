
## Higher Order Function:


## Phần 2 - Lambda?

- Biểu thức của lambda luôn được bao bởi {}
- Nếu lambda function có bất kì param nào nó phải ở trước toán tử -> (kiểu dữ liệu của param có thể được bỏ qua)
- Body của lambda function phải ở sau toán tử ->

```kotlin
//1
doSomethingWithNumber(1000, { result ->
    // do something with result
})

//2
doSomethingWithNumber(1000, { result : String? ->
    // do something with result
})

//3
doSomethingWithNumber(1000) { result ->
    // do something with result
}
```

### 3 cách sử dụng trên là như nhau và như các cách function reference và function anonymous.

- it: implicit name of a single parameter
```kotlin
doSomethingWithNumber(1000) {
    println("The result is $it")
    // do something with result
} 
```

- Destructuring trong Lambdas
```kotlin
map.mapValues { entry -> "${entry.value}!" }
map.mapValues { (key, value) -> "$value!" }
```

- Lambda return:
```kotlin
//The first way
ints.filter {
    val shouldFilter = it > 0
    shouldFilter
}

//The second way
ints.filter {
    val shouldFilter = it > 0
    return@filter shouldFilter
}
```

## Function Literals:
- A function literal is just an expression that defines an unnamed function.: Hàm chữ chỉ là một biểu thức xác định một hàm không tên.

```kotlin
val m = { (x : String) -> println("$x") }
val n : (String) -> Unit = { x -> println("$x") }
val o : (String) -> Unit = { (x : String) -> println("$x") }

fun main(args : Array<String>) {
 m("good morning")
 n("good morning")
 o("good morning")
}
```






