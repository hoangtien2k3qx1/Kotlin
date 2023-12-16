
## Kotlin List Interface
- Kotlin List is an interface and generic collection of elements. 
- The List interface inherits form Collection<T> class. It is immutable and its methods supports only read functionalities.

## List Interface Declaration
```kotlin
public interface List<out E> : Collection<E> (source)  
```

## Function of Kotlin List Interface
| Functions                                                  | Descriptions                                                                                                                        |
|------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|
| abstract fun contains(element: E): Boolean                 | It checks specified element is contained in this collection.                                                                        |
| abstract fun containsAll(elements: Collection<E>): Boolean | It checks all elements specified are contained in this collection.                                                                  |
| abstract operator fun get(index: Int): E                   | It returns the element at given index from the list.                                                                                |
| abstract fun indexOf(element: E): Int                      | Returns the index of first occurrence of specified element in the list, or -1 if specified element is not present in list.          |
| abstract fun isEmpty(): Boolean                            | It returns the true if list is empty, otherwise false.                                                                              |
| abstract fun iterator(): Iterator<E>                       | 	It returns an iterator over the elements of this list.                                                                             |
| abstract fun lastIndexOf(element: E): Int                  | It returns the index of last occurrence of specified element in the list, or return -1 if specified element is not present in list. |
| abstract fun listIterator(): ListIterator<E>               | It returns a list iterator over the elements in proper sequence in current list.                                                    |
| abstract fun listIterator(index: Int): ListIterator<E>     | It returns a list iterator over the elements in proper sequence in current list, starting at specified index.                       |
| abstract fun subList(fromIndex: Int, toIndex: Int): List   | It returns a part of list between fromIndex (inclusive) to toIndex (exclusive).                                                     |


Example:
```kotlin
fun main(args: Array<String>) {
    var list = listOf("Ajay", "Vijay", "Prakash")//read only, fix-size  
    for (element in list) {
        println(element)
    }
}
```

Example:
```kotlin
fun main(args: Array<String>){  
    var list = listOf(1,2,3,"Ajay","Vijay","Prakash")//read only, fix-size  
    for(element in list){  
        println(element)  
    }  
    println()  
    for(index in 0..list.size-1){  
        println(list[index])  
    }  
}  
```












