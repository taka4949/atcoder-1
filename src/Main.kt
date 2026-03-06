import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays
import java.util.ArrayDeque

fun main() {
 val n = readLine()!!.toInt()
    val s = readLine()!!

    val q = ArrayDeque<Int>()//両端に値を入れられる、筒。問題は追加していく際のみ値の隣に置く操作。
    q.addFirst(n)//逆順。前から入れていくと、割り込みする必要があり、隙間を開ける作業がある。計算量が増加する。

    for(i in n - 1 downTo 0){
        if(s[i] == 'L'){//逆順のため、１２３０なら、２は１のRだが、３のL。3スタートなため。
            q.addLast(i)//親から子グループではなく、子グループから親を作っていく。
        }else{
            q.addFirst(i)
        }
    }
    println(q.joinToString(" "))
    }
//数字がでかいものほど、内側に来る。外から内では割り込みが必須。内から外なら両端に入れるだけで済む！！。