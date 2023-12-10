package _11KotlinOOPs.KotlinAbstractClass

open class Car {
    open fun run() {
        println("Car is running..")
    }
}

abstract class Honda : Car() {
    override abstract fun run()
}

class City: Honda(){
    override fun run() {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("Honda City is running..")
    }
}

fun main(args: Array<String>){
    val car = Car()
    car.run()
    val city = City()
    city.run()
}