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
val(n,m,k) = readLine()!!.split(" ").map { it.toInt() }
    val a = Array(m){IntArray(0)}
    val r = CharArray(m)

    for(i in 0 until m){
        val s = readLine()!!.split(" ")
        val c = s[0].toInt()
        val t = IntArray(c)
        for(j in 0 until c){
            t[j] = s[j + 1].toInt() - 1
        }
        a[i] = t
        r[i] = s.last()[0]
    }
    var ans = 0

    for(b in 0 until (1 shl n)){
        var ok = true
        for(i in 0 until m){
            var c2 = 0
            for(x in a[i]){
                if(((b shr x) and 1) == 1){
                    c2++
                }
            }
            val op = c2>= k
            val ex = r[i] == 'o'

            if(op != ex){
                ok = false
                break
            }
        }
        if(ok) ans++
    }
    println(ans)

}

