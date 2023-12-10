
## Kotlin Abstract class

Declaration of abstract class
```kotlin
abstract class A {  
    var x = 0  
    abstract fun doSomething()  
}  
```

Example:
```kotlin
abstract class Car{  
    abstract fun run()  
}  

class Honda: Car(){  
   override fun run(){  
        println("Honda is running safely..")  
   }  
}  

fun main(args: Array<String>){  
    val obj = Honda()  
    obj.run();  
}  
```

Example:
```kotlin
open class Car {  
    open fun run() {  
        println("Car is running..")  
    }  
}  

abstract class Honda : Car() {  
    override abstract fun run()  
}  

class City: Honda(){  
    override fun run() {  
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.  
        println("Honda City is running..")  
    }  
} 

fun main(args: Array<String>){  
    val car = Car()  
    car.run()  
    val city = City()  
    city.run()  
}  
```

Example:
```kotlin
abstract class Bank {  
    abstract fun simpleInterest(p: Int, r: Double, t: Int) :Double  
}  
  
class SBI : Bank() {  
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{  
        return (p*r*t)/100  
    }  
}  

class PNB : Bank() {  
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{  
        return (p*r*t)/100  
    }  
}  

fun main(args: Array<String>) {  
    var sbi: Bank = SBI()  
    val sbiint = sbi.simpleInterest(1000,5.0,3)  
    println("SBI interest is $sbiint")  
    var pnb: Bank = PNB()  
    val pnbint = pnb.simpleInterest(1000,4.5,3)  
    println("PNB interest is $pnbint")  
}  
```

### [Lưu ý]():
- Lớp kế thừa từ abstract class không bắt buộc phải triển khai tất cả các phương thức trừu tượng trong abstract class. 
- Một lớp có thể kế thừa từ một lớp trừu tượng và triển khai nhiều interface cùng một lúc.
- Trong Kotlin, các phương thức và thuộc tính trong `abstract` class mặc định là `final`.(nghĩa là chúng không thể được override trong lớp con. ) (Bạn cần sử dụng từ khóa `"open"` để cho phép lớp con `override` các phương thức và thuộc tính đó.)
- Nếu không sử dụng từ khóa `"open"` trước khai báo của phương thức hoặc thuộc tính trong Kotlin, chúng sẽ được coi là `final` (mặc định). 





