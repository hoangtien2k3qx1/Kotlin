package Kotlin_Learn.Contructor.SecondaryContructor


// khai báo secondary constructor không phụ thuộc vào primary constructor
class Person {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
