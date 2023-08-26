import kotlin.math.ceil

class Solution {
    // fun solution(slice: Int, n: Int): Int {
    //     return ceil(n.toDouble() / slice).toInt()
    // }

    // 다른사람 코드
    // fun solution(slice: Int, n: Int) = n / slice + if (n % slice > 0) 1 else 0

    // 다른사람코드
    fun solution(slice: Int, n: Int) = ceil(n / slice.toDouble())
}
