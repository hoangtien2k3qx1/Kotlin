
## Kotlin ArrayList class
- Kotlin ArrayList class is used to create a dynamic array. 
- Which means the size of ArrayList class can be increased or decreased according to requirement. 


## Constructor of Kotlin ArrayList
| Constructor                         | Description                                                               |
|-------------------------------------|---------------------------------------------------------------------------|
| ArrayList<E>()	                     | It is used to create an empty ArrayList                                   |
| ArrayList(capacity: Int)	           | It is used to create an ArrayList of specified capacity.                  |
| ArrayList(elements: Collection<E>)	 | It is used to create an ArrayList filled from the elements of collection. |


## Functions of Kotlin ArrayList
| Function                                                       | Description                                                                                                                                           |
|----------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| open fun add(element: E): Boolean	                             | It is used to add the specific element into the collection.                                                                                           |
| open fun add(index: Int, element: E)	                          | It is used to insert an element at specific index.                                                                                                    |
| open fun addAll(elements: Collection<E>): Boolean	             | It is used to add all the elements in the specified collection to current collection.                                                                 |
| open fun addAll(index: Int, elements: Collection<E>): Boolean	 | It is used to add all the elements of specified collection into the current list at the specified index.                                              |
| open fun clear()	                                              | It is used to removes all elements from the collection.                                                                                               |
| open fun get(index: Int): E	                                   | It is used to return the element at specified index in the list.                                                                                      
| open fun indexOf(element: E): Int	                             | It is used to return the index of first occurrence of specified element in the list or return -1 if the specified element in not present in the list. |
| open fun lastIndexOf(element: E): Int	                         | It is used to return the last occurrence of given element from the list or it returns -1 if the given element is not present in the list.             |
| open fun remove(element: E): Boolean	                          | It is used to remove a single instance of the specific element from current collection, if it is available.                                           |
| open fun removeAt(index: Int): E	                              | It is used to remove the specific index element from the list.                                                                                        |
| open fun set(index: Int, element: E): E	                       | It is used to replaces the element from the specified position from current list with the specified element.                                          |
| open fun toArray(): Array<Any?>	                               | It is used to return new array of type Array<Any?> with the elements of this collection.                                                              |
| open fun toString(): String	                                   | It is used to returns a string representation of the object.                                                                                          |
| fun trimToSize()	                                              | It does nothing in this ArrayList implementation.Function	Description                                                                                 |
| open fun add(element: E): Boolean	                             | It is used to add the specific element into the collection.                                                                                           |
| open fun add(index: Int, element: E)	                          | It is used to insert an element at specific index.                                                                                                    |
| open fun addAll(elements: Collection<E>): Boolean	             | It is used to add all the elements in the specified collection to current collection.                                                                 |
| open fun addAll(index: Int, elements: Collection<E>): Boolean	 | It is used to add all the elements of specified collection into the current list at the specified index.                                              |
| open fun clear()	                                              | It is used to removes all elements from the collection.                                                                                               |
| open fun get(index: Int): E	                                   | It is used to return the element at specified index in the list.                                                                                      |
| open fun indexOf(element: E): Int	                             | It is used to return the index of first occurrence of specified element in the list or return -1 if the specified element in not present in the list. |
| open fun lastIndexOf(element: E): Int	                         | It is used to return the last occurrence of given element from the list or it returns -1 if the given element is not present in the list.             |
| open fun remove(element: E): Boolean	                          | It is used to remove a single instance of the specific element from current collection, if it is available.                                           |
| open fun removeAt(index: Int): E	                              | It is used to remove the specific index element from the list.                                                                                        |
| open fun removeRange(startIndex: Int, endIndex: Int)	          | Its remove the range of elements starting from startIndex to endIndex in which endIndex is not includes.                                              |
| open fun set(index: Int, element: E): E	                       | It is used to replaces the element from the specified position from current list with the specified element.                                          |
| open fun toArray(): Array<Any?>	                               | It is used to return new array of type Array<Any?> with the elements of this collection.                                                              |
| open fun toString(): String	                                   | It is used to returns a string representation of the object.                                                                                          |
| fun trimToSize()	                                              | It does nothing in this ArrayList implementation.                                                                                                     |


## Kotlin ArrayList Example 1- empty ArrayList
```kotlin
fun main(args: Array<String>){

    val arrayList: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("Ajay")
    list.add("Vijay")
    list.add("Prakash")

    arrayList.addAll(list)
    println("......print ArrayList......")
    val itr = arrayList.iterator()
    while(itr.hasNext()) {
        println(itr.next())
    }
    println("size of arrayList = "+arrayList.size)
    
}  
```


## Kotlin ArrayList: arrayListOf()

#### Syntax of arrayListOf() function
```kotlin
inline fun <T> arrayListOf(): ArrayList<T> (source)

fun <T> arrayListOf(vararg elements: T): ArrayList<T> (source)  
```

















