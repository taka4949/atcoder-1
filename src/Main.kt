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
    val (n,l,r) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    val a = Array(26) { mutableListOf<Int>() }
    for (i in 0 until n) {
        a[s[i] - 'a'].add(i + 1)//s内a等のインデックス番号をリストへ
    }
    var count = 0L
    for (i in 0 until 26) {
        val v = a[i]

        for (j in 0 until v.size) {//vの配列内=list内はmaxでn^5*5
            val x = v[j]
            val m = x + l
            val mm = x + r
            var p = v.binarySearch(m)//a[1,3,5]で3なら、１返したい。
            if (p < 0) p = -(p) - 1
            var pp = v.binarySearch(mm + 1)//区間の個数出す際+1必須。6はない、3返したい。
            if (pp < 0) pp = -(pp) - 1
            count += (pp - p).toLong()//3－1で0から2～4離れた場所に2個ある
        }
    }
    println(count)
}
