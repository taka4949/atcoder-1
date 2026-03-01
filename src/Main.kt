import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays

// メモ用の配列を用意（0以外の数字が入っていたら「計算済み」とみなす）
val m = LongArray(100)

fun f(n: Int): Long {
    // 0と1はそのまま返す
    if (n == 0) return 0
    if (n == 1) return 1

    // もしメモに結果があるなら、計算しないでそれを返す！
    if (m[n] != 0L) return m[n]

    // なければ計算して、メモに保存する
    m[n] = f(n - 1) + f(n - 2)
    return m[n]
}
fun main () {
    val n = readLine()!!.toInt()
    println(f(n))

}




