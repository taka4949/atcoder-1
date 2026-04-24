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
      val (h,w,n) = readLine()!!.split(" ").map { it.toInt() }

      val t = readLine()!!
      val s = Array(h){readLine()!!}

      var c = 0

      for(i in 0 until h){
          for(j in 0 until w){
              var z = true//リセット場所ここ！。間違えやすい
              if(s[i][j] == '.'){
                  var x = i
                  var y = j
                  for(k in 0 until t.length) {
                      when (t[k]) {
                          'L' -> y--
                          'R' -> y++
                          'U' -> x--
                          'D' -> x++
                      }
                      if (s[x][y] != '.') {
                          z = false
                          break
                      }
                  }
                  if(z) c++//条件分岐内に書かないとだめ。間違いやすい
                  }
              }

          }

o.println(c)


    o.flush()
    o.close()
  }
