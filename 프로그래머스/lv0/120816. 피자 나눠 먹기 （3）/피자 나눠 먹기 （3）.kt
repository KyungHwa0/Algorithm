import kotlin.math.ceil

class Solution {
    fun solution(slice: Int, n: Int): Int {
        return ceil(n.toDouble() / slice).toInt()
    }
}