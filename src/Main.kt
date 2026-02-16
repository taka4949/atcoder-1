import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main () {
    val n = readLine()!!.toInt()
    val o = Array(n) { readLine()!!.map { it.digitToInt() }.toIntArray() }

    val a = intArrayOf(1, -1, 0, 0, 1, 1, -1, -1)
    val b = intArrayOf(0, 0, 1, -1, 1, -1, -1, 1)

    var c = 0


    for (x in 0 until n) {
        for (y in 0 until n) {
            for (z in 0 until 8) {
                for (w in intArrayOf(1, -1)) {
                    var count = 1
                    var x1 = x // 次の値をつくる
                    var y1 = y
                    while (true) {
                        val x2 = x1 + a[z]
                        val y2 = y1 + b[z]
                        if (x2 !in 0 until n || y2 !in 0 until n) break //グリッド範囲チェック

                        if (o[x2][y2] == o[x1][y1] + w) {
                            count++
                            x1 = x2
                            y1 = y2
                            if(count == n){
                                println(n)
                                return
                            }
                        }else{
                            break
                        }
                    }
                    if(count > c) c = count //whileあとに最大値一時保存
                }
            }
        }
    }
    println(c)
}

