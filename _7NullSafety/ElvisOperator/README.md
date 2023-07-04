
## Elvis Operator (?:)
- Elvis operator (?:) is used to return the not null value even the conditional expression is null.
- It is also used to check the null safety of values.

Example:
```kotlin
fun main(args: Array<String>){  
  
    var str: String? = null  
    var str2: String? = "May be declare nullable string"  
    
    var len1: Int = if (str != null) str.length else -1  
    var len2: Int = if (str2 != null) str2.length else -1


    var len_1: Int = str?.length ?: -1
    var len_2: Int = str2?.length ?:  -1

    println("Length of str is ${len1}")  
    println("Length of str2 is ${len2}")

    println("Length of str is ${len_1}")
    println("Length of str2 is ${len_2}")

}  
```

## Kotlin Elvis Operatorusing throw and return expression

Example:
```kotlin
fun main(args: Array<String>){  
    val fruitName: String = fruits()  
    println(fruitName)  
}  

fun fruits(): String{  
    val str: String? ="abc"  
    
    val strLength: Int = if(str!= null) str.length else -1  
    val strLength2: Int = str?.length ?: -1  
    
    var string = "str = $str\n"+  
                "strLength = $strLength\n"+  
                "strLength2 = $strLength2\n\n"  
      
    fun check(textOne: String?, textTwo: String?): String? {  
        val textOne = textOne ?: return null  
        val textTwo = textTwo ?: IllegalArgumentException("text exception")  
      
        return "\ntextOne = $textOne\n"+  
                    "textTwo = $textTwo\n"  
    }  
    
    string += "check(null,\"mango\") = ${check(null,"mango")}\n" +  
                "check(\"apple\",\"orange\") = ${check("apple","orange")}\n"  
    return string  
}  
```









