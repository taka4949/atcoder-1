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


import kotlin.system.exitProcess

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(n) { BooleanArray(n) }
    val b = Array(n) { BooleanArray(n) }

    for (i in 0 until m) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() - 1 }
        a[x][y] = true
        a[y][x] = true
    }

    for (i in 0 until m) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() - 1 }
        b[x][y] = true
        b[y][x] = true
    }

    val u = BooleanArray(n)
    val p = mutableListOf<Int>()

    fun f() {
        if (p.size == n) {
            var o = true
            for (i in 0 until n) {
                // 重複してペアを調べないために i + 1 から n まで回す
                for (j in i + 1 until n) {
                    if (a[i][j] != b[p[i]][p[j]]) {
                        o = false
                    }
                }
            }
            // 一致したら Yes を出してプログラム自体を即終了
            if (o) {
                println("Yes")
                exitProcess(0)
            }
            return
        }

        for (i in 0 until n) {
            if (!u[i]) {
                u[i] = true
                p.add(i)
                f() // 次の数字を探しに行く
                p.removeLast() // 戻ってきたら追加した数字を消して元に戻す
                u[i] = false
            }
        }
    }

    f() // ここで最初の探索をスタートさせる

    // 全部のパターンを試して exitProcess(0) が呼ばれなかったら No
    println("No")
}

