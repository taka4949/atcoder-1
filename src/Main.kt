import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main () {
   val t = readLine()!!.toInt() //この問題文の制約→必ずqかp見つかったら、片方も存在する
    repeat(t){
        val n = readLine()!!.toLong() //45の場合
        var p = 0L
        var q = 0L

        for(i in 2L..3000000L){ //三十根の値以上は調べる必要なし
            if(n % i == 0L){ //3
                if((n / i) % i == 0L){ //5
                    p = i
                    q = n / (p * p)
                }else{
                    q = i
                    val res = (n / q).toDouble()
                    p = sqrt(res).roundToLong() //sqrtはdouble型のみ受け付ける
                }
                break
            }
        }
        println("$p $q")
    }
}




