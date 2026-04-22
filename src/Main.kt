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

    val s = Array(h){readLine()!!}

    val a = intArrayOf(-1,0,0,+1)
    val b = intArrayOf(0,-1,+1,0)


    for(i in 0 until h){
        for(j in 0 until w){
            var c = 0
            if(s[i][j] == '#'){
                for(l in 0 until a.size){
                    val i1 = i + a[l]
                    val j1 = j + b[l]
                    if(i1 < 0 || j1 < 0 || i1 >= h || j1 >= w){
                        continue//端の場合も、ほかの方向を見る必要がある
                    }else{
                        if(s[i1][j1] == '#'){
                            c++
                        }
                    }
                    }
                if(!(c == 2 || c == 4)){ //if(#)のときだけチェックするように、if文内で記述
                    println("No")
                    return
                }
            }
        }
    }
    println("Yes")
}




