
## Kotlin Operator
Operators are special characters which perform operation on operands (values or variable).
- `Arithmetic operator`:  toán tử số học
- `Relation operator`: toán tử quan hệ
- `Assignment operator`: toán tử gán
- `Unary operator`: toán tử một ngôi
- `Bitwise operation`: toán tử bit
- `Logical operator`: toán tử logic


## `Arithmetic Operator`: toán tử số học
Arithmetic operators are used to perform basic mathematical operations such as addition (+), subtraction (-), multiplication (*), division (/) etc.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/6aa4cd31-bc3c-4cdc-8bcf-6997bf88f64a)
````kotlin
fun main(args : Array<String>) {  
    var a=10;  
    var b=5;  
    println(a+b);  
    println(a-b);  
    println(a*b);  
    println(a/b);  
    println(a%b);  
}  
````

## `Relation Operator`: toán tử logic
Relation operator shows the relation and compares between operands. Following are the different relational operators
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/d4c95c35-50c7-487e-b1ba-07587ee5c5c5)
```kotlin
fun main(args : Array<String>) {  
    val a = 5  
    val b = 10  
    val max = if (a > b) {  
        println("a is greater than b.")  
        a  
    } else{  
        println("b is greater than a.")  
        b  
    }  
    println("max = $max")  
}  
```

## `Assignment operator`: toán tử gán
Assignment operator "=" is used to assign a value to another variable. The assignment of value takes from right to left.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/5450f5a1-6420-4335-ae6b-94d31206d26d)
```kotlin
fun main(args : Array<String>) {
    var a =20;var b=5  
    a+=b  
    println("a+=b :"+ a)  
    a-=b  
    println("a-=b :"+ a)  
    a*=b  
    println("a*=b :"+ a)  
    a/=b  
    println("a/=b :"+ a)  
    a%=b  
    println("a%=b :"+ a)
}  
```

## `Unary Operator`: toán tử một ngôi
Unary operator is used with only single operand. Following are some unary operator given below.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/87a2e94f-b061-4809-a865-17570e40c491)
```kotlin
fun main(args: Array<String>){  
    var a=10  
    var b=5  
    var flag = true  
    println("+a :"+ +a)  
    println("-b :"+ -b)  
    println("++a :"+ ++a)  
    println("--b :"+ --b)  
    println("!flag :"+ !flag)  
}  
```

## `Logical Operator`: toán tử logic
Logical operators are used to check conditions between operands. List of logical operators are given below.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/7d77bbcb-0e6f-443b-a286-03da8719fce2)
```kotlin
fun main(args: Array<String>){
    var a=10
    var b=5
    var c=15
    var flag = false
    var result: Boolean
    result = (a>b) && (a>c)
    println("(a>b) && (a>c) :"+ result)
    result = (a>b) || (a>c)
    println("(a>b) || (a>c) :"+ result)
    result = !flag
    println("!flag :"+ result)
}  
```

## `Bitwise Operation`: toán tử bit
In Kotlin, there is not any special bitwise operator. Bitwise operation is done using named function.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/2e01eaee-06c2-4e56-82db-f1a52e7fdaa3)
```kotlin
fun main(args: Array<String>){  
    var a=10  
    var b=2
    println("a.shl(b): "+a.shl(b))  
    println("a.shr(b): "+a.shr(b))  
    println("a.ushr(b:) "+a.ushr(b))  
    println("a.and(b): "+a.and(b))  
    println("a.or(b): "+a.or(b))  
    println("a.xor(b): "+a.xor(b))  
    println("a.inv(): "+a.inv())
}  
```