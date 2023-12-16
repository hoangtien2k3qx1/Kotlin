
# Null safety in kotlin


## Nullable types and non-nullable types

```kotlin
var a: String = "abc" // Regular initialization means non-nullable by default
a = null // compilation error
```
`val l = a.length`

```kotlin
var b: String? = "abc" // can be set to null
b = null // ok
print(b)
```

`val l = b.length` // error: variable 'b' can be null

## Checking for null in conditions
```kotlin
val l = if (b != null) b.length else -1
```

```kotlin
val b: String? = "Kotlin"
if (b != null && b.length > 0) {
    print("String of length ${b.length}")
} else {
    print("Empty string")
}
```

## Safe calls

[the safe call operator]() `?.`

```kotlin
val a = "Kotlin"
val b: String? = null
println(b?.length)
println(a?.length) // Unnecessary safe call
```

```kotlin
fun main() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
}
```

## Nullable receiver

```kotlin
var timestamp: Instant? = null
val isoTimestamp = timestamp?.toString() // Returns a String? object which is `null`
if (isoTimestamp == null) {
   // Handle the case where timestamp was `null`
}
```

## Elvis operator

The same `Java`
```java
val l: Int = if (b != null) b.length else -1

val l: Int = (b != null) ? b.length : -1
```


`Kotlin`
```kotlin
val l = b?.length ?: -1
```

## The `!!` operator

```kotlin
// nếu biến b null thì nó `vẫn ép` cho truy cập length
val l = b!!.length
```

## Safe casts

```kotlin
val aInt: Int? = a as? Int
```

## Collections of a nullable type
```kotlin
val nullableList: List<Int?> = listOf(1, 2, null, 4)
val intList: List<Int> = nullableList.filterNotNull()
```
