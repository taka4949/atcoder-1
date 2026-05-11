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

    val n = readLine()!!.toInt()
    val l = LongArray(n)
    val r = LongArray(n)

    var s =0L
    var m = 0L

    for(i in 0 until n){
      val a = readLine()!!.split(" ").map { it.toLong() }
      l[i] = a[0]
      r[i] = a[1]
      s += l[i]
      m += r[i]
    }

    if (0 < s || 0 > m) {
      println("No")
      return
    }

    println("Yes")
    val x = LongArray(n)
    var d = -s

    for (i in 0 until n) {
      val v = min(d, r[i] - l[i])
      x[i] = l[i] + v
      d -= v
    }

    o.println(x.joinToString(" "))

      o.flush()
      o.close()
    }








  fun g(a : Long,b:Long): Long {
    return if(b == 0L) a else g(b,a%b)
  }
