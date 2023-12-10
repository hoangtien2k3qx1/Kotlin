package _3Function.InlineFunction

fun main(args: Array<String>) {
    inlineFunction { println("calling inline functions") }
}

inline fun inlineFunction(myFun: () -> Unit) {
    myFun()
    print("code inside inline function")
}