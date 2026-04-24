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

val v = readLine()!!.split(" ")

    val x = v[0].toLong()
    val a = v[1].toLong()
    val d = v[2].toLong()
    val n = v[3].toLong()

    val m = (n-1L) * d + a
    val s = min(a,m)
      val t = max(a,m)

      if(d == 0L){
          o.println(abs(x-a))
      }else if(x <= s){
          o.println(s - x)
      } else if(x >= t){
          o.println(x - t)
      }else{
          val r = abs(x - a) % abs(d)
          o.println(min(r,abs(d) - r))
      }

    o.flush()
    o.close()
  }