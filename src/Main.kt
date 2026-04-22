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

    fun main() {

        val q = readLine()!!.toInt()

        // 最小値を効率よく管理する優先度付きキュー
        // デフォルトで昇順（小さい順）になる
        val p = PriorityQueue<Int>()

        repeat(q) {
            val i = readLine()!!.split(" ")
            if (i[0] == "1") {

                val x = i[1].toInt()
                p.add(x)
            } else {
                // タイプ 2: 最小値を取り出して出力
                // poll() は最小値を取得して、そのまま削除
                println(p.poll())
            }
        }
    }





