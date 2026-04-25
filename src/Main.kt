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

   val (n,q) = readLine()!!.split(" ").map { it.toInt() }

    val a = readLine()!!.split(" ").map { it.toInt() }
    val c = BooleanArray(n + 2)
    var count = 0

    for(i in 0 until q){
    val x = a[i]
      if(!c[x]){
        c[x] = true
        if(!c[x-1]) count++//スコープ重要。独立した条件なら絶対に独立したものにする
        if(c[x+1]) count--
      }else{
        c[x] = false
        if(!c[x-1])count--
        if(c[x+1])count++
      }
      o.println(count)
    }

    o.flush()
    o.close()
  }

