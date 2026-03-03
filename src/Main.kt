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
                dfs(c + s[i]) //スタックポインタpush→pop。関数が呼ばれるたびに引数やローカル変数、戻り先をメモする。リターン後は、ここはすでに存在しないため、2文字からスタート。
                u[i] = false //戻り先アドレス。リターン後に実行。ループが最後までいったら、ひとつ前に戻る。
            }
        }
    }　//　RETが存在：RET命令は、スタックの一番上に保存されていた「戻り先のアドレス（番地）」を取り出し、それをPCに上書きする。これで、物理的に「呼び出し元の次の行」へ実行の制御が移る。例ab→aへ。aでfalse→。CPUがチェック→forループへ戻る。i=1から～

    dfs("")
    val l = set.toList().sorted()
    println(l[k - 1])
}
//元の "aa" の箱を改造するのではなく、メモリの別の場所（ヒープ領域）に "aab" という「全く新しい箱」を作成する。stiringは一度作った中身は変更できない。
// 深さ優先探索。例aab→012→021→102→120→201→210。3階層というなら、後ろの階層が最後までおわったら手前に戻り、最後まで進む。


