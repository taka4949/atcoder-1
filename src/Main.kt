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
import kotlin.math.sqrt
import kotlin.Comparator
import kotlin.math.pow

fun main() {
    val h = readLine()!!
    val n = h.split(" ")[0].toInt()
    val m = h.split(" ")[1].toInt()

    val a = IntArray(n + 2)

    for (i in 0 until m) {
        val g = readLine()!!
        val l = g.split(" ")[0].toInt()
        val r = g.split(" ")[1].toInt()
        a[l]++
        a[r + 1]--
    }

    var v = 0
    var w = Int.MAX_VALUE

    for (i in 1..n) {
        v += a[i]
        if (v < w) {
            w = v
        }
    }

    println(w)
}





