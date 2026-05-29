import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import kotlin.math.max
import java.util.Arrays
import java.util.ArrayDeque
import kotlin.math.max
import kotlin.system.exitProcess
import java.util.PriorityQueue
import java.util.StringTokenizer
import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.util.HashMap
import java.io.PrintWriter
import kotlin.math.sqrt
import kotlin.Comparator

fun main() {

    val v = readLine()!!.split(" ")
    val n = v[0].toInt()
    val k = v[1].toInt()
    val s = readLine()!!

    var p = 0
    var c = 0
    var a = 0
    var b = 0
    var d = 0

    while(p < n){
        if(s[p] == '1'){
            c ++
            val j = p
            var e = p
            while(e < n && s[e] == '1'){
                e++
            }
            if(c == k - 1){
                a = e - 1//k-1番目の1の塊の最後の番号
            }
            if(c == k){
                b = j//k番目の塊の最初の番号
                d = e - 1
            }
            p = e
        }else{
            p++
        }
    }
    val x = s.substring(0,a + 1)
    val y = s.substring(b,d + 1)
    val z = s.substring(a + 1,b)
    val w = s.substring(d + 1)
    println(x + y + z + w)
}








