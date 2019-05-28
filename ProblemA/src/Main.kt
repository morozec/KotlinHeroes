/**
 * Created by moro2609 on 28.05.2019.
 * https://codeforces.com/contest/1171/problem/A
 */

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()

private fun getThrowCount(sum:Int):Int =
        if (sum <= 7) 1 else 1 + getThrowCount(sum - 7)


fun main(args: Array<String>){
    val t = readInt()

    for (i in 0..t-1)
        println(getThrowCount(readInt()))
}