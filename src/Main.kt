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

fun main() {
 val (n, m) = readLine()!!.split(" ").map { it.toInt() }
 val s = Array(n) { readLine()!! }

 var ans = false
 val u = BooleanArray(n)
 val p = IntArray(n)

 fun dfs(d: Int) {
  if (d == n) {
   var ok = true
   for (i in 0 until n - 1) {
    var c = 0
    for (j in 0 until m) {
     if (s[p[i]][j] != s[p[i + 1]][j]) c++
    }
    if (c != 1) ok = false
   }
   if (ok) ans = true
   return
  }


 for (i in 0 until n) {
  if (!u[i]) {
   u[i] = true
   p[d] = i
   dfs(d + 1)
   u[i] = false
  }
 }
}
dfs(0)
        println(if(ans) "Yes" else "No")
}


