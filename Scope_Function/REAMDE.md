
## Scope Function:

Kotlin cung cấp nhiều function như một block code trên 1 project. Các function này được gọi là scope function,
vì chúng tạo ra một scope tạm thời để thực hiện blog code.

Các scope function này là: `let`, `apply`, `with`, `also`, `run`, `takeIf`, `takeUnless`


| Function | Object reference | Return value   | is extention function |
|----------|------------------|----------------|-----------------------|
| let      | it               | lambda result  | yes                   |
| run      | this             | lambda result  | yes                   |
| with     | this             | lambda result  | no                    |
| apply    | this             | context object | yes                   |
| also     | it               | context object | yes                   |


- Executing a lambda on non-nullable objects: `let`
- Introducing an expression as a variable in local scope: `let`
- Object configuration: `apply`
- Object configuration and computing the result: `run`
- Running statements where an expression is required: `non-extension run`
- Additional effects: `also`
- Grouping function calls on an object: `with`


## Note Scope Function Kotlin:

| return             | [it]()   | [this]()  |
|--------------------|----------|-----------|
| [context object]() | `also`   | `apply`   |
| [lambda result]()  | `let`    | `run`     |


## Context objet:
The return value of apply and also is the context object itself.
```kotlin
val numberList = mutableListOf<Double>()
numberList.also { println("Populating the list") }
    .apply {
        add(2.71)
        add(3.14)
        add(1.0)
    }
    .also { println("Sorting the list") }
    .sort()
```

=> Populating the list \nSorting the list \n[1.0, 2.71, 3.14]

```kotlin
fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        writeToLog("getRandomInt() generated value $it")
    }
}

val i = getRandomInt()
```

=> getRandomInt() generated value 93

## Lambda result:
```kotlin
val numbers = mutableListOf("one", "two", "three")
val countEndsWithE = numbers.run { 
    add("four")
    add("five")
    count { it.endsWith("e") }
}
println("There are $countEndsWithE elements that end with e.")
```

=> There are 3 elements that end with e.

```kotlin
val numbers = mutableListOf("one", "two", "three")
with(numbers) {
    val firstItem = first()
    val lastItem = last()        
    println("First item: $firstItem, last item: $lastItem")
}
```

=> First item: one, last item: three








