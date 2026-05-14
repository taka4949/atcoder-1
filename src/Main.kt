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

  val m = mutableMapOf<Long, Long>()

  fun f(n: Long): Long {

    if (n < 2) return 0L

    // すでに計算した数字なら、その結果を返す。重要！！！メモ
    val k = m[n]
    if (k != null) return k

    // ⌊x/2⌋ は n / 2
    // ⌈x/2⌉ は (n + 1) / 2。ここは切り上げを計算するため
    val r = n + f(n / 2) + f((n + 1) / 2)

    // 結果を記録して返す
    m[n] = r
    return r
  }

  fun main() {
    val s = readLine()!!
    val n = s.toLong()
    println(f(n))
  }













