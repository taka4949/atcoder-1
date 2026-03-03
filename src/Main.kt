import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main () {
    val n = readLine()!!.toLong()
    val r = mutableListOf<Long>()

    var i = 1L
    while(i * i <= n){ //√nまで調べれば問題ない。約数列挙
       if(n % i == 0L){
           r.add(i)
           if(i * i != n){ //i = 1の場合、６もいれる。ｎ＝16の場合、４を2つ入れないように防いでいる
               r.add(n / i)
           }
       }
        i++
    }
    r.sort()
    println(r.joinToString("\n"))
}




