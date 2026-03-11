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

fun main() {
    val s = readLine()!!.split(" ")
    val n = s[0].toInt()
    val m = s[1].toInt()

  val a = Array(n){ BooleanArray(n) }
    val b = Array(n){ BooleanArray(n) }

    for(i in 0 until m){
        val t = readLine()!!.split(" ")
        val u = t[0].toInt() -1
        val v = t[1].toInt() -1
        a[u][v] = true
        a[v][u] = true
    }
    for (i in 0 until m) {
        val t = readLine()!!.split(" ")
        val u = t[0].toInt() - 1
        val v = t[1].toInt() - 1
        b[u][v] = true
        b[v][u] = true
    }

     var ans = false
    val p = IntArray(n)
    val used = BooleanArray(n)

    fun dfs(d:Int){
        if(d == n) {
            var ok = true
            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (a[i][j] != b[p[i]][p[j]]) {
                        ok = false
                    }
                }
            }
            if (ok)  ans = true
            return
        }
        for(i in 0 until n){
            if(!used[i]){//大事
                used[i] = true
                p[d] = i
                dfs(d + 1)
                used [i] = false
            }
        }
    }
    dfs(0)
    println(if(ans) "Yes" else "No")
}
//dfs１から３まで行く場合は最後までループするが、３から2へ戻る際などは最初に進んでいたループの途中からスタートする。
//a基準に考える。インデックスの位置が対応関係。紐の本数は変化だめ。
//nの大きさが小さい場合、対応関係を探す場合、深さ優先探索
