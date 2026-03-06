import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
  val q = readLine()!!.toInt()
    val m = TreeMap<Int,Int>() //最小、最大を容易に調べられる。全データ見る必要がない、ノッド型。

    for(i in 0 until q){
        val l = readLine()!!.split(" ")
        val t = l[0].toInt()

        if(t == 1){
            val x = l[1].toInt()
            m[x] = m.getOrDefault(x,0) + 1
        }else if(t == 2) {
            val x = l[1].toInt()
            val y = l[2].toInt()
            if(m.containsKey(x)){
                val cut = m[x]!!
                if(cut <= y){//かりに２＜＝１なら、２－１、２＜＝３なら、全削除。
                    m.remove(x)
                } else{
                    m[x] = cut - y
                }
            }
        }else if(t == 3){
            val ma = m.lastKey()//treemapの特徴
            val mi = m.firstKey()
            println(ma - mi)
        }
    }
    }