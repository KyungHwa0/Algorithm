class Solution {
    fun solution(n: Int): Int {
        return n / 7 + if (n % 7 > 0) 1 else 0
    }
}