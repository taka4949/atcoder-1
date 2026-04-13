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

    val(h,w) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(h){readLine()!!}

    val b = intArrayOf(-1,-1,+1,+1)
    val b2 = intArrayOf(-1,+1,+1,-1)

    val n = min(h,w)
    val r = IntArray(n + 1)

    for(i in 0 until h){
        for(j in 0 until w){
            if(a[i][j] == '#' && i != 0 && j != 0 && i < h - 1 && j < w - 1){
                var x = true
                for(l in 0 until b.size){
                    val ii = i + b[l]
                    val jj = j + b2[l]
                    if(a[ii][jj] != '#'){
                        x = false
                        break
                    }
                }
                var k = 0
                if(x){
                    k = 1
                    while(true){
                        val d = k + 1
                        var f = true
                        for(m in 0 until b.size){
                            val ii = i + b[m] * d
                            val jj = j + b2[m] * d
                            if (ii >= 0 && ii < h && jj >= 0 && jj < w && a[ii][jj] == '#') {
                                    //こっちのifは、壁ぎりぎりまでOK
                            }else{
                                f = false
                                break
                            }
                        }
                        if(f) k++ else break

                    }
                    r[k]++


                }
            }
        }
    }
    println((1..n).map{r[it]}.joinToString(" "))
}