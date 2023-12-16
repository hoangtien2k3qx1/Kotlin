package DataClass

data class User(val name: String, val age: Int)

data class Person(val name: String = "", var age: Int = 0)


// copy in kotin implement same prototype pattern

fun main() {

    val person1 = Person("Tiến")
    val person2 = Person("Tiến")
    person1.age = 10
    person2.age = 20

    // copy persitive (copy nguyên bản)
    val person1_copy = person1.copy()
    println(person1 == person1_copy)

    // copy thay đổi giá trị của một số thuộc tính:
    val person2_copy = person2.copy(
        age = 12
    )
    println(person2 == person2_copy) // so sánh giá trị


    println("person1 == person2: ${person1 == person2}")
    // person1 == person2: true

    println("person1 with age ${person1.age}: $person1")
    // person1 with age 10: Person(name=John)

    println("person2 with age ${person2.age}: $person2")
    // person2 with age 20: Person(name=John)

}