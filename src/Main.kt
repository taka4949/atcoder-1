import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
  val s = readLine()!!
    val t = readLine()!!

    fun f(x : String) : List<Pair<Char,Int>>{
        val l = mutableListOf<Pair<Char,Int>>()
        var c = x[0]
        var n = 1

        for(i in 1 until x.length){ //ランレングス圧縮
            if(x[i] == c){ //L1キャッシュとcpuのレジスタ
                n++
            }else{
                l.add(Pair(c,n))//ヒープへ値が移動→リストにポインタ（住所）書き込まれる
                c = x[i]
                n = 1
            }
        }
        l.add(Pair(c,n))
        return l // 呼び戻し先に返す。リストは2種類作る必要がある。
    }

    val a = f(s)
    val b = f(t)

    if(a.size != b.size){ //ペアの数＝文字の種類数をチェックして、違う場合
        println("No")
        return
    }
    for(i in a.indices){
        val c1 = a[i].first
        val n1 = a[i].second
        val c2 = b[i].first
        val n2 = b[i].second

        if(c1!=c2){//文字１つ１つをチェックして、違う場合
            println("No")
            return
        }
        if(n1!=n2){//文字の個数が違う場合
            if(n1 < 2 || n1 > n2){ //または、どっちでもNo
                println("No")
                return
            }
        }
    }
    println("Yes")
}