import kotlin.math.abs
import kotlin.math.*
import kotlin.math.min
import java.util.*
import java.util.Scanner
import java.util.ArrayList
import java.lang.Math.*
import kotlin.math.max
import java.util.Arrays
fun main() {
        val s = readLine()!!.split(" ")
        val r = s[0].toInt()
        val c = s[1].toInt()

        // 中心(8, 8)からの距離を計算
        // abs()だけで書けるから見た目がスッキリする
        val h = abs(r - 8)
        val v = abs(c - 8)

        // 大きい方の距離（何層目か）を出す
        val x = if (h > v) h else v

        // 奇数なら黒、偶数なら白
        if (x % 2 != 0) {
            println("black")
        } else {
            println("white")
        }
    }


