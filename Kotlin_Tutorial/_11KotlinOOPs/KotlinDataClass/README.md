
## Kotlin Data class
- Data class is a simple class which is used to hold data/state and contains standard functionality.
- A data keyword is used to declare a class as a data class.
- Declaring a data class must contains at least one primary constructor with property argument (val or var).

```kotlin
data class User(val name: String, val age: Int)  
```

Data class internally contains the following functions:

- `equals()`: Boolean
- `hashCode()`: Int
- `toString()`: String
- `component()`: functions corresponding to the properties
- `copy()`


## Requirements of data class
In order to create a data class, we need to fulfill the following requirements:

- Contain primary constructor with at least one parameter.
- Parameters of primary constructor marked as val or var.
- Data class cannot be abstract, inner, open or sealed.
- Before 1.1,data class may only implements interface. After that data classes may extend other classes.










