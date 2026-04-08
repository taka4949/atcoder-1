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
val (n,m) = readLine()!!.split(" ").map { it.toInt() }
 val g = Array(n){ArrayList<Int>()}//サイズ指定がない分、メモリ効率がいい

    for(i in 0 until m){
        val(u,v) = readLine()!!.split(" ").map { it.toInt() - 1 }
      g[u].add(v)
        g[v].add(u)
    }

    val vis = BooleanArray(n)
    var ans = 0

    fun dfs(c:Int){
        vis[c] = true//ここで記録する
        for(j in g[c]){
            if(!vis[j]){
                dfs(j)
            }
        }
    }

    for(i in 0 until n){//ここから、関数dfsへ移動
        if(!vis[i]){
            ans++//ここでは、連結部分の始まりをカウント、連結全て記録後に次へ。
            dfs(i)
        }
    }
    println(ans)
}

