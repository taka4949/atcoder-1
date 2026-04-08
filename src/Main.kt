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
 val n = readLine()!!.toInt()
    val s = readLine()!!

    val r = mutableListOf<Pair<Char,Int>>()
    var i = 0
    while (i < n){
        var j = i
        while (j < n && s[i] == s[j]){
            j++
        }
        r.add(Pair(s[i],j - i))
        i = j
    }

    val m = IntArray(26)
    for(j in r){
        val c = j.first - 'a'
        val l = j.second
        if(l > m[c]){
            m[c] = l
        }
    }
    var ans = 0
    for(x in m){
        ans += x
    }
    println(ans)
}

