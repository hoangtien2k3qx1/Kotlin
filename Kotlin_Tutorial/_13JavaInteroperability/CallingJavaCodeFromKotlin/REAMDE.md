
## Calling Java code from Kotlin

### Calling Java void method form Kotlin file

=> `MyKotlinFile.kt`
```kotlin
fun main(args: Array<String>) {  
    val sum = MyJavaClass.add(5, 10)  
    println("printing sum inside Kotlin file: "+sum)  
}  
```

=> `MyJavaClass.java`
```kotlin
public class MyJavaClass {  
    public static void main(String[] args){  
  
    }  
    
    public static void add(int a, int b){  
        int result = a + b;  
        System.out.println("printing inside Java class :"+result);  
    }  
}  
```


## Kotlin code calling Java class present inside package

=> `MyKotlinFile.kt`

```kotlin
fun main(args: Array<String>) {
    val area: Int = MyJavaClass.area(3, 4)
    println("printing area from java inside Kotlin file: $area")
}  
```

=> `MyJavaClass.java`
```Java
public class MyJavaClass {  
    public static void main(String[] args){  
  
    }  
    
    public static int area(int l, int b){  
        int result = l * b;  
        return result;  
    }  
}  
```


## Kotlin code access Java getter and setter

=> `MyJava.java`
```Java
public class MyJava{  
    protected String firstName;  
    protected String lastName;  
  
    public String getfirstName() {  
        return firstName;  
    }  
    
    public void setfirstName(String firstName) {  
        this.firstName = firstName;  
    }  
    
    public String getlastName() {  
        return lastName;  
    }  
    
    public void setlastName(String lastName) {  
        this.lastName = lastName;  
    }  
}  
```

=> `MyKotlin.kt`
```kotlin
fun main(args: Array<String>) {  
    val myJava = MyJava()  
      
    myJava.lastName = "Kumar"  
    myJava.setfirstName("Arjun")  
      
    println("accessing value using property: "+myJava.firstName)  
    println("accessing value using property: "+myJava.lastName)  
      
    println("accessing value using method: "+myJava.getfirstName())  
    println("accessing value using method: "+myJava.getlastName())  
}  
```


## Kotlin and Java Mapped types

=> `Java's primitive` types to corresponding Kotlin types

| Java type   | 	Kotlin type    |
|-------------|-----------------|
| byte	       | kotlin.Byte     |
| short	      | kotlin.Short    |
| int	        | kotlin.Int      |
| long	       | kotlin.Long     |
| char	       | kotlin.Char     |
| double	     | kotlin.Double   |
| boolean	    | kotlin.Boolean  |


=> `Java's non-primitive` types to corresponding Kotlin types

| Java type               | 	Kotlin type          |
|-------------------------|-----------------------|
| java.lang.Object	       | kotlin.Any!           |
| java.lang.Cloneable	    | kotlin.Cloneable!     |
| java.lang.Comparable	   | kotlin.Comparable!    |
| java.lang.Enum	         | kotlin.Enum!          |
| java.lang.Annotation	   | kotlin.Annotation!    |
| java.lang.Deprecated	   | kotlin.Deprecated!    |
| java.lang.CharSequence	 | kotlin.CharSequence!  |
| java.lang.String	       | kotlin.String!        |
| java.lang.Number	       | kotlin.Number!        |
| java.lang.Throwable	    | kotlin.Throwable!     |


=> `Java's boxed primitive` types to corresponding nullableKotlin types

| Java type            | Kotlin type     |
|----------------------|-----------------|
| java.lang.Byte	      | kotlin.Byte?    |
| java.lang.Short	     | kotlin.Short?   |
| java.lang.Integer	   | kotlin.Int?     |
| java.lang.Long	      | kotlin.Long?    |
| java.lang.Character	 | kotlin.Char?    |
| java.lang.Float	     | kotlin.Float?   |
| java.lang.Double     | 	kotlin.Double? |
| java.lang.Boolean    | 	kotlin.Boolean? |


=> `Java's collection types` to corresponding read-only or mutable Kotlin types

| Java type        | Kotlin read-only type  | Kotlin mutable type           |
|------------------|------------------------|-------------------------------|
| Iterator<T>	     | Iterator<T>            | 	MutableIterator<T>           |
| Iterable<T>	     | Iterable<T>            | 	MutableIterable<T>           |
| Collection<T>	   | Collection<T>          | 	MutableCollection<T>         |
| Set<T>           | 	MutableSet<T>         | 	MutableSet<T>                |
| List<T>	         | MutableList<T>	        | MutableList<T>                |
| ListIterator<T>	 | ListIterator<T>	       | MutableListIterator<T>        |
| Map<K, V>	       | Map<K, V>	             | MutableMap<K, V>              |
| Map.Entry<K, V>	 | Map.Entry<K, V>	       | MutableMap.MutableEntry<K, V> |


