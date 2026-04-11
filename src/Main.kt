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
   val(n,k) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    val m = mutableMapOf<String,Int>()

    for(i in 0 .. s.length - k ){
        val w = s.substring(i,i + k)
        m[w] = m.getOrDefault(w,0) + 1
    }
    val x = m.values.maxOrNull() ?:0
    val r = mutableListOf<String>()

    for((p,v) in m){
        if(v == x) r.add(p)
    }

    r.sort()
    println(x)
    println(r.joinToString(" "))
}

