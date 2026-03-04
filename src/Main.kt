import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
    val s = readLine()!!.split(" ")
    val x1 = s[0].toLong()
    val y1 = s[1].toLong()
    val x2 = s[2].toLong()
    val y2 = s[3].toLong()

    val dx = longArrayOf(1, 2, 2, 1, -1, -2, -2, -1)
    val dy = longArrayOf(2, 1, -1, -2, -2, -1, 1, 2)

    var ans = "No"

    for(i in 0 until 8){
        val nx = x1 + dx[i]//地点１から√5離れた場所へ強制的に移動させる
        val ny = y1 + dy[i]

        val d2 = (nx - x2) * (nx - x2) + (ny - y2) * (ny - y2)
//sqrtをつかうと、誤差が生じる。バグの元。FPUは処理が重い。そのため、ルートは外して計算する。
        if(d2 == 5L){
            ans = "Yes"
            break
        }
    }
    println(ans)
}