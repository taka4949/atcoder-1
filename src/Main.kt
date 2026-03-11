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

fun main() {
val n = readLine()!!.toLong()//4
    var ans = 0L

    var a = 1L
    while(a * a * a <= n){//2ならそもそも無理
        var b = a//a<=b
        while(a * b * b <= n){//3なら無理。B<=Cなため。
            val m = n / (a * b)//a*bと何をかければｎになるのか？（ｘ＝ｃ）
            ans += (m - b + 1)//ｃとｂの範囲が個数、＜＝なため、ｂも含めるために＋１
            b++
        }
        a++
    }
 println(ans)
}
//ループ内で判定は、cpuのパイプライン処理が乱れる。
//cpuは、割り算ではなく引き算をしている。そのため、割り算は重い。
//a,b=1のときは、a*b*x=n→x=n/a*bでx=c=4。ｂとｃの範囲は４だから4通り。a1,b2のとき、4/2=2=c。2と2の範囲は１。
//何通り？→最も範囲が狭いであろう最大値（ｃ）の範囲から考える