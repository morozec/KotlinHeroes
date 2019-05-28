/**
 * Created by moro2609 on 28.05.2019.
 * https://codeforces.com/contest/1171/problem/D
 */

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main(args: Array<String>) {
    var (x,y,z) = readInts()
    var (a,b,c) = readInts()

    //кормим Андрея
    a -= x
    x = 0
    if (a < 0){
        println("NO")
        return
    }

    //кормим Дмитрия
    val dY = minOf(a, y) //сколько из a съест Дмитрий
    y -= dY
    a -= dY
    b -= y
    y = 0
    if (b < 0){
        println("NO")
        return
    }

    val dZ = minOf(a + b, z) //сколько из a и b съест Михаил
    z -= dZ
    c -= z
    z = 0
    if (c < 0){
        println("NO")
        return
    }

    println("YES")

}
