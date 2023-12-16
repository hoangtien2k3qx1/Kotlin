
## Kotlin Data Type
Kotlin built in data type are categorized as following different categories:

- Number
- Character
- Boolean
- Array
- String


## Number Types
Number types of data are those which hold only number type data variables. It is further categorized into different Integer and Floating point.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/a4acfd17-a508-4c82-91b3-fa88ca9001a4)

## Character (Char) Data Type
Characters are represented using the keyword Char. Char types are declared using single quotes ('').
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/0d4a32be-6565-491a-9b0d-bfa4145bf78f)
```kotlin
val value1 = 'A'  
//or  
val  value2: Char  
value2= 'A'  
```

## Boolean Data Types
Boolean data is represented using the type Boolean. It contains values either true or false.
![image](https://github.com/hoangtien2k3qx1/Kotlin/assets/122768076/a0f19cbd-79b5-41b4-8ae5-8158d756e5cf)
```kotlin
val flag = true  
```

## Array
Arrays in Kotlin are represented by the Array class. Arrays are created using library function arrayOf() and Array() constructor. Array has get (), set() function.
- Creating Array using library function arrayOf()
```kotlin
val id = arrayOf(1,2,3,4,5)  
val firstId = id[0]  
val lasted = id[id.size-1]  
```

- Creating Array using Array() constructor
```kotlin
val asc = Array(5, { i -> i * 2 }) //asc[0,2,4,6,8]  
```

## String
String in Kotlin is represented by String class. String is immutable, which means we cannot change the elements in String.

- String declaration:
```kotlin
val text = "Hello, JavaTpoint"  
```

Types of String:
1. `Escaped String`: Escape String is declared within double quote (" ") and may contain escape characters like '\n', '\t', '\b' etc.
```kotlin
val text1 ="Hello, JavaTpoint"  
//or  
val text2 ="Hello, JavaTpoint\n"  
//or  
val text3 ="Hello, \nJavaTpoint"  
```

2. `Raw String`: Row String is declared within triple quote (""" """). It provides facility to declare String in new lines and contain multiple lines. Row String cannot contain any escape character.
```kotlin
val text1 = """  
             Welcome   
             To  
             JavaTpoint  
    """  
```











