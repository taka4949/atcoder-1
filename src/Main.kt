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
val (h,w) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(h){readLine()!!.split(" ").map { it.toInt() }}
    var r = 0

    fun f(x : Int,y : Int ,s : MutableSet<Int>){
        if(a[x][y] in s) return

        s.add(a[x][y])

        if(x == h - 1 && y == w - 1) {
            r++

        }else {
            if (x < h - 1) f(x + 1, y, s)
            if (y < w - 1) f(x, y + 1, s)
        }
        s.remove(a[x][y])
    }
    val c = mutableSetOf<Int>()
    f(0,0,c)

    println(r)
    }

