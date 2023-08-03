class Solution {
    // fun solution(n: Int): Int {
    //     var answer = 0
    //     for(i in 0..n step 2) {
    //         answer += i
    //     }
    //     return answer
    // }

    // 다른사람풀이
    fun solution(n: Int) = (0..n).filter { it % 2 == 0 }.sum()
}
