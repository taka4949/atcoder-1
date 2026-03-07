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
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }

    val c = IntArray(n)

    for(i in 0 until n){
        val x = ((p[i] - 1) - i + n) % n //p[i]=人iとi(料理の現在地）から引いた距離＝円卓の回転数
        val y = (p[i] - i + n ) % n
        val z = ((p[i] + 1) - i + n) % n //+nで３から０へ。-3を返さないようにする！。

        c[x]++
        c[y]++
        c[z]++
    }
    var ans = 0
    for(i in 0 until n){
        ans = max(ans,c[i])//回転数が一番多い→料理全パターンで最も希望者が多い回転してほしい数。
    }
    println(ans)
}
