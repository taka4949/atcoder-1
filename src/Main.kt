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

  import java.io.PrintWriter

  fun g(a : Long,b:Long): Long {
    return if(b == 0L) a else g(b,a%b)
  }

  fun main() {
    val o = PrintWriter(System.`out`)

    val i = readLine()!!
    val s = i.split(" ")
    val n = s[0].toLong()
    val m = s[1].toLong()
    val k = s[2].toLong()

    val l = (n / g(n,m)) * m//オーバーフロー防ぐ

    var w = 0L
    var e = 2000000000000000000L

    while (e - w > 1) {//めぐる二分探索。常に、そのままmidを代入すればいい。
      val r = w + (e - w) / 2//w=2w/2に変換、分母そろえる
      val c = (r / n) + (r / m) - 2 * (r / l)

      if (c >= k) {
        e = r
      } else {
        w = r
      }
    }

    o.println(e)


    o.flush()
    o.close()
  }

