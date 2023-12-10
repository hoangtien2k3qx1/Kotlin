
## Integral Type Ranges

=> sẽ không in ra gì cả
```kotlin
for (a in 5..1){
    print(a )// print nothing
}
```

=> thay vào đó hãy sử dụng library `downTo()` functio
```kotlin
for (a in 5 downTo 1){  
    print(a )// 54321  
}
```

## until range
- The `until()` function or until keyword in range is used to exclude the last element. 

=> khi sử dụng `until()` function: nó sẽ không lấy phần tử cuối cùng.
```kotlin
for (a in 1 until 5){  
    print(a ) // print 1234  
}  
```

## Kotlin range of integer
```kotlin
fun main(args: Array<String>) {
    for (x in 1..5)
        print(x)
    println()
    for (x in 5 downTo 1)
        print(x)
    println()
    for (x in 1.rangeTo(5))
        print(x)
    println()
    for (x in 5.downTo(1))
        print(x)
    println()
}  
```

## Kotlin range of characters
```kotlin
fun main(args: Array<String>) {
    for(x in 'a'..'e')
        print("$x ") // a b c d e

    println()

    for (x in 'e' downTo 'a')
        print("$x ") // e d c b a
}
```

## Kotlin range step
```kotlin
fun main(args: Array<String>) {
    for (x in 1..10 step 2)
        print("$x ") // 1 3 5 7 9

    println()

    for (x in 10 downTo 1 step 3)
        print("$x ") // 10 7 4 1
}
```

## Kotlin range iterator
- An iterator() method is also be used to iterate the range value.
- It uses hasNext() method which checks the next element in the range and next() method returns the next element of the range.

```kotlin
fun main(args: Array<String>) {
    val chars = ('a'..'e')
    val it = chars.iterator()
    while (it.hasNext()) {
        val x = it.next()
        print("$x ") // a b c d e
    }
} 
```




