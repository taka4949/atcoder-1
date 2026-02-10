//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main() {
    val input1 = readLine()!!.split(" ")
    val n = input1[0].toInt()
    val k = input1[1].toInt()
    val x = input1[2].toLong()

    val a = readLine()!!.split(" ").map { it.toLong() }.sortedDescending()

    // 水（ゴミ）になる個数
    val w = n - k

    var sum = 0L

    // ゴミの次から調べ始める
    for (i in w until n) {
        sum += a[i]
        if (sum >= x) {
            println(i + 1) // インデックスは0始まりなので+1個
            return
        }
    }

    // 最後まで足しても無理なら
    println("-1")
}