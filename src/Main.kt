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
    val br = System.`in`.bufferedReader()

    val (n, q) = br.readLine()!!.split(" ").map { it.toInt() }

    val a = IntArray(n + 1)
    val b = IntArray(n + 1)

    for (i in 1..n) {
      a[i] = i
      b[i] = i
    }

    repeat(q) {
      val x = br.readLine()!!.trim().toInt()
      val i = b[x]
      val j = if (i == n) i - 1 else i + 1
      val y = a[j]

      a[i] = y
      a[j] = x
      b[x] = j
      b[y] = i
    }

    val r = StringBuilder()
    for (h in 1..n) {
      r.append(a[h]).append(if (h == n) "" else " ")
    }
    o.println(r.toString())

    o.flush()
    o.close()
  }