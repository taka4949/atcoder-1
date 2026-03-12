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
    val n = readLine()!!.toLong()
    val m = 1000000//p>=2なため、10^18/2=10^6までが最大値

    //array<boolean>は,オブジェクトへのポインタ配列で遅い
    val ip = BooleanArray(m + 1) { true }
    ip[0] = false
    ip[1] = false
    val ps = mutableListOf<Long>()

    for (i in 2..m) {
        if (ip[i]) {
            ps.add(i.toLong())
            for (j in i * 2..m step i) {//倍数＝素数ではない。4,6,8,,,など
                ip[j] = false//ステップの1回目は、そのまま４
            }
        }
    }
    var c = 0L
    for (q in ps) {//qからのほうがはやい
        val q3 = q * q * q
        if (q3 > n) break

        for (p in ps) {
            if (p >= q) break
            if(p * q3 <= n){
                c++
            }else{
                break
            }
        }
    }
    println(c)
}