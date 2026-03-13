import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays
import java.util.ArrayDeque
import kotlin.math.max
import kotlin.system.exitProcess

fun main(){
    val n = readLine()!!.toInt()
    var ans = 0L

    fun f(v: Int): Long {
        var c = 0L
        var i = 1
        while (i * i <= v) {
            if (v % i == 0) {
                c++
            }
            i++
        }
        return c
    }

    for (x in 1..(n / 2)) {
        val y = n - x

        if (x != y) {
            ans += f(x) * f(y)
        } else {
            val c = f(x)
            ans += c * (c + 1) / 2
        }
    }

    println(ans)
}