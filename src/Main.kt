import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays

fun main() {
 val n = readLine()!!.toInt()
 val x = IntArray(n)
 val y = IntArray(n)

 for(i in 0 until n){
  val p = readLine()!!.split(" ")
  x[i] = p[0].toInt()
  y[i] = p[1].toInt()
 }

 val s = readLine()!!

 val r = mutableMapOf<Int,Int>()//必要最低限の情報だけをほしい場合。データが少ない。
 val l = mutableMapOf<Int,Int>()//グループで分けたいときに使用する。

 for(i in 0 until n){
  val x1 = x[i]
  val y1 = y[i]
  val d = s[i]

  if(d == 'R'){
   r[y1] = min(r.getOrDefault(y1,Int.MAX_VALUE) ,x1)
  }else{
   l[y1] = max(l.getOrDefault(y1,Int.MIN_VALUE),x1)
  }
 }

 var ans = "No"
 for(y1 in r.keys){
  if(l.contains(y1)){
   val r1 = r[y1]!!//マップの値にはnullではない！！演算子を使用
   val l1 = l[y1]!!
   if(r1 < l1){
    ans = "Yes"
    break
   }
  }
 }
 println(ans)
}