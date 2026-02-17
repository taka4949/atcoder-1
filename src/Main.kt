import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays

fun main () {
    val i1 = readLine()!!.split(" ")
    val n = i1[0].toInt()
    val q = i1[1].toInt()

    val a = readLine()!!.split(" ").map { it.toInt() }.sorted()

    for(i in 0 until q){
        val x = readLine()!!.toInt()

        var l = 0
        var r = n

        while(l < r){ // 範囲の基礎的な書き方
            val m = (l + r) / 2
            if(a[m] < x){
                l = m + 1
            }else{ // >=
                r = m
            }
        }
        println(n - l) // lは左にある値の数を表している
    }
}

