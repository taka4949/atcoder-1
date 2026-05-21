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
import java.util.StringTokenizer
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.HashMap
import java.io.PrintWriter


fun main() {
  val n = readLine()!!.toInt()
  val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
  var v = 0L
  for (i in 0 until n) {
    var l = -1//二分探索スタート位置は参照されない！（だから配列外）
    var r = n//同様
    while (r - l > 1) {//めぐる式テンプレ
      val m = (l + r) / 2//Longなら、ｍ＝l+(r-l)/2
      if (a[m] >= a[i] * 2) {//最大の最小値ならこの形（m＞＝）になる。重要
        r = m
      } else {
        l = m
      }
    }
    v += (n - r)
  }
  println(v)
}











