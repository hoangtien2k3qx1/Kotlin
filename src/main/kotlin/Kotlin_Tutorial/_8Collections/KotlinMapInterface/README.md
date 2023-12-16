
## Kotlin Map Interface

#### Map Interface Declaration
```kotlin
interface Map<K, out V> (source) 
```

Kotlin Map Interface Example 1
```kotlin
fun main(args: Array<String>){  
  
    val myMap = mapOf<Int,String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")  
    for(key in myMap.keys){  
        println(myMap[key])  
    }  
}  
```


























