import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays


fun main () {
    val n = readLine()!!.toInt()
    val m = readLine()!!.split(" ").map { it.toInt() }
    val l = IntArray(n + 1)

    for (i in n downTo 1) {
        val x = m[i - 1]
        if (x == i) {
            l[i] = i
        } else {
            l[i] = l[x]
        }
    }

    println((1..n).map { l[it] }.joinToString(" "))
}




