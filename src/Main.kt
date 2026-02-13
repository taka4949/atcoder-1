
import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max

fun main () {
   val l = readLine()!!.toLong()

   val n = l - 1
   var r = 11L

   if(r > n - r) r = n - r //対称性 nCrで12C11=12C1同じ。

   var a = 1L
   for(i in 1.. r){
      a = a * (n - i + 1) / i //約分する箇所（19C8なら11×10×9×8,,）を計算していない
   }
   println(a)
}