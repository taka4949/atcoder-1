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
    val  (l,r) = readLine()!!.split(" ").map { it.toLong() }
    val g = gcd(l,r)//12，24なら12が最大公約数＋重複していないのは２→24答え
    val ans = (l * r ) / g//最小公倍数とは、両方の共通する数字を１つずつかけ合わせた数字。
    println(ans)

}

fun gcd (x : Long,y : Long) : Long{
    return if(y == 0L) x else gcd(y,x % y)
}
