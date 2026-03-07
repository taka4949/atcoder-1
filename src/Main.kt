import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays
import java.util.ArrayDeque

fun main() {
  val n = readLine()!!.toInt()
    val x = LongArray(n)
    val y = LongArray(n)

    for(i in 0 until n){
        val s = readLine()!!.split(" ")
        x[i] = s[0].toLong()
        y[i] = s[1].toLong()
    }

    var ans = 0L
    for(i in 0 until n - 2){
        for(j in i + 1 until n - 1){
            for(k in j + 1 until n){
                val x1 = x[i] - x[j]
                val y1 = y[i] - y[j]
                val x2 = x[i] - x[k]
                val y2 = y[i] - y[k]
//傾きとは、変化の割合。ｘとｙの2地点の距離からｘ÷ｙしたもの。距離ではなく割合！。
                if(x1 * y2 != x2 * y1){//仮に同じ値なら、分母を消しても分子を消しても同じ値になる。
                    ans++ //↑両方の値に、分母を消すために、両方の分母をかける。
                }

            }
        }
    }
    println(ans)
}
//ＰＧは分数不可、割り算だと誤差が生じるため厳密に＝＝したい場合は, 避けるべき。