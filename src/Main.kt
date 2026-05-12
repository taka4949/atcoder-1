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

    val n = readLine()!!.toLong()
    val k = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }

    var y = 1L
    for(i in 1..k) y*= 10
    y -= 1

    var x = 1L
    for(v in a){
      if(x > y/v){//x*a>yと同じ。オバフロ対策
        x = 1L
      }else{
        x *= v
      }
    }
    o.println(x)

      o.flush()
      o.close()
    }








  fun g(a : Long,b:Long): Long {
    return if(b == 0L) a else g(b,a%b)
  }
