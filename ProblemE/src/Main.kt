import java.util.*
import kotlin.collections.HashMap

/**
 * Created by moro2609 on 28.05.2019.
 * https://codeforces.com/contest/1171/problem/E
 */

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints



fun main(args: Array<String>) {
    val n = readInt()
    val str = readLn()

    if (n == 1){
        println("Yes")
        return
    }

    val letters = hashSetOf<Char>()
    var hasSomeSameLetters = false
    for (c in str){
        if (letters.contains(c)){
            hasSomeSameLetters = true
            break
        }
        letters.add(c)
    }


    println(if (hasSomeSameLetters) "Yes" else "No")
}
