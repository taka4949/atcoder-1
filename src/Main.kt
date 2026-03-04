import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
    val s = readLine()!!.split(" ")
    val n = s[0].toInt()
    val k = s[1].toInt()
    val c = readLine()!!.split(" ").map { it.toInt() }

    val m = HashMap<Int,Int>() //データを入れた順番は保持していない。そのため速い
    var cut = 0 //種類
    var ans = 0

    for(i in 0 until k){
        val v = c[i]
        if(m.getOrDefault(v,0) == 0){
            cut++
        }
        m[v] = m.getOrDefault(v,0) + 1
    }
    ans = cut

    for(i in k until n){
        val o = c[i - k]//外れるもの、左端
        val v = c[i]//加わるもの、右端

        m[o] = m[o]!! - 1//マップの戻り値はnull許容型のため、‼＝nullではない演算子を書く
        if(m[o] == 0){
            cut--
        }
        if(m.getOrDefault(v,0) == 0){//パイプライン処理→分岐予測器→if分の中では複雑にしない！
            cut++
        }
        m[v] = m.getOrDefault(v,0) + 1
        ans = max(ans,cut)
    }
    println(ans)
}