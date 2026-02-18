import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.Scanner
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays

fun main () {
    val n = readLine()!!.toInt()

    val c = readLine()!!.split(" ").map { it.toLong() }.sorted()

    var ans = 1L
    val mod = 1000000007L

    for (i in 0 until n) {
        // c[i] : その人の上限値（本来選べる候補の数）
        // i    : その人より前にいる人数（すでに使われてしまった数字の個数）3!（3×2×1)のようなもの
        val count = c[i] - i

        // もし (上限 - 前の人数) が 0以下なら、選べる数字がないということ
        if (count <= 0) {
            println(0)
            return
        }

        ans = (ans * count) % mod
    }

    println(ans)
}

