import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays

fun main () {
    val l1 = readLine()!!.split(" ")

    val n = l1[0].toInt()
    val q = l1[1].toInt()

    val s = HashSet<Pair<Int,Int>>() // 中身は（１，２）や（２，１）など

    for (i in 0 until q) {
        val line = readLine()!!.split(" ")
        val t = line[0].toInt()
        val a = line[1].toInt()
        val b = line[2].toInt()

        if(t == 1){
            s.add(a to b)
        }else if(t == 2){
            s.remove(a to b)
        }else{
            if(s.contains(a to b) && s.contains(b to a)){
                println("Yes")
            }else{
                println("No")
            }
        }
    }
}

