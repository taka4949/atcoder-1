import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
    val nw = readLine()!!.split(" ")
    val n = nw[0].toInt()
    val w = nw[1].toLong()

    val mx = 200005
    val a = LongArray(mx)

    for(i in 0 until n){
        val stp = readLine()!!.split(" ")
        val s = stp[0].toInt()
        val t = stp[1].toInt()
        val p = stp[2].toLong()

        a[s] += p
        a[t] -= p
    }
    var cur = 0L
    for(i in 0 until mx){
        cur += a[i]
        if(cur > w){// w=10。10分より超えたら、計画通り供給不可能。
            println("No")
            return
        }
    }
    println("Yes")
    }