import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays
fun main() {
        val l = readLine()!!.split(" ")
        val n = l[0].toInt()
        val m = l[1].toInt()
        val g = Array(n + 1) { mutableListOf<Int>() }

        for (i in 0 until m) {
            val e = readLine()!!.split(" ")
            val u = e[0].toInt()
            val v = e[1].toInt()
            g[u].add(v)
        }

        var t = 0
        for (i in 1..n) {
            val v = BooleanArray(n + 1)
            t += f1(i, g, v)
        }
        println(t)
    }

    fun f1(c: Int, g: Array<MutableList<Int>>, v: BooleanArray): Int {
        v[c] = true
        var r = 1
        for (n in g[c]) {
            if (!v[n]) {
                r += f1(n, g, v)
            }
        }
        return r
    }



