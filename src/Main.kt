
import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main() {
    val (ns, ws) = readLine()!!.split(" ")
    val n = ns.toInt()
    var w = ws.toLong()

    val a = mutableListOf<Pair<Long,Long>>() //サイズ自由自在、add可能、中身の書き換え科可能！普通のリストはすべて不変

    for(i in 0 until n){
        val (x,y) = readLine()!!.split(" ").map { it.toLong() }
        a.add(Pair(x,y))
    }
    a.sortByDescending { it.first } //一番おいしいものからえらぶ

    var s = 0L
    for((m,v) in a){
        if(w <= 0) break
        val t = min(w,v)//実質if(w < v) w else v
        s += t * m
        w -= t
    }
    println(s)
}