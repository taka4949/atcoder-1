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
import java.util.PriorityQueue
import java.util.StringTokenizer
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.HashMap
import java.io.PrintWriter

fun main() {

    val(n,q) = readLine()!!.split(" ").map { it.toInt() }

    val a = IntArray(n + 1)
    val b = IntArray(600066)
    val c = IntArray(600066)

    b[0] = n
    c[0] = n

    var o = 0
    val s = StringBuilder()

    for (k in 0 until q) {
        val(t,x) = readLine()!!.split(" ").map { it.toInt() }




        if (t == 1) {
            val p = a[x]
            val v = p + 1

            b[p]--
            b[v]++
            c[v]++
            a[x]++

            if (b[o] == 0) {
                o++
            }
        } else {
            s.append(c[x + o]).append("\n")
        }
    }
    print(s)
}








