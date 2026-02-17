import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays

fun main () {
    val l1 = readLine()!!.split(" ")
    val h = l1[0].toInt() //4
    val w = l1[1].toInt() // 5
    val n = l1[2].toInt() // カード枚数　2

    val r = IntArray(n)
    val c = IntArray(n)

    for(i in 0 until n){
        val line = readLine()!!.split(" ")
        r[i] = line[0].toInt() // 行と列ごとに分ける
        c[i] = line[1].toInt()
    }
       // 座標圧縮　存在している行列は重複を消す
    val x = r.distinct().sorted() //数の書かれたカードを含まない行が存在するとき、その行のカードを全て取り除き、残りのカードを上へ詰める
    val y = c.distinct().sorted() //数の書かれたカードを含まない列が存在するとき、その列のカードを全て取り除き、残りのカードを左へ詰める

val sb = StringBuilder()

    //圧縮後に、変化後のインデックスの配置を変数に入れる　例　行12345→135へ圧縮→５はインデックス３になる。
    for(i in 0 until n){
        val x1 = x.binarySearch(r[i]) + 1 // bibarysearchはインデックスをさがす
        val y1 = y.binarySearch(c[i]) + 1

        sb.append(x1).append(" ").append(y1).append("\n")
    }
    println(sb)

}

