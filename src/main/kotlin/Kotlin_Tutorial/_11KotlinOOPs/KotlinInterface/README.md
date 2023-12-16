
## Kotlin Interface
- An `interface` is a blueprint(chí tiết) of class.
- Kotlin interface is similar to Java 8.
- It contains abstract method declarations as well as implementation of method.

Defining Interface
```kotlin
interface MyInterface {  
val id: Int // abstract property  
    fun absMethod()// abstract method  
    fun doSomthing() {  
      // optional body  
    }  
}  
```

## Why use Kotlin interface?
- Using interface supports functionality of multiple inheritance.
- It can be used achieve to loose coupling.
- It is used to achieve abstraction.


## Implementing Interfaces
```kotlin
interface MyInterface  {  
    var id: Int            // abstract property  
    fun absMethod():String    // abstract method  
    fun doSomthing() {  
        println("MyInterface doing some work")  
    }  
}  

class InterfaceImp : MyInterface {  
    override var id: Int = 101  
    override fun absMethod(): String{  
        return "Implementing abstract method.."  
    }  
}  

fun main(args: Array<String>) {  
    val obj = InterfaceImp()  
    println("Calling overriding id value = ${obj.id}")  
    obj.doSomthing()  
    println(obj.absMethod())  
}  
```


### [Lưu ý](): 
- `Interface` có thể chứa cả phương thức và thuộc tính.
- Mặc định, các phương thức và thuộc tính trong interface là trừu tượng (abstract) và không có cài đặt.
- Để định nghĩa phương thức mặc định (default method), sử dụng cú pháp fun tenPhuongThuc() { ... }.
- Để định nghĩa thuộc tính, sử dụng cú pháp var tenThuocTinh: KieuDuLieu.
- Khi một lớp kế thừa một `interface`, nó `không bắt buộc phải override tất cả` các `phương thức` và `thuộc tính` của interface đó.
- Trong Kotlin, các `phương thức` và `thuộc tính` trong `interface` được coi là `"open"` mặc định, không cần từ khóa "open" để cho phép lớp triển khai `interface override` chúng.












