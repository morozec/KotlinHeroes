/**
 * Created by moro2609 on 28.05.2019.
 * https://codeforces.com/contest/1171/problem/B
 */

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

fun main(args: Array<String>) {
    val (y,b,r) = readInts()
    val res : Int
    if (r <= y + 2 && r <= b +1){
        res = r - 2 + r - 1 + r
    }
    else if (b <= y + 1 && b <= r -1){
        res = b - 1 + b + b + 1
    }
    else {
        res = y + y + 1 + y + 2
    }

    println(res)
}
