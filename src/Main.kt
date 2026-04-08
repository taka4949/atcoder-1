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
  val e = mutableMapOf<Int,Int>()

  for(i in 0 until n){
      val s = readLine()!!.split(" ")
      val a = s[0].toInt()
      val b = s[1].toInt()

      e[a] = e.getOrDefault(a,0) + 1
      e[a + b] = e.getOrDefault(a + b,0) - 1//いもす法
  }
    val ans = IntArray(n + 1)
    var cur = 0

    val k = e.keys.sorted()//日数ソート1,2,3,4,5など

    var pre = k[0]

    for(x in k){
        val d = x - pre
        ans[cur] += d//人数1人の時は何日間あったのか集計
        cur += e[x]!!//ここから、スタート。1日目～2日目1人
        pre = x
    }

    val out = StringBuilder()
    for(i in 1..n){
        out.append(ans[i]).append(if(i==n) "" else " ")//1人の時ｘ日、2人の時ｘ日など出力
    }
    println(out.toString())
}

