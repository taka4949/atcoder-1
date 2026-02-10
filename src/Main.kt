//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*

fun main() {
    val input1 = readLine()!!.split(" ")
    val n = input1[0].toInt()
    val m = input1[1].toInt()

    val s = Array(m){ IntArray(0) }
    for(i in 0 until m){
        val l = readLine()!!.split(" ").map { it.toInt() }
        s[i] = l.subList(1,l.size).map{it - 1}.toIntArray()
    }

    val p = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0

    for(bit in 0 until (1 shl n)){
        var a = true
        for(i in 0 until m){
            var counton = 0 // ここで電球を１つ１つカウントリセット
            for(sw in s[i]){
                if(((bit shr sw) and 1 ) == 1){  // andでも（）必須！。 スイッチではなく、ビットシートをスイッチまで動かすイメージ
                    counton ++ //ここでonをカウント
                }
            }
            if(counton % 2 != p[i]){
                a = false
                break
            }
        }
        if(a)
            ans++
    }
    println(ans)
}
//　うえから、００や０１のシートを電球につくスイッチなどがミルフィーユ状ある、それを重ねる。その横に＝あまりが偶数か奇数かを判定する物が付属している。
//　ビット全探索はＮが20以下！、2択