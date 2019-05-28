import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by moro2609 on 28.05.2019.
 * https://codeforces.com/contest/1171/problem/F
 */

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints

class Segment(val l:Int, val r:Int){}

private fun leftBorder(segment:Segment) = segment.l

private fun getSplit(segments: ArrayList<Segment>) : ArrayList<Int>{
    val sortedSegments = segments.sortedBy({leftBorder(it)})

    var isSplitted = false
    var lastRightBorder = sortedSegments[0].l
    for (s in sortedSegments){
        if (!isSplitted && s.l > lastRightBorder){
            isSplitted = true
            break
        }
        lastRightBorder = maxOf(lastRightBorder, s.r)
    }

    if (!isSplitted) return arrayListOf(-1)
    val splitList = arrayListOf<Int>()
    for (s in segments){
        splitList.add(if (s.l > lastRightBorder) 2 else 1)
    }

    return splitList
}

fun main(args: Array<String>) {
    val t = readInt()
    for (i in 0..t-1){
        val n = readInt()
        val segments = arrayListOf<Segment>()
        for (j in 0..n-1){
            val (l,r) = readInts()
            val segment = Segment(l,r)
            segments.add(segment)
        }
        val split = getSplit(segments)
        println(split.joinToString(separator = " "))
    }

}