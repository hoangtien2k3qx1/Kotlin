
## Kotlin MutableList (mutableListOf())
Kotlin MutableList is an interface and generic collection of elements.

### MutableList Interface Declaration
```kotlin
interface MutableList<E> : List<E>, MutableCollection<E> (source)  
```


### Function of Kotlin MutableList
| Function                                                              | 	Descriptions                                                                                                                                                                                                                                     |
|-----------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| abstract fun add(element: E): Boolean	                                | It adds the given element to the collection.                                                                                                                                                                                                      |
| abstract fun add(index: Int, element: E)	                             | It adds the element at specified index.                                                                                                                                                                                                           |
| abstract fun addAll(elements: Collection<E>): Boolean	                | It adds all the elements of given collection to current collection.                                                                                                                                                                               |
| abstract fun clear()	                                                 | It removes all the elements from this collection.                                                                                                                                                                                                 |
| abstract fun listIterator(): MutableListIterator<E>	                  | It returns a list iterator over the elements in proper sequence in current list.                                                                                                                                                                  |
| abstract fun listIterator(index: Int): MutableListIterator<E>	        | It returns a list iterator starting from specified index over the elements in list in proper sequence.                                                                                                                                            |
| abstract fun remove(element: E): Boolean	                             | It removes the specified element if it present in current collection.                                                                                                                                                                             |
| abstract fun removeAll(elements: Collection<E>): Boolean	             | It removes all the elements from the current list which are also present in the specified collection.                                                                                                                                             |
| abstract fun removeAt(index: Int): E	                                 | It removes element at given index from the list.                                                                                                                                                                                                  |
| abstract fun retainAll(elements: Collection<E>): Boolean	             | It retains all the elements within the current collection which are present in given collection.                                                                                                                                                  |
| abstract operator fun set(index: Int, element: E): E	                 | It replaces the element and add new at given index with specified element.                                                                                                                                                                        |
| abstract fun subList( fromIndex: Int, toIndex: Int): MutableList<E>	  | It returns part of list from specified fromIndex (inclusive) to toIndex (exclusive) from current list. The returned list is backed by current list, so non-structural changes in the returned list are reflected in current list, and vice-versa. |


#### Kotlin MutableList Example 1
```kotlin
fun main(args: Array<String>){  
    var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")  
  
    for(element in mutableList){  
        println(element)  
    }  
    println()  
    for(index in 0..mutableList.size-1){  
        println(mutableList[index])  
    }  
}  
```

Example:
```kotlin
fun main(args: Array<String>){
    var mutableList = mutableListOf<String>()

    mutableList.add("Ajay") // index 0  
    mutableList.add("Vijay") // index 1  
    mutableList.add("Prakash") // index 2  

    var mutableList2 = mutableListOf<String>("Rohan","Raj")
    var mutableList3 = mutableListOf<String>("Dharmesh","Umesh")
    var mutableList4 = mutableListOf<String>("Ajay","Dharmesh","Ashu")

    println(".....mutableList.....")
    for(element in mutableList){
        println(element)
    }
    println(".....mutableList[2].....")
    println(mutableList[2])
    mutableList.add(2,"Rohan")
    println("......mutableList.add(2,\"Rohan\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.add("Ashu")
    println(".....mutableList.add(\"Ashu\")......")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(1,mutableList3)
    println("... mutableList.addAll(1,mutableList3)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.addAll(mutableList2)
    println("...mutableList.addAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.remove("Vijay")
    println("...mutableList.remove(\"Vijay\")....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAt(2)
    println("....mutableList.removeAt(2)....")
    for(element in mutableList){
        println(element)
    }
    mutableList.removeAll(mutableList2)
    println("....  mutableList.removeAll(mutableList2)....")
    for(element in mutableList){
        println(element)
    }

    println("....mutableList.set(2,\"Ashok\")....")
    mutableList.set(2,"Ashok")
    for(element in mutableList){
        println(element)
    }

    println(".... mutableList.retainAll(mutableList4)....")
    mutableList.retainAll(mutableList4)
    for(element in mutableList){
        println(element)
    }
    println(".... mutableList2.clear()....")
    mutableList2.clear()

    for(element in mutableList2){
        println(element)
    }
    println(".... mutableList2 after mutableList2.clear()....")
    println(mutableList2)

    println("....mutableList.subList(1,2)....")
    println(mutableList.subList(1,2))

}  
```

### Output:
```kotlin
.....mutableList.....
Ajay
Vijay
Prakash
.....mutableList[2].....
Prakash
......mutableList.add(2,"Rohan")......
Ajay
Vijay
Rohan
Prakash
.....mutableList.add("Ashu")......
Ajay
Vijay
Rohan
Prakash
Ashu
... mutableList.addAll(1,mutableList3)....
Ajay
Dharmesh
Umesh
Vijay
Rohan
Prakash
Ashu
...mutableList.addAll(mutableList2)....
Ajay
Dharmesh
Umesh
Vijay
Rohan
Prakash
Ashu
Rohan
Raj
...mutableList.remove("Vijay")....
Ajay
Dharmesh
Umesh
Rohan
Prakash
Ashu
Rohan
Raj
....mutableList.removeAt(2)....
Ajay
Dharmesh
Rohan
Prakash
Ashu
Rohan
Raj
....  mutableList.removeAll(mutableList2)....
Ajay
Dharmesh
Prakash
Ashu
....mutableList.set(2,"Ashok")....
Ajay
Dharmesh
Ashok
Ashu
.... mutableList.retainAll(mutableList4)....
Ajay
Dharmesh
Ashu
.... mutableList2.clear()....
.... mutableList2 after mutableList2.clear()....
[]
....mutableList.subList(1,2)....
[Dharmesh]
```






