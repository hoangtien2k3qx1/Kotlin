
## Kotlin String
- The String class represents an array of char types. 
- Strings are immutable which means the length and elements cannot be changed after their creation.

```kotlin
val ch = charArrayOf('h', 'e', 'l', 'l', 'o')  
val st = String(ch)  
```

```kotlin
val str1 = "Hello, javaTpoint"  // chuỗi thông thường
val str2 = """Welcome To JavaTpoint"""  // multiline string hay raw string: chuỗi nhiều dòng
```

```kotlin
fun main(args: Array<String>) {  
    val a = 10  
    val b = 5  
      
    val myString = """value $a  
            |is greater than value $b  
        """.trimMargin()  
    println("${myString.trimMargin()}")  
}  
```

## Kotlin String Property
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/04a5ed84-1d07-440d-9451-22bb1f2923b8)

## String Function

| Functions                                                                                | Description                                                                                                                                                |
|------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `compareTo(other: String): Int`                                                          | It returns zero if current is equals to specified other object.                                                                                            |
| `get(index: Int): Char`                                                                  | It returns the character at given index from the current character sequence.                                                                               |
| `plus(other: Any?): String`                                                              | It returns the concatenate string with the string representation of the given other string.                                                                |
| `subSequence(startIndex: Int,endIndex: Int): CharSequence`                               | It returns the new character sequence from current character sequence, starting from startIndex to endIndex.                                               |
| `CharSequence.contains(other: CharSequence, ignoreCase: Boolean = false):Boolean`        | It returns true if the character sequence contains the other specified character sequence.                                                                 |
| `CharSequence.count(): Int`                                                              | It returns the length of char sequence.                                                                                                                    |
| `String.drop(n: Int): String`                                                            | It returns a string after removing the first n character.                                                                                                  |
| `String.dropLast(n: Int): String`                                                        | It returns a string after removing the last n character.                                                                                                   |
| `String.dropWhile(predicate: (Char) -> Boolean): String`                                 | It returns a character sequence which contains all the characters, except first characters which satisfy the given predicate.                              |
| `CharSequence.elementAt(index: Int): Char`                                               | It returns a character at the given index or throws an IndexOutOfBoundsException if the index does not exist in character sequence.                        |
| `CharSequence.indexOf(char: Char, startIndex: Int = 0,ignoreCase: Boolean = false): Int` | It returns the index of first occurrence of the given character, starting from the given index value.                                                      |
| `CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int`                           | It returns the index of first character which match the given predicate, or -1 if the character sequence not contains any such character.                  |
| `CharSequence.indexOfLast(predicate: (Char) -> Boolean): Int`                            | It returns the index of last character which match the given predicate, or -1 if the character sequence not contains any such character.                   |
| `CharSequence.getOrElse(index: Int, defaultValue: (Int) ->Char): Char`                   | It returns the character at specified index or the result of calling the defaultValue function if the index is out of bound of current character sequence. |
| `CharSequence.getOrNull(index: Int): Char?`                                              | It returns a character at the given index or returns null if the index is out of bound from character sequence.                                            |


## String elements and templates

String elements
```kotlin
val str ="Hello, javatpoint"  
println(str[0]) //prints H  
```

String template as variable name:
```kotlin
val i = 10  
print("i = $i") // i = 10  
  
fun main(args: Array<String>) {  
    val i = 10  
    print("i = $i") // i = 10  
}  
```

## Kotlin String Literals
Kotlin has two types of string literals:
- Escaped String: chuỗi thoát
- Raw String: chuỗi thô

Escaped String: chuỗi thoát
```kotlin
val text1 ="Hello, JavaTpoint"  
//or  
val text2 ="Hello, JavaTpoint\n"  
//or  
val text3 ="Hello, \nJavaTpoint"  
```

Raw String: chuỗi thô
```kotlin
val text1 = """  
             Welcome   
             To  
             JavaTpoint  
        """  
```


## String trimMargin() function
```kotlin
fun main(args: Array<String>) {
    
    val text = """Kotlin official language  
            |announce by Google   
            |android application development  
        """.trimMargin()  
    
    println(text)  
}  


Kết quả:
    Kotlin official language
    announce by Google 
    android application development
```

```kotlin
fun main(args: Array<String>) {  
  
    val text = """Kotlin is official language  
            #announce by Google for  
            #android application development  
        """.trimMargin("#")  
    
    println(text)  
    
}  
```

## Kotlin String Equality
In Kotlin, strings equality comparisons are done on the basis of structural equality `(==)` and referential equality `(===)`.

### + Structural equality `(==)`:
To check the two objects containing the same value, we use == operator or != operator for negation. It is equivalent to equals() in java.
````kotlin
fun main(args: Array<String>) {  
    val str1 = "Hello, World!"  
    val str2 = "Hello, World!"  
    println(str1 == str2) //true  
    println(str1 != str2) //false  
}  
````

### + Referential equality `(===)`:
To check the two different references point to the same instance, we use === operator. The !== operator is used for negation. a === b specifies true if and only if a and b both point to the same object.
```kotlin
fun main(args: Array<String>) {  
    val str1 = buildString { "string value" }  
    val str2 = buildString { "string value" }  
    println(str1 === str2)  // false
    println(str1 !== str2)  // true
}  
```

