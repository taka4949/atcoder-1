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


    fun main() {
        val (n,m) = readLine()!!.split(" ").map { it.toInt() }

        val g = Array(n + 1){mutableListOf<Int>()}
        repeat(m){
            val(a,b) = readLine()!!.split(" ").map { it.toInt() }
            g[a].add(b)
        }
        val v = BooleanArray(n + 1)
        val stack = ArrayDeque<Int>()
        var count = 0

        stack.push(1)
        v[1] = true
        count++

        while(stack.isNotEmpty()){
            val u = stack.pop()

            for(next in g[u]){
                if(!v[next]){
                    v[next] = true
                    count++
                    stack.push(next)
                }
            }
        }
        println(count)

        }



