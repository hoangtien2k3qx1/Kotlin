
## Kotlin Array

### Constructor of array:
Array constructor is declared with specified size and init function

Syntax:
```kotlin
Array(size: Int, init: (Int) -> T)  
```

## Kotlin array declaration - using arrayOf() function
```kotlin
var myArray1 = arrayOf(1,10,4,6,15)  
var myArray2 = arrayOf<Int>(1,10,4,6,15)  
val myArray3 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")  
var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")  
```

## Kotlin array declaration - using intArrayOf() function
```kotlin
var myArray5: IntArray = intArrayOf(5,10,20,12,15)  
```

## Modify and access elements of array
Kotlin has set() and get() functions that can direct modify and access the particular element of array respectively.

Kotlin array set() function example
```kotlin
fun main(args: Array<String>) {  
val array1 = arrayOf(1,2,3,4)  
val array2 = arrayOf<Long>(11,12,13,14)  
    array1.set(0,5)  
    array1[2] = 6  
  
    array2.set(2,10)  
    array2[3] = 8  
  
    for(element in array1){  
println(element)  
    }  
println()  
    for(element in array2){  
println(element)  
    }  
}  
```

## Kotlin array get() function example
```kotlin
fun main(args: Array<String>) {  
    val array1 = arrayOf(1,2,3,4)  
    val array2 = arrayOf<Long>(11,12,13,14)  
    println(array1.get(0))  
    println(array1[2])  
    println()  
    println(array2.get(2))  
    println(array2[3])  
      
}  
```




