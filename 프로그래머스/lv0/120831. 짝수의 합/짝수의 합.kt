class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for(i in 0..n step 2) {
            answer += i
        }
        return answer
    }
}