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


import java.util.StringTokenizer

fun main() {
    val l = readLine()!!
    val s = l.split(" ")
    val n = s[0].toInt()
    val q = s[1].toInt()

    val c = IntArray(n + 1) { 1 }
    var m = 1

    val o = StringBuilder()

    for (i in 0 until q) {
        val r = readLine()!!
        val t = r.split(" ")
        val x = t[0].toInt()
        val y = t[1].toInt()

        if (x < m) {
            o.append(0).append("\n")
        } else {
            var a = 0
            for (j in m..x) {
                a += c[j]
                c[j] = 0
            }
            c[y] += a
            m = x + 1
            o.append(a).append("\n")
        }
    }

    print(o)
}






