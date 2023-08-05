class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var even = 0
        var odd = 0

        for (num in num_list) {
            if (num % 2 == 0) {
                even++
            } else {
                odd++
            }
        }
        return intArrayOf(even, odd)
    }
}