
import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main() {
    val (x,y) = readLine()!!.split(" ")
    val n = x.toInt()
    val q = y.toInt()
    val s = readLine()!!

    val a = LongArray(n + 1)

    for(i in 0 until n - 1){ // until nだと、if(s[i + 1]でエラー！
        val v = if(s[i] == s[i + 1] ) 1L else 0L
        a[i + 1] = a[i] + v
    }
    a[n] = a[n - 1] // エラー防止！

    for(k in 0 until q){ // q回分回す、ループの使い方！
        val(l,r) = readLine()!!.split(" ").map { it.toInt() }

        val c = a[r - 1] - a[l - 1] // a[r]はr+1との値のため、含めちゃいけない。[l」はｌ＋１との値のため含めないといけない。
        // そのため、ｌは前の配列、ｒも前の配列を基準に求める。
        println(c)
    }
}