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
 val s = readLine()!!
    val t = readLine()!!

    val a = s.filter { it != 'A'}
    val b = t.filter { it != 'A'}

    if(a != b){
        println("-1")
        return
    }

    fun f(x:String): List<Long>{
        val l = mutableListOf<Long>()
        var c = 0L
        for(i in x){
            if(i == 'A'){
                c++
            }else{
                l.add(c)
                c = 0L
            }
        }
        l.add(c)
        return l
    }
    val x = f(s)
    val y = f(t)
    var r = 0L
    for(i in x.indices){
        r += abs(x[i]  - y[i])
    }
    println(r)
}

