
## Kotlin Lambda Function

Syntax lambda function
```kotlin
val lambdaName: (parameters) -> returnType = { arguments ->
    // function body
}

Trong đó:
- `lambdaName` là tên (tùy chọn) bạn muốn đặt cho lambda function.
- `parameters` là danh sách các tham số đầu vào của lambda function (tùy chọn).
- `returnType` là kiểu dữ liệu của giá trị trả về của lambda function (tùy chọn).
- `arguments` là tên (tùy chọn) bạn muốn đặt cho các đối số được truyền vào lambda function.
- `function body` là phần thân của lambda function, bao gồm các câu lệnh được thực thi khi lambda function được gọi.
```

Lưu ý:
- `Unit` là một kiểu dữ liệu đặc biệt sử dụng để đại diện cho kiểu dữ liệu không trả về. 
- Nó tương đương với kiểu `void` trong Java hoặc C++.

### Normal function: hàm thông thường.
```kotlin
fun main(args: Array<String>){  
    addNumber(5,10)  
}  

fun addNumber(a: Int, b: Int){  
    val add = a + b  
    println(add)  
}  
```

### Lambda function: hàm có lambda
```kotlin
fun main(args: Array<String>){  
    val myLambda: (Int) -> Unit= {s: Int -> println(s) } //lambda function  
    addNumber(5,10,myLambda)  
}  
fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit ){   //high level function lambda as parameter  
    val add = a + b  
    mylambda(add) // println(add)  
}  
```








