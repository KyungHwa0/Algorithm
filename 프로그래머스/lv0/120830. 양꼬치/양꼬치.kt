class Solution {
    fun solution(n: Int, k: Int): Int {
        val freeK = n / 10
        var answer = n * 12000
        
        if (k > freeK) {
            answer += (k - freeK) * 2000    // answer = answer + (k-freeK)*2000
        }
        return answer
    }
}