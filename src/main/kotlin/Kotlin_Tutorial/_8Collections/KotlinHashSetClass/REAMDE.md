
## Kotlin HashSet class

HashSet class declaration
```kotlin
open class HashSet<E> : AbstractMutableSet<E> (source)  
```

Constructor of Kotlin HashSet class

| Constructor                                            | 	Description                                                               |
|--------------------------------------------------------|----------------------------------------------------------------------------|
| HashSet()                                              | 	It constructs an empty HashSet instance                                   |
| HashSet(initialCapacity: Int, loadFactor: Float = 0f)	 | It is used to constructs a HashSet of specified capacity.                  |           
| HashSet(elements: Collection<E>)                       | 	It constructs a HashSet instance using elements of specified collection.  |


## Functions of Kotlin HashSet class

| Functions                                        | 	Description                                                                                                                     |
|--------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| open fun add(element: E): Boolean	               | It adds the given element to the collection.                                                                                     |                                                 
| open operator fun contains(element: E): Boolean	 | It checks the specified element is present in current collection.                                                                |                                                        
| open fun isEmpty(): Boolean	                     | It checks the current collection is empty (not contain any element). If found collection is empty returns true otherwise false.  |
| open fun iterator(): MutableIterator<E>	         | It returns an iterator over the elements of current object.                                                                      |          
| open fun remove(element: E): Boolean	            | It removes the mention element if present in current collection. It returns true if it removes otherwise false.                  |            
| open fun clear()	                                | It deletes all the elements from this collection.                                                                                |


Example:
```kotlin
fun main(args: Array<String>){  
    var hashSet = HashSet<Int>(6)  
    hashSet.add(2)  
    hashSet.add(13)  
    hashSet.add(6)  
    hashSet.add(5)  
    hashSet.add(2)  
    hashSet.add(8)  
    println("......traversing hashSet......")  
    for (element in hashSet){  
        println(element)  
    }      
}  
```

Example:
```kotlin
fun main(args: Array<String>){  
    var hashSetOf1 = hashSetOf<Int>(2,13,6,5,2,8)  
    var hashSetOf2: HashSet<String> = hashSetOf<String>("Vijay","Ashu" ,"Vijay","Roshan")  
    println("......traversing hashSetOf1......")  
    for (element in hashSetOf1){  
        println(element)  
    }  
    println("......traversing hashSetOf2......")  
    for (element in hashSetOf2){  
        println(element)  
    }  
}  
```
