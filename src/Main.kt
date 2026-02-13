import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main () {
    val l = readLine()!!.split(" ")
    val n = l[0].toInt()
    val k = l[1].toInt()

    val s = Array(n) { readLine()!! }

    var ans = 0

    for (i in 0 until (1 shl n)) {
        val cut = IntArray(26)
        for (j in 0 until n) {
            if ((i shr j) and 1 == 1) {

                for (c in s[j]) {
                    cut[c - 'a']++
                }
            }
        }
        var now = 0
        for (c in 0 until 26) {
            if (cut[c] == k) {
                now++
            }
        }
        ans = max(ans, now)
    }
    println(ans)
}