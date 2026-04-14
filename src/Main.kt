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

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map { it.toLong() }
    val t = readLine()!!.split(" ").map { it.toLong() }.toMutableList()

    for(i in 0 until 2 * n){//初めて＝最速の時間を求める→3番目スタートの場合を考慮
        val a = i % n //円環
        val b = (i + 1) % n

        t[b] = min(t[b],t[a] + s[a])
    }

    for(i in 0 until n){
        println(t[i])
    }
}
