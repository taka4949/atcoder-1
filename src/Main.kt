import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
    val s = readLine()!!.split(" ")
    val h = s[0].toInt()
    val w = s[1].toInt()

    val g = Array(h){readLine()!!}
    val v = Array(h){ BooleanArray(w) }

    var r = 0
    var c = 0

    while(true){
        if(v[r][c]){
            println("-1")
            return
        }
        v[r][c] = true

        if(g[r][c] == 'U' && r != 0){
            r--
        }else if(g[r][c] == 'D' && r != h - 1){
            r++
        }else if (g[r][c] == 'L' && c != 0) {
            c--
        } else if (g[r][c] == 'R' && c != w - 1) {
            c++
        } else {
            println("${r + 1} ${c + 1}")
            return
        }
    }
}

//メインメモリ（RAM）は1本の細長い横線のようなもの。010203,,,10のように横のマスがより近い。
//L!キャッシュで64バイト分もらう。cpuは処理する人、L1キャッシュは机、メインメモリは倉庫。
//そのため、二重ループでは、行のデータを内側に記入する

