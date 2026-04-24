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
      val aa = mutableListOf<Pair<Int,Int>>()

      var x = 1
      var y = 0
      for(i in n downTo 1){ //リストに逆順に入れる。
          aa.add(i to 0)
      }
      repeat(q) {
          val s = readLine()!!.split(" ")
          val a = s[0].toInt()
          if (a == 1) {
              val d = s[1]
              if (d == "U") {
                  y++
              } else if (d == "D") {
                  y--
              } else if (d == "L") {
                  x--
              } else if (d == "R") {
                  x++
              }
              aa.add(x to y)

          } else {
              val p = s[1].toInt()
              val z = aa[aa.size - p]//リストは後ろから追加したほうが早い
              println("${z.first} ${z.second}")
          }
      }

    o.flush()
    o.close()
  }
