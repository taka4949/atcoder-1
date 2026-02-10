//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main() {
    val s = readLine()!!
    val n = s.length
    if (n == 0) {
        println(0)
        return
    }

    val v = mutableListOf<Int>()
    val l = mutableListOf<Int>()
    var i = 0
    while (i < n) {
        var j = i
        while (j < n && s[j] == s[i]) {
            j++
        }
        v.add(s[i] - '0')
        l.add(j - i)
        i = j
    }

    var a: Long = 0
    for (k in 0 until v.size - 1) {
        if (v[k] + 1 == v[k + 1]) {
            val m = if (l[k] < l[k + 1]) l[k] else l[k + 1]
            a += m.toLong()
        }
    }
    println(a)
}
