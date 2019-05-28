import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by moro2609 on 28.05.2019.
 * https://codeforces.com/contest/1171/problem/C
 */

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

private fun isGoodStr(str: String):Boolean {
    var areSameLetters = true
    for (i in 1..str.length-1){
        if (str[i] != str[i-1]){
            areSameLetters = false
            break
        }
    }
    return !areSameLetters
}

private fun getGoodString(str:String):String{
    if (!isGoodStr(str)){
        return "-1"
    }
    val charArr = str.toCharArray()
    charArr.sort()
    return charArr.joinToString(separator = "")
}


fun main(args: Array<String>) {
    val n = readInt()
    for (i in 0..n-1){
        val str = readLn()
        println(getGoodString(str))
    }


}
