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

    val n = readLine()!!.toInt()
    val d = IntArray(n + 1) { 0 }

    for (i in 1..n) {

        val s = readLine()!!.split(" ").map { it.toInt() }
        val x = s[0]
        val y = s[1]
        d[x] = y
    }

    var c = 0
    var m = 1000000000

    for (i in 1..n) {
        if (d[i] > m) {

        } else {
            c++
        }
        if (d[i] < m) {
            m = d[i]
        }
    }

    println(c)
}






