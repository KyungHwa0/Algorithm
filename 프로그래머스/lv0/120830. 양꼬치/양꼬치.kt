class Solution {
    // fun solution(n: Int, k: Int): Int {
    //     val freeK = n / 10
    //     var answer = n * 12000
        
    //     if (k > freeK) {
    //         answer += (k - freeK) * 2000    // answer = answer + (k-freeK)*2000
    //     }
    //     return answer
    // }

    // 다른사람코드1
    fun solution(n: Int, k: Int) = n * 12000 + k * 2000 - ((n / 10) * 2000)
}
