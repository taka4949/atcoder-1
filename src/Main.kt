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


    val l = readLine()!!.split(" ").map { it.toInt() }
    val n = l[0]
    val m = l[1]

    val g = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until m) {
        val e = readLine()!!.split(" ").map { it.toInt() }
        val u = e[0]
        val v = e[1]
        g[u].add(v)
        g[v].add(u)
    }

    val v = BooleanArray(n + 1)
    var k = 0

    for (i in 1..n) {
        if (!v[i]) {
            k++
            val s = ArrayDeque<Int>()
            s.push(i)
            v[i] = true

            while (!s.isEmpty()) {
                val c = s.pop()
                for (nxt in g[c]) {
                    if (!v[nxt]) {
                        v[nxt] = true
                        s.push(nxt)
                    }
                }
            }
        }
    }

    val a = m - (n - k)
    println(a)

}









