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


  fun main() {
    val o = PrintWriter(System.`out`)

    val t = readLine()!!.toInt()

    repeat(t) {
      val n = readLine()!!.toInt()
      val s = readLine()!!.split(" ").map { it.toLong() }

      val b = s[0]
      val e = s[n - 1]
      if (b * 2 >= e) {
        println(2)
      } else {
        val m = mutableListOf<Long>()
        for (i in 1 until n - 1) {
          m.add(s[i])
        }
        m.sort()

        var v = b
        var c = 2
        var j = 0
        var f = true

        while (v * 2 < e) {
          var x = -1L
          while (j < m.size && m[j] <= v * 2) {
            x = m[j]
            j++
          }
          if (x == -1L) {
            f = false
            break
          }
          v = x
          c++
        }
        if (f) println(c) else println(-1)
      }
    }
      o.flush()//repeat使うときは、必ずこれらをループの外に書く。
      o.close()
  }








  fun g(a : Long,b:Long): Long {
    return if(b == 0L) a else g(b,a%b)
  }
