
## Kotlin HashMap Class

Constructor of Kotlin HashMap class

| Constructor                                            | 	Description                                                                     |
|--------------------------------------------------------|----------------------------------------------------------------------------------|
| HashMap()                                              | 	It constructs an empty HashMap instance                                         |
| HashMap(initialCapacity: Int, loadFactor: Float = 0f)	 | It is used to constructs a HashMap of specified capacity.                        |
| HashMap(original: Map<out K, V>)	                      | It constructs a HashMap instance filled with contents of specified original map. |


Functions of Kotlin HashMap class

| Functions                                  | 	Description                                                                                 |
|--------------------------------------------|----------------------------------------------------------------------------------------------|
| open fun put(key: K, value: V): V?	        | It puts the specified key and value in the map                                               |
| open operator fun get(key: K): V?	         | It returns the value of specified key, or null if no such specified key is available in map. |
| open fun containsKey(key: K): Boolean	     | It returns true if map contains specifies key.                                               |
| open fun containsValue(value: V): Boolean	 | It returns true if map maps one of more keys to specified value.                             |
| open fun clear()	                          | It removes all elements from map.                                                            |
| open fun remove(key: K): V?	               | It removes the specified key and its corresponding value from map                            |


Example:
```kotlin
fun main(args: Array<String>){  
  
    val hashMap:HashMap<Int,String> = HashMap<Int,String>()  
    hashMap.put(1,"Ajay")  
    hashMap.put(3,"Vijay")  
    hashMap.put(4,"Prakash")  
    hashMap.put(2,"Rohan")  
  
    println(".....traversing hashmap.......")  
    for(key in hashMap.keys){  
        println("Element at key $key = ${hashMap[key]}")  
    }  
  
    hashMap.replace(3,"Ashu")  
    hashMap.put(2,"Raj")  
    println(".....hashMap.replace(3,\"Ashu\")... hashMap.replace(2,\"Raj\").......")....")  
    for(key in hashMap.keys){  
        println("Element at key $key = ${hashMap[key]}")  
    }  
}  
```


## Kotlin HashMap: hashMapOf()
- A hashMapOf() is a function of HashMap class. 
- It returns a new HashMap with the specified contents.

Syntax of hashMapOf() function
```kotlin
inline fun <K, V> hashMapOf(): HashMap<K, V> (source)

fun <K, V> hashMapOf(vararg pairs: Pair<K, V>): HashMap<K, V> (source)  
```

Functions of Kotlin HashMap class

| Function                                   | Description                                                                                  |
|--------------------------------------------|----------------------------------------------------------------------------------------------|
| open fun put(key: K, value: V): V?	        | It puts the specified key and value in the map                                               |
| open operator fun get(key: K): V?	         | It returns the value of specified key, or null if no such specified key is available in map. |
| open fun containsKey(key: K): Boolean	     | It returns true if map contains specifies key.                                               |
| open fun containsValue(value: V): Boolean	 | It returns true if map maps one of more keys to specified value.                             |
| open fun clear()	                          | It removes all elements from map.                                                            |
| open fun remove(key: K): V?	               | It removes the specified key and its corresponding value from map                            |


Example:
```kotlin
fun main(args: Array<String>){  
  
    val intMap: HashMap<Int, String> = hashMapOf<Int,String>(1 to "Ashu",4 to "Rohan", 2 to "Ajeet", 3 to "Vijay")  
  
    val stringMap: HashMap<String,String> = hashMapOf<String,String>("name" to "Ashu")  
    stringMap.put("city", "Delhi")  
    stringMap.put("department", "Development")  
    stringMap.put("hobby", "Playing")  
    val anyMap: HashMap<Any, Any> = hashMapOf<Any, Any>(1 to "Ashu", "name" to "Rohsan", 2 to 200)  
    println(".....traverse intMap........")  
    for(key in intMap.keys){  
        println(intMap[key])  
    }  
    println("......traverse stringMap.......")  
    for(key in stringMap.keys){  
        println(stringMap[key])  
    }  
    println("......traverse anyMap.......")  
    for(key in anyMap.keys){  
        println(anyMap[key])  
    }  
}  
```



