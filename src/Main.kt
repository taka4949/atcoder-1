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
    val q = readLine()!!.toInt()
    val d = IntArray(q + 1)
    val m = IntArray(q + 1)

    var l = 0
    d[0] = 0
    m[0] = 0

    val s = StringBuilder()

    for (i in 0 until q) {
        val t = readLine()!!
        if (t[0] == '1') {
            val c = t[2]
            l++
            if (c == '(') {
                d[l] = d[l - 1] + 1
            } else {
                d[l] = d[l - 1] - 1
            }

            if (d[l] < 0) {
                m[l] = m[l - 1] + 1
            } else {
                m[l] = m[l - 1]
            }
        } else {
            l--
        }

        if (d[l] == 0 && m[l] == 0) {
            s.append("Yes\n")
        } else {
            s.append("No\n")
        }
    }
    print(s)


}









