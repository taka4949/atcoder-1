import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
    val inStr = readLine()!!.split(" ")
    val s = inStr[0]
    val k = inStr[1].toInt()

    val set = mutableSetOf<String>()
    val u = BooleanArray(s.length)

    fun dfs(c: String) {
        if (c.length == s.length) {
            set.add(c)
            return
        }
        for (i in 0 until s.length) {
            if (!u[i]) {
                u[i] = true
                dfs(c + s[i]) //スタックポインタの巻き戻し。リターン後は、ここはすでに存在しないため、2文字からスタート。
                u[i] = false //戻り先アドレス。リターン後に実行。ループが最後までいったら、ひとつ前に戻る。
            }
        }
    }

    dfs("")
    val l = set.toList().sorted()
    println(l[k - 1])
}


// 深さ優先探索。例aab→012→021→102→120→201→210。3階層というなら、後ろの階層が最後までおわったら手前に戻り、最後まで進む。


