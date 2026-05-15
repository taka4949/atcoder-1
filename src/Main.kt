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
  import java.io.PrintWriter


fun main () {
  val f = readLine()!!.split(" ").map { it.toInt() }
  val n = f[0]
  val a = f[1]
  val b = f[2]
  val s = readLine()!!

  var j = 0
  var k = 0
  var x = 0
  var y = 0
  var z = 0L

  for (i in 0 until n) {
    while (j < n && x < a) {
      if (s[j] == 'a') x++//aを必要最低限集める。最小の長さまで
      j++
    }

    if (k < i) {//仮に、kがiに追い越されるとき用（保険）
        k = i
        y = 0
    }
    while(k < n && y < b){
      if(s[k] == 'b') y++
      k++
    }
    if(x >= a){
      val r = if(y >= b) k-1 else n //k-1はb個未満だから、1個手前から数える
      if(r >= j){//考えればわかる、k-1>=jじゃないと条件×
        z +=(r - j + 1).toLong()//＋1は気にしなくていい
      }
    }
    if(s[i] == 'a') x-- else y--//forループで左に１つずらす。移動する。
  }
}










