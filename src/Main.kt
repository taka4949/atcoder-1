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

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(m) { IntArray(0) }
    for (i in 0 until m) {
        readLine()
        a[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    var ans = 0
    for (i in 1 until (1 shl m)) {
        val st = mutableSetOf<Int>()//重要

        for (j in 0 until m) {
            if (((i shr j) and 1) == 1) {
                for (x in a[j]) {
                    st.add(x)//a[j]の値を一つ一つ入れていく
                }
            }
        }
        if (st.size == n) {
            ans++
        }
    }
    println(ans)
}

