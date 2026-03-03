import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main () {
 val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.toLongArray()

    val c = LongArray(200)
    for(x in a){
        c[(x % 200).toInt()]++ //あまりのペアを作る。差が倍数＝あまりが同じ。401と201なら余り１、ペア成立。
    }
    var ans = 0L
    for(i in c){
        ans += i * (i - 1) / 2 //2以上＝1ペア以上
    }
    println(ans)
}




