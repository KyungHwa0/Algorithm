class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var n: Int = 0        
        answer = numbers
        
        for(a in numbers) {
            answer.set(n, a*2)
            n++
        }
        
        return answer
    }
}