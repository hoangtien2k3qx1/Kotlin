
## Kotlin Annotations

- Annotations are used to attach metadata to classes, interface, parameters, and so on at compile time.
- Annotation can be used by compiler which reflects at runtime. 
- We can change the meaning of the data or program according to annotation values.

## Kotlin Meta-annotations

| Annotation Name    | Usage                                                                                                                              |
|--------------------|------------------------------------------------------------------------------------------------------------------------------------|
| @Target	           | It targets all the possible kinds of elements which can be annotated with the annotation.                                          |
| @Retention	        | It specifies whether the annotation is stored in the compiled class files or whether it is visible through reflection at run time. |
| @Repeatable	       | This meta-annotation determines that an annotation is applicable twice or more on a single code element.                           |
| @MustBeDocumented	 | This meta-document specifies that the annotation is the part of the public API and should be included in the class or method.      |


#### Example:
```kotlin
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,  
AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)  
@Retention(AnnotationRetention.SOURCE)  
@MustBeDocumented  
annotation class MyClass  
```


















