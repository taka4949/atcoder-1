import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
    val nq = readLine()!!.split(" ")
    val n = nq[0].toInt()
    val q = nq[1].toInt()

    val a = readLine()!!.split(" ")

    val m = mutableMapOf<Int, MutableList<Int>>()//マップは空、作る必要がある。

    for(i in 0 until n){
        val num = a[i].toInt()
        val p = i + 1//0番目は1番目にしたい。もし、0番目にした場合、リストには0に0番目が入る。出力時に１ではなく０を出してしまう。

        if(m.containsKey(num)){
            m[num]!!.add(p)
        }else{
            val l = mutableListOf<Int>() //マップにリストを入れる場合、ここで作る。
            l.add(p)//リアロケーションしている。
            m[num] = l//マップにリストを入れる方法
        }
    }
    for(i in 0 until q){
        val q1 = readLine()!!.split(" ")
        val x = q1[0].toInt()
        val y = q1[1].toInt()

        if(m.containsKey(x)){
            val x1 = m[x]!!
            if(y <= x1.size){
                println(x1[y - 1])//1番目はリストでは0番目なため。
            }else{
                println("-1")
            }
        }else{
            println("-1")
        }
    }

}