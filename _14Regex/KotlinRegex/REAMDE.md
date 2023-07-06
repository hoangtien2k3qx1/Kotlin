
## Kotlin Regex

#### Kotlin Regex Constructor
```kotlin
Regex(pattern: String)

Regex(pattern: String, option: RegexOption)

Regex(pattern: String, options: Set<RegexOption>)
```

Example:
```kotlin
fun main(args: Array<String>){  
    val regex = Regex(pattern = "ko")  
    val matched = regex.containsMatchIn(input = "kotlin")  
    println(matched)  // true
}  
```

## Regex example of `containsMatchIn()`
- `containsMatchIn()` kiểm tra xem chuỗi đầu vào có chứa một phần tử khớp với biểu thức chính quy hay không.

```kotlin
fun main(args: Array<String>){
    val regex = """a([bc]+)d?""".toRegex()  
    val matched = regex.containsMatchIn(input = "xabcdy")  
    println(matched) // true
}  
```

## Regex example of `matches`(input: CharSequence): Boolean
-  `matches()` kiểm tra xem chuỗi `input` có khớp hoàn toàn với biểu thức chính quy đã xác định bởi đối tượng `regex` hay không.

```kotlin
fun main(args: Array<String>){
    val regex = """a([bc]+)d?""".toRegex()  
    val matched1 = regex.matches(input = "xabcdy")  
    val matched2 = regex.matches(input = "xabcdyabcd")  
    val matched3 = regex.matches(input = "abcd")  
    println(matched1)  // false
    println(matched2)  // false
    println(matched3)  // true
}  
```

## Regex example of `matchEntire`(input: CharSequence): MatchResult?


```kotlin
fun main(args: Array<String>){
    val regex = Regex("abcd")  
    val matchResult1 = regex.matchEntire("abcd")?.value  
    val matchResult2 = regex.matchEntire("abcda")?.value  
      
    val matchResult3 = Regex("""\d+""").matchEntire("100")?.value    
    val matchResult4 = Regex("""\d+""").matchEntire("100 dollars")?.value  
      
    println(matchResult1)  // abcd
    println(matchResult2)  // null
    println(matchResult3)  // 100
    println(matchResult4)  // null
}  
```


## Regex example offind(input: CharSequence, startIndex: Int = 0): MatchResult?

```kotlin
fun main(args: Array<String>){
    val emailParttern = Regex("""\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}""")  
    val email :String? = emailParttern.find("this is my email mymail@google.com")?.value  
    println(email)  // mymail@google.com
    val phoneNumber :String? = Regex(pattern = """\d{3}-\d{3}-\d{4}""").find("phone: 123-456-7890, e..")?.value   
    println(phoneNumber)  // 123-456-7890
}  
```

## Regex example offindAll(input: CharSequence, startIndex: Int = 0): Sequence<MatchResult>

```kotlin
fun main(args: Array<String>){  
    val foundResults = Regex("""\d+""").findAll("ab12cd34ef 56gh7 8i")  
    val result = StringBuilder()  
    for (findText in foundResults) {  
        result.append(findText.value + " ")  
    }  
    println(result)  // 12 34 56 7 8
}  
```

## Regex example ofreplace(input: CharSequence, replacement: String): String

```kotlin
fun main(args: Array<String>){  
    val replaceWith = Regex("beautiful")  
    val resultString = replaceWith.replaceFirst("nature is beautiful, beautiful is nature","awesome")  
    println(resultString)  // nature is awesome, beautiful is nature
}  
```

## Regex example ofsplit(input: CharSequence, limit: Int = 0): List<String>

```kotlin
fun main(args: Array<String>){  
    val splitedValue = Regex("""\d+""").split("ab12cd34ef")  
    val nonsplited= Regex("""\d+""").split("nothing match to split" )  
    println(splitedValue)  // [ab, cd, ef]
    println(nonsplited)    // [nothing match to split]
}  
```
