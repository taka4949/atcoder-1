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


  fun main() {
    val o = PrintWriter(System.`out`)
    val s = readLine()!!.split(" ").map { it.toInt() }
    val n = s[0]
    val q = s[1]

    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    a.sort()

    val b = StringBuilder()
    repeat(q) {
      val x = readLine()!!.toInt()

      // めぐる式二分探索
      var l = -1 // ng (x未満が確定しているインデックス)
      var r = n  // ok (x以上である可能性があるインデックス)

      while (r - l > 1) {
        val m = l + (r - l) / 2
        if (a[m] >= x) {
          r = m
        } else {
          l = m
        }
      }

      // r は x 以上の最小のインデックス
      // 全体の人数 n から r を引けば、x 以上の人数が出る
      b.append("${n - r}\n")
    }
   o.print(b)

    o.flush()
    o.close()
  }





  fun g(a : Long,b:Long): Long {
    return if(b == 0L) a else g(b,a%b)
  }
