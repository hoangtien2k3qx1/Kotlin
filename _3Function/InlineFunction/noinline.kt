package _3Function.InlineFunction

import org.jetbrains.annotations.NotNull
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import kotlin.reflect.KParameter

inline fun close(work:String,noinline process: (String) -> Unit) {
    //tiền xử lý
    process(work)
    println("close")
}