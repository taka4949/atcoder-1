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
    val t = readLine()!!.toInt()
    repeat(t) {
        val (n, d) = readLine()!!.split(" ").map { it.toInt() }
        val a = readLine()!!.split(" ").map { it.toLong() }
        val b = readLine()!!.split(" ").map { it.toLong() }

        val q = mutableListOf<LongArray>()
        var u = 0
        var e = 0

        for (i in 1..n) {

            q.add(longArrayOf(i.toLong(), a[i - 1]))
            var r = b[i - 1]
            while (r > 0 && u < q.size) {
                val f = q[u]
                if (f[1] <= r) {
                    r -= f[1]
                    f[1] = 0
                    u++
                } else {
                    f[1] -= r
                    r = 0
                }
            }
            val l = i - d
            while (e < q.size && q[e][0] <= l) {
                q[e][1] = 0
                e++
            }
            if (u < e) u = e
        }

        var s = 0L
        for (j in 0 until q.size) s += q[j][1]
        println(s)
    }

}

