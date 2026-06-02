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
    val s = readLine()!!.split(" ")
    val n = s[0].toInt()
    val q = s[1].toInt()
    var l = 0
    var r = 1
    var y = 0
    for (i in 0 until q) {
        val g = readLine()!!.split(" ")
        val h = g[0]
        val t = g[1].toInt() - 1
        val a = if (h == "L") l else r
        val c = if (h == "L") r else l
        val d = (t - a + n) % n
        val m = (c - a + n) % n
        if (m < d) {
            y += n - d
        } else {
            y += d
        }
        if (h == "L") l = t else r = t
    }
    println(y)
}









