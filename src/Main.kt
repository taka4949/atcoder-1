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
import java.util.PriorityQueue
import java.util.StringTokenizer
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.HashMap
import java.io.PrintWriter
import kotlin.Comparator

fun main() {


    val v = readLine()!!.split(" ").map { it.toInt() }
    val c = charArrayOf('A', 'B', 'C', 'D', 'E')
    val l = mutableListOf<Pair<String, Int>>()

    for(i in 1..31){
        var s = ""
        var p = 0
        for(j in 0 ..4){
            if(((i shr j) and 1) !=  0){
                s += c[j]
                p += v[j]
            }
        }
        l.add(Pair(s,p))
    }

    l.sortWith(Comparator { x, y ->//xとy比較して、プラスなら入れ替える。以外なら何もしない。
        if (x.second != y.second) {
            y.second.compareTo(x.second)
        } else {
            x.first.compareTo(y.first)
        }
    })

for(i in l){
    println(i.first)
}
}








