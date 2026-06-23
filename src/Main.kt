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
    val a = readLine()!!.split(" ").map { it.toInt() }
    val n = a[0]
    val r = a[1]
    val l = readLine()!!.split(" ").map { it.toInt() }

    var z = 0
    var x = -1
    var y = -1

    for (i in 0 until n) {
        if (l[i] == 0) {
            z++
            if (x == -1) {
                x = i
            }
            y = i
        }
    }

    if (z == 0) {
        println(0)
        return
    }

    var p = if (r < x + 1) r else x + 1
    var q = if (r > y) r else y

    var c = 0
    for (i in p until q) {
        if (l[i] == 1) {
            c++
        }
    }

    println(z + c * 2)
    }





