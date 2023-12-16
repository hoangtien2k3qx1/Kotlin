
## Kotlin Set Interface
Kotlin Set interface is a generic unordered collection of elements.

Set Interface declaration
```kotlin
interface Set<out E> : Collection<E> (source)  
```


Functions of Set Interface

| Functions                                                                          | Description                                                                                                                                                                                                                                    |
|------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| abstract fun contains(element: E): Boolean	                                        | It checks the mention element is present in this collection. If it contains element, it returns true else returns false.                                                                                                                       |
| abstract fun containsAll(elements: Collection<E>): Boolean	                        | It checks all the mention elements of specified collection are present in this collection. If it contains element, it returns true else returns false.                                                                                         |
| abstract fun isEmpty(): Boolean	                                                   | It returns true if the collection is empty (contains no elements) otherwise it returns false.                                                                                                                                                  |
| abstract fun iterator(): Iterator<E>	                                              | It returns an iterator over the elements of set object.                                                                                                                                                                                        |
| fun <T> Iterable<T>.any(): Boolean	                                                | It returns true if the collection contains at least one element.                                                                                                                                                                               |
| fun <T> Iterable<T>.count(predicate: (T) -> Boolean): Int	                         | It returns the total number of elements matching with given predicate.                                                                                                                                                                         |
| fun <T> Iterable<T>.distinct(): List<T>	                                           | It returns a list which contains only distinct elements from the given collection.                                                                                                                                                             |
| fun <T> Iterable<T>.drop(n: Int): List<T>	                                         | It returns a list which contains all elements except first n elements.                                                                                                                                                                         |
| fun <T> Iterable<T>.elementAtOrElse(index: Int, defaultValue: (Int) -> T): T	      | It returns an element at given index or result of calling the defaultValue function if the index is out bounds in current collection.                                                                                                          |
| fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T>	                    | It returns a list which contains only those elements matches with given predicate.                                                                                                                                                             |
| fun <T> Iterable<T>.filterIndexed(predicate: (index: Int, T) -> Boolean): List<T>	 | It returns a list which contains only those elements matches with given predicate.                                                                                                                                                             |
| fun <T> Iterable<T>.filterNot(predicate: (T) -> Boolean): List<T>	                 | It returns a list which contains only those elements which does not matches with given predicate.                                                                                                                                              |
| fun <T> Iterable<T>.find(predicate: (T) -> Boolean): T?	                           | It returns the first element which matches with given predicate, or null if no such element was found.                                                                                                                                         |
| fun <T> Iterable<T>.findLast(predicate: (T) -> Boolean): T?	                       | It returns the last element which matches with given predicate, or null if no such element was found.                                                                                                                                          |
| fun <T> Iterable<T>.first(): T	                                                    | It returns the first element.                                                                                                                                                                                                                  |
| fun <T> Iterable<T>.first(predicate: (T) -> Boolean): T	                           | It returns the first element which matches the given predicate.                                                                                                                                                                                |
| fun <T> Iterable<T>.firstOrnull(): T?	                                             | It returns the first element or null if collection is empty.                                                                                                                                                                                   |
| fun <T> Iterable<T>.indexOf(element: T): Int	                                      | It returns the first index of given element, or -1 if element does not contains in collection.                                                                                                                                                 |
| fun <T> Iterable<T>.indexOfFirst(predicate: (T) -> Boolean): Int	                  | It returns the index of first element which matches the given predicate, or -1 if the element does not contains in collection.                                                                                                                 |
| fun <T> Iterable<T>.indexOfLast(predicate: (T) -> Boolean): Int	                   | It returns the index of last element which matches the given predicate, or -1 if the element does not contains in collection.                                                                                                                  |
| infix fun <T> Iterable<T>.intersect(other: Iterable<T>): Set<T>	                   | It returns a set which contains all elements present in both this set and given collection.                                                                                                                                                    |
| fun <T> Collection<T>.isNotEmpty(): Boolean	                                       | It returns true if is not empty.                                                                                                                                                                                                               |
| fun <T> Iterable<T>.last(): T	                                                     | It returns the last element.                                                                                                                                                                                                                   |
| fun <T> Iterable<T>.last(predicate: (T) -> Boolean): T	                            | It returns the last element which matches with given predicate.                                                                                                                                                                                |
| fun <T> Iterable<T>.lastIndexOf(element: T): Int	                                  | It returns the last index of given element, or -1 if element does not exist in collection.                                                                                                                                                     |
| fun <T> Iterable<T>.lastOrnull(): T?	                                              | It returns the last element of collection, or null if collection is empty.                                                                                                                                                                     |
| fun <T> Iterable<T>.lastOrnull(predicate: (T) -> Boolean): T?	                     | It returns the last element after matching the given predicate, or returns null if no such element found in collection.                                                                                                                        |
| fun <T : Comparable<T>> Iterable<T>.max(): T?	                                     | It returns the largest element or null if no elements in collection.                                                                                                                                                                           |
| fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T?	              | It returns the first element yielding the largest value of the given function, or it returns null if there are no elements in collection.                                                                                                      |
| fun <T : Comparable<T>> Iterable<T>.min(): T?	                                     | It returns the smallest element or null if there is no element in the collection.                                                                                                                                                              |
| fun <T, R : Comparable<R>> Iterable<T>.minBy(selector: (T) -> R): T?	              | It returns the first element which gives the smallest value of the given function or null if there are no elements.                                                                                                                            |
| operator fun <T> Set<T>.minus(element: T): Set<T>	                                 | It returns a set which contains all the elements of original set except those given element.                                                                                                                                                   |
| operator fun <T> Set<T>.minus(elements: Iterable<T>): Set<T>	                      | It returns a set which contains all the elements of original set except those given elements collection.                                                                                                                                       |
| operator fun <T> Iterable<T>.minus(element: T): List<T>	                           | It returns a list which contains all the elements of original collection except those contained in the given elements array.                                                                                                                   |
| fun <T> Set<T>.minusElement(element: T): Set<T>	                                   | It returns a set which contains all the elements of original set except those given element.                                                                                                                                                   |
| fun <T> Iterable<T>.minusElement(element: T): List<T>	                             | It returns a list which contains all the elements of original collection except the first occurrence of the given element.                                                                                                                     |
| operator fun <T> Set<T>.plus(element: T): Set<T>	                                  | It returns a set of all elements of original set as well as the given element if it is not already present in the set.                                                                                                                         |
| operator fun <T> Set<T>.plus(elements: Iterable<T>): Set<T>	                       | It returns a set which contains all the elements of original set as well as the given elements collection which are not already present in the set. The returned set preserves the iteration of element in the same order of the original set. |
| operator fun <T> Iterable<T>.plus(element: T): List<T>	                            | It returns a list which contains all the elements of the original collection as well as the given element.                                                                                                                                     |
| fun <T> Set<T>.plusElement(element: T): Set<T>	                                    | It returns a set which contains all the elements of the original set as well as the given element.                                                                                                                                             |
| fun <T> Iterable<T>.plusElement(element: T): List<T>	                              | It returns a list which contains all the elements of the original collection as well as the given element.                                                                                                                                     |
| fun <T> Iterable<T>.reversed(): List<T>	                                           | It returns a list with elements in the reverse order.                                                                                                                                                                                          |
| fun <T> Iterable<T>.single(): T	                                                   | It returns the single element, or it throws an exception if the collection has more than one elements or empty.                                                                                                                                |
| fun <T> Iterable<T>.singleOrnull(): T?	                                            | It returns a single element, or null if the collection has more than one element or it is empty.                                                                                                                                               |


Example:
```kotlin
fun main(args: Array<String>){  
    val intSet = setOf(2,6,4,29,4,5)  
    val mySet: Set<Any> = setOf(2,6,4,29,4,5,"Ashu","Ajay")  
    println(".......print Int set.........")  
    for(element in intSet){  
        println(element)  
    }  
    println(".......print Any set.........")  
    for(element in mySet){  
        println(element)  
    }  
  
}  
```




